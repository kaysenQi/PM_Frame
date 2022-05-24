package DesignPattern.Singtonle;

public class Singtonle01 {

    public static void main(String[] args) {

        System.out.println("饿汉式,静态变量类型的");

        Singtonle011 i01 = Singtonle011.getInstance();
        Singtonle011 i02 = Singtonle011.getInstance();

        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

//饿汉式(静态变量)

class Singtonle011 {

    private Singtonle011 () { }

    private final static Singtonle011 s = new Singtonle011();

    public static Singtonle011 getInstance() {
        return s;
    }
}

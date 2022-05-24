package DesignPattern.Singtonle;

public class Singtonle02 {

    public static void main(String[] args) {

        System.out.println("饿汉式,静态代码块");

        Singtonle022 i01 = Singtonle022.getInstance();
        Singtonle022 i02 = Singtonle022.getInstance();

        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

//饿汉式(静态代码块形式)

class Singtonle022 {

    private Singtonle022() {

    }

    private static Singtonle022 Instance;

    static {
        Instance = new Singtonle022();
    }

    public static Singtonle022 getInstance() {
        return Instance;
    }


}

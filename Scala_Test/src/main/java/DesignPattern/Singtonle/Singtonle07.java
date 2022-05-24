package DesignPattern.Singtonle;

public class Singtonle07 {

    public static void main(String[] args) {

        System.out.println("用静态内部类的方式去实例化一个对象---推荐使用");

        Singtonle077 i01 = Singtonle077.getInstance();
        Singtonle077 i02 = Singtonle077.getInstance();

        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

class Singtonle077 {

//    private Singtonle077 instance;
//    private Singtonle077 () { }
//
//     static Singtonle077 SingtonleGetinstance {
//        Singtonle077 instance = new Singtonle077();
//    }
//
//    public static Singtonle077 getInstance() {
//        return
//    }

    private Singtonle077 () { }

    private static class SingtonleGetinstance {

        public static final Singtonle077 s = new Singtonle077();
    }

    public static Singtonle077 getInstance() {
        return SingtonleGetinstance.s;
    }

}

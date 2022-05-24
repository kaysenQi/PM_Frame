package DesignPattern.Singtonle;

public class Singtonle05 {

    public static void main(String[] args) {

        System.out.println("懒汉式,同步线程在方法的代码块中");

        Singtonle055 i01 = Singtonle055.getInstance();
        Singtonle055 i02 = Singtonle055.getInstance();
        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

//同步代码升级版

//这种看似可以缓冲,但是还是解决不了问题,照样会产生线程安全的问题,比如,如果AB线程同时都到if

class Singtonle055 {

    private Singtonle055() { }

    private static  Singtonle055 instance;

    public static Singtonle055 getInstance() {

        if (instance == null) {

           synchronized (Singtonle055.class) {
                instance = new Singtonle055();
            }
        }

        return instance;

    }

}

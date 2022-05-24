package DesignPattern.Singtonle;

public class Singtonle06 {

    public static void main(String[] args) {

        System.out.println("Double-Check 双重检查模式  推荐使用的懒汉式的一种");

        Singtonle066 i01 = Singtonle066.getInstance();
        Singtonle066 i02 = Singtonle066.getInstance();

        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

//Double-Check 双重检查模式
//注意Double-Check 用了volatile 和 synchronized 和 双重if

class Singtonle066 {

    private static volatile Singtonle066 instance;

    private Singtonle066() { }

    public static Singtonle066 getInstance() {

        if (instance == null) {

            synchronized(Singtonle066.class) {
                if (instance == null) {
                    instance = new Singtonle066();
                }
            }

        }

        return instance;
    }



}

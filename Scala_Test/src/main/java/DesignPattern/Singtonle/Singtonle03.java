package DesignPattern.Singtonle;

public class Singtonle03 {

    public static void main(String[] args) {

        System.out.println("懒汉式,线程不安全模式");

        Singtonle033 i01 = Singtonle033.getInstance();
        Singtonle033 i02 = Singtonle033.getInstance();

        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

//懒汉式(线程不安全)
//如果是多线程访问的话,每个线程都去new了一个实例
//在多线程环境下容易产生多个实例,所以多线程下是线程不安全的

class Singtonle033 {

    private Singtonle033() {
    }

    private static Singtonle033 Instance;

    public static Singtonle033 getInstance() {

        if (Instance == null) {
            Instance = new Singtonle033();
        }

        return Instance;
    }

}

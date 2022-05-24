package DesignPattern.Singtonle;

public class Singtonle04 {

    public static void main(String[] args) {

        System.out.println("懒汉式,同步线程模式");

        Singtonle044 i01 = Singtonle044.getInstance();
        Singtonle044 i02 = Singtonle044.getInstance();

        System.out.println(i01 == i02);
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

    }
}

//懒汉式,同步线程模式
//这种可以避免线程不安全问题,因为每次get一次,就会同步下实例对象,但是这样会造成效率低的问题
//因为每次都要同步一下,效率会很低

class Singtonle044 {

    private Singtonle044 () {}

    private static Singtonle044 instance;

    public static synchronized Singtonle044 getInstance() {

        if (instance == null) {
            instance = new Singtonle044();
        }

        return instance;

    }

}

package DesignPattern.Singtonle;

public class Singtonle08 {

    public static void main(String[] args) {

        System.out.println("用枚举enum的方式去创建一个实例化的对象");

        Singtonle088 i01 = Singtonle088.INSTANCE;
        Singtonle088 i02 = Singtonle088.INSTANCE;

        System.out.println(i01 == i02);
        i01.sayHello();
        System.out.println(i01.hashCode());
        System.out.println(i02.hashCode());

        System.out.println("用枚举的方式构建一个实例化对象真的是太简单啦啦拉拉啊啦啦!!!!!!");

        Runtime

    }
}

//单例模式推荐8,  用枚举的方式去创建一个实例

enum Singtonle088 {

    INSTANCE;
    public void sayHello(){
        System.out.println("你好....");
    }

}
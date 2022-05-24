package Apr16;

public class Inter_Gregration_Princle {

    public static void main(String[] args) {

        A a = new A();
        a.depends1(new B());

    }
}

interface Interface1 {

    void operation1();
}

interface Interface2 {

    void operation2();
    void operation3();
}

interface Interface3 {

    void operation4();
    void operation5();
}

interface Interface4 {

    void operation6();
    void operation7();
    void operation8();
}

interface Interface5 {

    void operation11();
    void operation12();
    void operation13();
}


class B implements Interface1, Interface2, Interface4 {


    @Override
    public void operation1() {
        System.out.println("B类 实现接口1,2  operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B类 实现接口1,2 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B类 实现接口1,2 operation3");
    }

    @Override
    public void operation6() {
        System.out.println(" B类有添加实现的接口4 operation678");
    }

    @Override
    public void operation7() {
        System.out.println("B类,这是又添加实现的接口4  operation678");
    }

    @Override
    public void operation8() {
        System.out.println("B类, 这是又添加实现的接口4  operation678");
    }
}

class D implements Interface1, Interface3, Interface5{

    @Override
    public void operation1() {
        System.out.println("D类 去实现接口1,2 operation1方法");
    }

    @Override
    public void operation4() {

        System.out.println("D类 去实现接口1,2 operation4方法");
    }

    @Override
    public void operation5() {

        System.out.println("D类 去实现接口1,2 operation5方法");
    }

    @Override
    public void operation11() {
        System.out.println("-----这是Interface5,实现的结果-----");
    }

    @Override
    public void operation12() {
        System.out.println("-----这是Interface6,实现的结果-----");
    }

    @Override
    public void operation13() {
        System.out.println("-----这是Interface7, 实现的结果-----");
    }
}

class A {

    public void depends1(Interface1 i ){
        i.operation1();
    }

    public void depends2(Interface2 i ) {
        i.operation2();
    }

    public void depends3(Interface2 i) {
        i.operation3();
    }

    public void depends7(Interface5 i) {
        i.operation11();
        i.operation12();
        i.operation13();
    }

    public void depends4(Interface4 i) {
        i.operation6();
        i.operation7();
        i.operation8();
    }
}


class C {

    public void depends1 (Interface1 i) {
        i.operation1();
    }

    public void depends4(Interface3 i) {
        i.operation4();
    }

    public void depends5 (Interface3 i) {
        i.operation5();
    }
}


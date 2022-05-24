public class Strategic_design {

    public static void main(String[] args) {

        Basesay us = new UserSay();
//        us.setiSay(new flat_SayHi());
//        us.SayHi(new flat_SayHi(new));
//        us.SayHi(new flat_SayHi(new flat_SayHi()));

        //先给new出来的us对象,固定一个它自己特有的方法
        us.setiSay(new flat_SayHi());
        us.SayHi("hahahahahha,这里传进去的是不同类型的不同方式");
    }

}

abstract class Basesay{

//    public abstract void say();  将可变的行为,抽象出来,用一系列的算法去实现

    // 把接口抽象出来,定义成属性
    private ISay iSay;

    //通过set方法去选择不同的实现的算法
    public void setiSay(ISay iSay) {
        this.iSay = iSay;
    }

    public void SayHi(String data){
        System.out.println("不同鸭子学SayHi");
        iSay.sayHi(data);
        System.out.println("鸭子叫完了,回巢");
    }

}

class UserSay extends Basesay{

}

//把可变的抽象出来
interface ISay {
    void sayHi(String data);
}

class blue_SayHi implements ISay{

    @Override
    public void sayHi(String data) {
        System.out.println("蓝头鸭子,嘎嘎嘎" + data);
    }
}

class gree_SayHi implements ISay{

    @Override
    public void sayHi(String data) {
        System.out.println("绿头鸭,吱吱吱吱吱吱" + data);
    }
}

class flat_SayHi implements ISay{

    @Override
    public void sayHi(String data) {
        System.out.println("扁头鸭子,不会叫......" + data);
    }
}

/*class gree_say extends say{

    //这种方法实现,每次都要去实现一个类,代码容易重复
    @Override
    public void say() {
        System.out.println("绿头鸭,嘎嘎嘎嘎");
    }
}

class blue_say extends say{

    @Override
    public void say() {
        System.out.println("蓝头鸭子,滋滋滋吱吱吱吱");
    }
}*/


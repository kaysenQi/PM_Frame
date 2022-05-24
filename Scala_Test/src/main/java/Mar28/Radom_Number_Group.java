package Mar28;

import java.util.Random;

public class Radom_Number_Group {

    public static void main(String[] args) {

        //生成一个 1-32 的数组  (大数组)
        int[] ballCount =new int[32];

        for (int i = 0; i <ballCount.length; i++) {
            ballCount[i] = i + 1;
        }

        //准备接收的空数组(小数组)
        int[] redBall = new int[6];

        //调用方法,返回一个int类型数组
        int[] group = Radom_Group(ballCount, redBall);
        for (int i = 0; i <group.length; i++) {
            System.out.println(group[i]);
        }

    }

    //从32个数中,随机生成6个不同的数字为一组
    public static int[] Radom_Group(int[] ballCount, int[] redBall) {

        Random r = new Random();
        int index = -1;
        /*
        * 算法实现原理:
        * 1.生成1-32之间的随机数
        * 2.将生成的随机数字与大数组中的最后一位元素进行调换位置,避免重复
        * 3.减短随机数生成的范围ballCount.length - 1 -i 将已经获取在1-32之间的数字 放入最后面,避免小数组取到
        * 4.循环放入空数组(小数组)
        * */
        for (int i = 0; i < redBall.length; i++) {

            index = r.nextInt(ballCount.length - i);
            redBall [i] = ballCount[index];

            int temp = ballCount[index];
            ballCount[index] = ballCount[ballCount.length - 1];
            ballCount[ballCount.length -1-i] = temp;

        }

        return redBall;

    }
}

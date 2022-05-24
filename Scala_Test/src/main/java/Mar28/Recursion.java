package Mar28;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(recursion_method(31));

        /*System.out.println(general_recursion(100));*/

    }

    public static int recursion_method(int num){
        if (num == 1) return 1;
        return num * recursion_method(num - 1);
    }

    public static int general_recursion(int num){
        int result = num;
        int i = num - 1;
        do {
            result = result * i;
            i--;
        }while (i > 1);
        return result;
    }
}

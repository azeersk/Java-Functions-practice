import java.util.Scanner;

public class calculateClass {
    public static int powerOf(int num, int por){
        if(num!=0){
            return (num * powerOf(num, por - 1));
        }
        else{
            return 1;
        }

    }

    public static void main(String[] args){
        // calculate the power using recursion
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(powerOf(a,b));

    }
}

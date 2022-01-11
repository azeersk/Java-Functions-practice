public class naturalClass{
    public static int natural(int a){
        if(a==0){
            return 0;
        }
        return a + natural(a-1);

    }

    public static int factorialOf(int f){
        if(f==0){
            return 1;
        }
        return f*factorialOf(f-1);
    }
    public static void main(String[] args){
        //Find the Sum of Natural Numbers using Recursion
        int n = 20;
        System.out.println("Sum of the natural numbers: "+natural(n));

        //Find Factorial of a Number Using Recursion
        int f = 6;
        System.out.println("factorial of a number: "+factorialOf(f));
    }
}

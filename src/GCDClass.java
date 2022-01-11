public class GCDClass {
    public static int GCD(int a, int b){
        if(b!=0){
            return GCD(b,a%b);
        }
        else
            return a;
    }

    public static String reverseOf(int b){
        String a = "this is my country";
        if (a.isEmpty())
            return a;

        //return reverseOf(a.substring(1)) + a.charAt(0);
        return a;

    }
    public static void main(String[] args){
        //Find G.C.D Using Recursion
        int a = 100;
        int b = 250;
        System.out.println("Greatest Common Divisor: "+GCD(a,b));
    }
}

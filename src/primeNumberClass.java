public class primeNumberClass {
    public static void Prime(){
        int pFirst = 12, pSecond = 56;
        System.out.print("prime numbers are: ");
        for(int i=pFirst; i<pSecond; i++){
            boolean p = true;
            for(int j=2; j<i; j++){
                if(i%j==0)
                    p = false;
            }
            if (p)
                System.out.print(i+" ");

        }
    }


    public static void main(String[] args){
        //Display Prime Numbers Between Intervals Using Function
        Prime();
        System.out.println();

    }
}

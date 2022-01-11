public class ArmstrongClass {
    public static void Armstrong() {
        int ArmFirst = 100, ArmSecond = 1500;
        System.out.print("Armstrong Numbers: ");
        for (int i =ArmFirst; i<ArmSecond; i++){
            String aSt = Integer.toString(i);
            double a = 0.0;
            for(int j=0; j<aSt.length(); j++){
                int aIn = Integer.parseInt(String.valueOf(aSt.charAt(j)));
                a = a+Math.pow(aIn,aSt.length());
            }
            if(a==i){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){

        //Display Armstrong Numbers Between Intervals Using Function
        Armstrong();
    }
}

import java.util.ArrayList;

public class SumOfPrimeNumbers {

    public static void sumPrime(){
        int Num = 34;
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=2; i<34; i++){
            boolean prime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if (prime)
                array.add(i);
        }
        for(int k=0; k<array.size(); k++){
            for(int l=0; l<array.size(); l++){
                if (array.get(l)<((Num/2)+3)) {
                    if (array.get(k) + array.get(l) == 34)
                        System.out.println(array.get(k) + " + " + array.get(l) + " = " + Num);
                }
            }
        }
    }
    public static void  main(String[] args){
        //Check Whether a Number can be Expressed as Sum of Two Prime Numbers
        sumPrime();
    }
}

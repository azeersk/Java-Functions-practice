import java.util.Arrays;

public class matricesClass {
    public static void main(String[] args){
        //Add Two Matrix Using Multi-dimensional Arrays
        int[][] arr1 = {{1,2,3,4},{5,6,7,8}};
        int[][] arr2 = {{3,2,4,5},{8,6,7,9}};
        int[][] sumOf = new int[4][4];
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                sumOf[i][j] = arr1[i][j]+ arr2[i][j];
            }
        }

        System.out.print ("Sum of multi dimensional array: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                System.out.print(sumOf[i][j]+" ");
            }
            System.out.println();
        }
        int[] nArray = {12,23,34,45,56,67,78,89,90};
        System.out.print("multi dimensional array elements: ");
        for(int element:nArray){
            System.out.print(element+" ");
        }


    }
}

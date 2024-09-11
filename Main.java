import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int NumArr[] = new int[5];
        int CopyArr[] = new int[5];
        int num = 0;

        System.out.println("Please enter 5 integers");
        for (int i = 0; i < NumArr.length; i++){
            num = in.nextInt();
            NumArr[i] = num;

        }

        CopyArr = Arrays.copyOf(NumArr, NumArr.length );
        

        for (int i = 1; i < CopyArr.length ; i++){
            CopyArr[i] = CopyArr[i-1] + CopyArr[i];
        }

        
        
        printarr(NumArr);
        printarr(CopyArr);

        in.close();
        
    }

    public static void printarr(int arr[]){
        
        System.out.println('\n');
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }

    }
}
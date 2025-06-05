import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positiveInt = 0;
        int negativeInt = 0;
        int zero = 0;
        int n = arr.size();
        
        for(int number : arr){
            if(number>0){
                positiveInt++;
            }
            else if(number<0){
                negativeInt++;
            }
            else{
                zero++;
            }
        }
        
        System.out.printf("%.6f%n", (double) positiveInt / n);
        System.out.printf("%.6f%n", (double) negativeInt / n);
        System.out.printf("%.6f%n", (double) zero / n);
        
    }

}

public class plusMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

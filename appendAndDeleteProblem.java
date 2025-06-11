import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        int common = 0;
        
        for(int i = 0 ; i < Math.min(s.length(), t.length()) ; i++) {
            if(s.charAt(i) == t.charAt(i)) {
                common++;
            }
            else {
                break;
            }
        }
        
        int operations = (s.length() - common) + (t.length() - common);
        
        if(operations == k) {
            return "Yes";
        }
        else if(k > operations) {
            if((k - operations) % 2 == 0 || k > s.length()+t.length()) {
            return "Yes";
            }
        else {
            return "No";
        }
      }
      else { 
        return "No";
      }
   }
}

public class appendAndDeleteProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

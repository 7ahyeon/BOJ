import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            if (0 < a && b < 10) {
                System.out.println(a-b);
                break;
            } else {
                return;
            }
        }
    }
}
import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= t; ++i) {
            final int dimension = in.nextInt();
            String path = in.next();
            path = path.replace('S', '1');
            path = path.replace('E', 'S');
            path = path.replace('1', 'E');
            System.out.println("Case #" + i + ": " + path);
        }
    }
}

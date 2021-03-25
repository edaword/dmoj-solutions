
package usaco21febb1;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Usaco21febb1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        int n = readInt(); 
        Map<String, String> year = new HashMap<>(); Map<String, Integer> age = new HashMap();
        year.put("Bessie", "Ox"); age.put("Bessie",0);
        List<String> zodiac = Arrays.asList("Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat");
        for (int i = 1; i <= n; i++) {
            String[]s = readLine().split(" ");
            String y = year.get(s[7]); int tmp = age.get(s[7]);
            int id = zodiac.indexOf(y);
            if (s[3].equals("previous")) {
                if(y.equals(s[4])) {
                    tmp += 12;
                }
                while(!zodiac.get(id).equals(s[4])) {
                    id--; tmp++;
                    if (id < 0) {
                        id += 12;
                    }
                }
            } else {
                if (y.equals(s[4])) {
                    tmp -= 12;
                }
                while (!zodiac.get(id).equals(s[4])) {
                    id++; tmp--;
                    if (id >= 12) {
                        id -=12;
                    }
                }
            }
            year.put(s[0], s[4]);
            age.put(s[0], tmp);
        }
        System.out.println(Math.abs(age.get("Bessie") - age.get("Elsie")));
    }
    static String next() throws IOException {
        while (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
}

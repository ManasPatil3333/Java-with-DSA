import java.util.Scanner;
import java.util.StringJoiner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        for (int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(frontChar, backChar);
            sb.setCharAt(backChar, frontChar);
        }
        System.out.println(sb);
    }
}

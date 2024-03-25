public class Backtracking {
    public static void printCases(String str, String cases, int index) {
        if(str.length() == 0) {
            System.out.println(cases);
        }
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printCases(newStr, cases+currChar, index+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABCD";
        printCases(str, "" ,0);
    }
}
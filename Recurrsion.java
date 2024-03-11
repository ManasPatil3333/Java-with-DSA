import java.util.Scanner;

public class Recurrsion { 
    public static void printNumberRev(int num) {
        if (num == 0) {
            return;
        }
        System.out.printf("%d ",num);
        printNumberRev(num-1);
    }
    public static void printNumber(int num) {
        if (num > 5) {
            return;
        }
        System.out.printf("%d ",num);
        printNumber(num+1);
    }
    public static void printSum(int num, int lastNum, int sum) {
        if (num == lastNum) {
            sum += num;
            System.out.println(sum);
            return;
        }
        sum += num;
        printSum(num+1, lastNum, sum);
    }
    public static void factorial(int firstNum, int lastNum, int product) {
        if (firstNum == lastNum) {
            product *= firstNum;
            System.out.println(product);
            return;
        }
        product *= firstNum;
        factorial(firstNum+1, lastNum, product);
    }
    public static int fibonacci(int num) {
        if (num == 1 || num == 0) {
            if(num == 1) {
                return 1;
            }
            if (num == 0) {
                return 1;
            }
        }
        int num1 = fibonacci(num-1);
        int num2 = fibonacci(num-2);
        int res = num1 + num2;
        return res;
    }
    public static void printRev(int index, String str) {
        if (index == 0) {
            return;
        }
        System.out.printf("%c",str.charAt(index-1));
        printRev(index-1, str);
    }
    public static void countRepEle(int index, String str, char element) {
        int count = 0;
        char currChar = str.charAt(index-1);
        if (index == 0) {
            return;
        }
        if (currChar == element) {
            System.out.printf("The first occurence of %s is at index %d.",element,index);
            count++;
            if (count == 2) {
                return;
            }
        }
        countRepEle(index-1, str, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question no.1 :
        /*
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        printNumberRev(num);
        */
        // Question no.2 :
        /* 
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        printNumber(num);
        */
        // Question no.3 :
        /* 
        int num = 1;
        System.out.print("Enter last number : ");
        int lastNum = sc.nextInt();
        int sum = 0;
        printSum(num, lastNum, sum);
        */
        // Question no.4 :
        /* 
        int firstNum = 1;
        System.out.print("Enter last number : ");
        int lastNum = sc.nextInt();
        int product = 1;
        factorial(firstNum, lastNum, product);
        */
        // Question no.5 :
        /*
        System.out.print("Enter last number : ");
        int lastNum = sc.nextInt();
        int result = fibonacci(lastNum);
        System.out.println(result);
        */
        // Question no.6 :
        /*
        System.out.println("Enter a text :");
        String str = sc.nextLine();
        int index = str.length();
        printRev(index, str);
        */
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        int index = str.length();
        char element = 'a';
        countRepEle(index, str, element);
    }
}

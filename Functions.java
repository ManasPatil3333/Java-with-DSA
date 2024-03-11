import java.util.Scanner;
import javax.swing.plaf.synth.SynthLookAndFeel;
public class Functions {
    /* 
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
    */
    //Question no.1 :
    /* 
    public static int calculateSum (int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }
    public static int calculateProduct (int num1,int num2) {
        int product = num1*num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter 1 for 'addition & 2 for 'Multiplication' :");
        System.out.println("Enter Your choice :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            int res1 = calculateSum(num1, num2);
            System.out.printf("Sum of two number is %d",res1);
                break;
            case 2:
            int res2 = calculateProduct(num1, num2);
            System.out.printf("Sum of two number is %d",res2);
            break;
            default:
            System.out.println("Invalid choice!");
                break;
        }
    }
    */
    //Question no.2 :
    /* 
    public static int factorial(int num) {
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int res = factorial(num);
        System.out.printf("Factorial of %d : %d",num,res);
    }
    */  
    // Question : Enter 3 numbers from the user & make a function to print their average.
    /* 
    public static int calculateAverage(int num1, int num2, int num3) {
        int average = (num1+num3+num2)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();
        int res = calculateAverage(num1, num2, num3);
        System.out.printf("Average of %d, %d & %d is %d",num1,num2,num3,res);
    }
    */
    // Question : Write a function to print the sum of all odd numbers from 1 to n.
    /* 
    public static int sumOfOddNum(int num) {
        int sum = 0;
        for (int i=1; i<=num ; i++) {
            if (i%2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ; ");
        int num = sc.nextInt();
        int res = sumOfOddNum(num);
        System.out.printf("Sum of all odd number from 1 to %d is %d",num,res);
    }
    */
    // Question : Write a function which takes in 2 numbers and returns the greater of those two.
    /*
    public static int greaterNum(int num1, int num2) {
        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int res = greaterNum(num1, num2);
        System.out.printf("Greater number among %d and %d is %d",num1,num2,res);
    }
    */
    // Question : Write a function that takes in the radius as input and returns the circumference of a circle.
    /*
    public static double circumference(float radius) {
        double circum = 2*3.14*radius;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float radius = sc.nextFloat();
        double res = circumference(radius);
        System.out.printf("Circumference of the circle is %f",res);
    }
    */
    // Question : Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    /* 
    public static void eligiblility(int age) {
        if (age >= 18) {
            System.out.println("You are eligile to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        eligiblility(age);
    }
    */
    // Question : Write an infinite loop using do while condition.
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 1;
        do {
            System.out.println("hello!");
        } while (m == 1);
    }
    */
    // Question : Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    /*  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times user want to take output :");
        int inputCount = sc.nextInt();
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        for (int i=1; i<=inputCount; i++) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if (num == 0) {
                countZeros++;
            } else if (num > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        System.out.printf("Positive numbers : %d\nNegative numbers : %d\nZeroes : %d",countPositive,countNegative,countZeros);
    }
    */
    // Question : Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    /*
    public static void calculatePower(int num, int degree) {
        double res = Math.pow(num,degree);
        System.out.printf("%d ^ %d = %.0f",num,degree,res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter power : ");
        int degree = sc.nextInt();
        calculatePower(num, degree);
    }
    */
    // Question : Write a function that calculates the Greatest Common Divisor of 2 numbers
    /* 
    public static int calculateGCD(int num1, int num2) {
        int min = 0;
        for (int i=1; i<num1; i++) {
            if (num1%i==0 && num2%i==0) {
                if (min < i) {
                    min = i;
                }
                }
            }
            return min;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int res = calculateGCD(num1, num2);
        System.out.printf("GCD of %d & %d is %d",num1,num2,res);
    }
    */
    // Question : Write a program to print Fibonacci series of n terms where n is input by user :0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    /* 
    public static int fiboSeries(int num) {
        if (num == 0 || num == 1) {
            if (num == 0) {
                return 0;
            }
            if (num == 1) {
                return 1;
            }
        }
            int fiboNum1 = fiboSeries(num-1);
            int fiboNum2 = fiboSeries(num-2);
            int fibo = fiboNum1 + fiboNum2;
            return fibo;       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int res = fiboSeries(num);
        System.out.printf("Fibonacci series of %d is %d",num,res);
    }
    */
}

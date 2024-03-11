import java.util.Calendar;
import java.util.Scanner;

public class Hackerrank1 {
    /* 
    static int B,H;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breadth : ");
        B = sc.nextInt();
        System.out.print("Enter height : ");
        H = sc.nextInt();
        try  {
            if (B<=0 || H<=0) {
                throw new Exception("Breadth amd height should be positive.");
            }
        }
        catch (Exception e) {
            System.out.println(e);
            System.exit(0);
            // TODO: handle exception
        }
    }
    */
    public static String solution(int year, int month, int day) {
        String[] dayOfWeek = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek[dayNum-1];
    }
    public static void main(String[] args) {
        //Question no.1 :
        /* 
        if (flag) {
            int area = B*H;
            System.out.println(area);
        }
        */
        //Question no.2 :
        /* 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        if (num == Integer.parseInt(str)) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Unsuccessful Termination");
        }
        */
        // Question no.3 :
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        System.out.print("Enter date : ");
        int day = sc.nextInt();
        String dayName = solution(year, month, day);
        System.out.println("Day : "+dayName);
        */
    }
}

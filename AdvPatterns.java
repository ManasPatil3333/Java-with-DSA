public class AdvPatterns {
    public static void main(String[] args) {
        /*
        pattern output :

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

        program :
        
        int m = 4;
        int n = 4;
        for (int i=1; i<=m; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=(n-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=(n-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        pattern output :

            *****
           *****
          *****
         *****
        *****

        program :
        
        int m = 5;
        int n = 5;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        pattern output :

            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5

        program :
        
        int m = 5;
        int num = 0;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
            num++;
            for (int j=1; j<=i; j++) {
                System.out.printf("%d ",num);
            }
            System.out.println();
        }

        pattern output :

                1 
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4 
        5 4 3 2 1 2 3 4 5

        program :
        
        int m = 5;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=(m-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.printf("%d ",j);
            }
            for (int j=2; j<=i; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }

        pattern output :

           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
           
        program :
        
        int m = 4;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=m; i>=1; i--) {
            for (int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        pattern output : 

              1
            2   2
          3       3
        4 4 4 4 4 4 4

        program :
        /* */
        int m = 3;
        int n = 2;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=(m+1-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=1; j++) {
                System.out.printf("%d",i);
            }
            for (int j=1; j<=(i-1)*4-1; j++) {
                System.out.print(" ");
            }
            if (i!=1) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int k=1; k<=7; k++) {
            System.out.print("4 ");
        }
    }
}


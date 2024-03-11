public class Patterns {
    public static void main(String[] args) {
        /* 
        pattern output :

        *****
        *****
        *****
        *****

        program :
        
        int m = 4;
        int n = 5;
        for (int i=1; i<=m ; i++ ) {
            for (int j=1 ; j<=n ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        pattern output :

        *****
        *   *
        *   * 
        *****

        program :
        
        int m = 4;
        int n = 5;
        for (int i=1 ; i<=m ; i++) {
            if (i==2 || i==3) {
                for (int j=1 ; j<=n ; j++) {
                    if (j==2 || j==3 || j==4) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (int k=1 ; k<=n ;k++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        alternate way :

        int m = 4;
        int n = 5;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (i==1 || i==m || j==n || j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
        pattern output :

        *
        **
        *** 
        **** 
        
        program :
        
        int m = 4;
        int n = 4;
        for (int i=1; i<=m ; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        pattern output :

        *****
        **** 
        *** 
        ** 
        *

        program :
        
        int m = 5;
        int n = 5;
        for (int i=0; i<m ; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        pattern output :

            * 
           ** 
          ***
         **** 
        *****

        program :
        
        int m = 5;
        int n = 5;
        for (int i=1; i<=m ; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        pattern output :

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        
        int n = 5;
        for (int i=1; i<=n; i++) {
            int m = 1;
            for (int j=1; j<=i; j++) {
                System.out.printf(" %d",m);
                m++;
            }
            System.out.print("\n");
        }
        
        pattern output :

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

        program :
        
        int n = 5;
        for(int i=0; i<n; i++) {
            int m = 1;
            for (int j=0; j<n-i; j++) {
                System.out.printf(" %d",m);
                m++;
            }
            System.out.print("\n");
        }
        
        pattern output :

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        
        int n = 5;
        int m = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf(" %d",m);
                m++;
            }
            System.out.print("\n");
        }
        
        pattern output :

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        program :
        
        int m = 1;
        int n = 0;
        int l = 5;
        for (int i=1; i<=l; i++) {
            for (int j=1; j<=i; j++) {
                if ((i+j)%2 == 0) {
                    System.out.printf("%d ",m);
                } else {
                    System.out.printf("%d ",n);
                }
            }
            System.out.print("\n");
        }
        
        pattern output :
        
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5

        program :
        */
    }
}

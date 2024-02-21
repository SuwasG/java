public class Patterns {
    public static void main(String[] args) {
        // solid rectangle 
        /* eg: c=5 r=4
         *****
         *****
         *****
         *****
         */
        // outer loop
        int r=5;
        int c=7;
        for (int m =1; m<=r; m++){
            for(int n =1; n<=c; n++){
                System.out.print("*");
               
            }
            System.out.println();
        }


        // hollow rectangles
        /*
        (1,1) (1,2) (1,3) (1,4, 1,5)
         *******   i=1
         *(2,1)* (2,5)   i=2
         *(3,1)* (3,5)  i=3
         *******   i = 4  , i=r
         j=1, j=2, j=..r
         j=1          j=c
         stars are printed on end points, that means stars are printed on the place where either i=1 or j=1 or i=r or j=c
         */

         // outer loop 
         System.out.println("------- Hollow rectangle --------");
         for(int i = 1; i<=r ; i++){
            // inner loop
            for (int j=1; j<=c; j++){
                // cell -> (i,j)
                if(i == 1 || j == 1 || i == r || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    
    
        System.out.println("------------- Half Pyramid ------------");
        /*

          *     first row = 1 star
          **    second row = 2 stars 
          ***   third row = 3 stars
          ****  foruth row = 4 stars
          ***** fifth row = 5 stars
          that means row number = total column

         */

         for (int i = 1; i<=r ; i++){
            for (int j = 1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

         System.out.println("---------------- Inverted half pyramid -------------");

         for (int i = r; i>=1; i--){
            for (int j = 1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
         }


         System.out.println("-------------- Inverted Half pyramid rotated by 180deg ---------------");

         /*
             
           *  3(r-i) spaces + 1 star =4 =r
          **  2(r-i) spaces + 2 stars =4  =r
         ***  1(r-i) spaces + 3 stars =4 =r
        ****  0(r-i) space + 4 stars = 4 = r

          */


         // outer loop
         for (int i =1; i<=r; i++){
            // inner loop -> space print
            for(int j= 1; j<=r-i; j++){
                System.out.print(" ");
            }
            // inner loop -> star print
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

         

    }
}

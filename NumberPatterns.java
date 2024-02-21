public class NumberPatterns {
    public static void main(String[] args){
        System.out.println("Number Patterns");

        System.out.println("Half Pyramid with Numbers: ");
        // 1  row-1 num-1
        // 1 2 row -2 num-2(1,2)
        // 1 2 3  row-3 num-3(1,2,3)
        // 1 2 3 4 row-4 num-4(1,2,3,4)
        // 1 2 3 4 5 row-5 num-5(1,2,3,4, 5)

        int r=5;
        // outer loop
        for (int i=1; i<=r; i++){
            // inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Inverted half pyramid with numbers
        // 1 2 3 4 5  r-1 , 1-n
        // 1 2 3 4    r-2 , 1-(n-1)
        // 1 2 3      r-3 , 1-(n-2)
        // 1 2        r-4, 1-(n-3)
        // 1          r-5, 1-(n-4)
        // row increasing, column decreasing

        for(int i=1; i<=r; i++){
            for (int j=1; j<=r-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }


     
        System.out.println("Floyd's Triangle: ");
           // FLOYD's Triangle
        // 1   r-1 num-1
        // 2 3 r-2 num-2
        // 4 5 6 r-3 num-3
        // 7 8 9 10 r-4 num-4
        // 11 12 13 14 15 r-5 num-5 (r is i in outer loop)

        int number = 1;

        // outer loop 
        for(int i = 1; i<=r; i++){
            // inner loop
            for (int j = 1; j<=i ; j++){
                System.out.print(number + " ");
                number ++;
            }
            System.out.println();
        }


        System.out.println("-------------0-1 Triangle-----------");
        // 1  r-1 val-1  start from 1
        // 0 1 r-2 val-2 start from 0
        // 1 0 1  r-3 val-3 start from 1
        // 0 1 0 1 r-4 val-4 start from 0
        // 1 0 1 0 1 r-5 val-5 start from 1

        // visualize in matrix form 
        // sum of i,j even -1, odd -0


        // outer loop
        for (int i=1; i<=r; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                int sum = i+ j;
                if(sum %2 ==0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }
}

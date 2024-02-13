import java.util.*;
public class Test {
    public static void main(String [] args){

        System.out.println("This is test class in java.");

        int a = 12;
        int b = 13; 
        int sum = a+b;
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.print("Value of x: ");
        int x = sc.nextInt();
        System.out.print("Value of y: ");
        int y = sc.nextInt();
        int sumxy = x+ y ;
        // System.out.print("The sum of x and y is: ");
        // System.out.println(sumxy);
        System.out.println(String.format("The sum of %d and %d is : %d ", x, y, sumxy));



        sc.close();

    }
}

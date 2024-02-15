import java.util.*;

public class Loop {
    public static void main(String[] args){
        System.out.println("This is loop in java");
        // for(initialisation; condition; updation) { do something }

        for (int i=1;  i<=100; i++){
            System.out.println(String.format("Hello World %d", i));
        }
        
        for (int num = 1; num<=10; num++){
            System.out.println(num);
        }


        // while(condition){ do something }
        int i = 0;
        while (i<11) {
            System.out.println(i);
            i++;
            
        }

        // do{ do something } while(condition)
        int j = 0;
        do{
            System.out.println(String.format("Do While %d", j));
            j++;
        } while(j<11);

        int m =12;
        while(m<11){
            System.out.println("Hello");
        }

        do {
            System.out.println("Hello from do while when the condition is false.");
        } while(m<11);

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        int sum =0;
        for (int s=0; s<=n; s++){
            sum = sum + s;
        }
        System.out.println(String.format("The sum of first natural numbers upto %d is: %d", n, sum));


        for(int y=1; y<=10; y++){
            System.out.println(String.format("%d X %d = %d ", n, y, n*y));
        }

        sc.close();


    }
}

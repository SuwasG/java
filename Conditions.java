import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Your are allowed to enter in the bar.");
        } else {
            System.out.println("You are not allowed to enter in the bar.");

        }

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number.");
        }

        System.out.print("Enter the button Number: ");
        int button = sc.nextInt();
        // if(button == 1 ){
        //     System.out.println("Hello");
        // }
        // else if(button == 2){
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Bonjour");
        // }
        // else if(button == 4){
        //     System.out.println("Ni Hao");
        // }
        // else{
        //     System.out.println("Invalid button");
        // }



        switch (button) {
            case 1: 
                System.out.println("Hello");
                break;
            
            case 2: 
                System.out.println("Namaste");
                break;
            case 3: 
                System.out.println("Bonjour");
                break;
            
            case 4: 
                System.out.println("Ni Hao");
                break;
        
            default:
                System.out.println("Invalid button number.");
                break;
        }

        sc.close();
    }
}

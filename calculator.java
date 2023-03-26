import java.util.*;
public class calculator {
    public static void main(String[] args) {
        float numbers_1, numbers_2;
        System.out.println("Enter first number");

        Scanner biru = new Scanner(System.in);
        numbers_1 = biru.nextInt();

        System.out.println("Enter second number");
        numbers_2 = biru.nextInt();

        System.out.println("You have Entered");
        System.out.println(numbers_1);
        System.out.println("and");
        System.out.println(numbers_2);

        String prompt = ("Enter 0 addition, 1 for "+" substraction, 2 for multiplication and 3 for division ");

        System.out.println(prompt);
        int input = biru.nextInt();
        switch(input){
            case 0 :
            System.out.println("Adding these numbers");
            System.out.println("The result is :");
            System.out.println(numbers_1 + numbers_2);
            break;

            case 1:
            System.out.println("Subtracting these number");
            System.out.println("The result is: ");
            System.out.println(numbers_1 + numbers_2);
            break;

            case 2:
            System.out.println("Multiplying these numbers");
            System.out.println("The result is");
            System.out.println(numbers_1 + numbers_2);

            case 3:
            System.out.println("Dividing these numbers");
            System.out.println("The result is:");
            System.out.println(numbers_1 + numbers_2);
            break;

            default:
            System.out.println("Invalid input");
        }
        biru.close();
    }
}

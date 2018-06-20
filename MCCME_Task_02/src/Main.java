import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int nextNumber = number + 1;
        int previousNumber = number - 1;
        System.out.printf("The next number for the number %d is %d.\n" +
                "The previous number for the number %d is %d.",
                number, nextNumber, number, previousNumber);
    }

}

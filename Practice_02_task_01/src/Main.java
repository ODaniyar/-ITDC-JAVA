import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе значение: ");
        int b = scanner.nextInt();
        System.out.printf("До перестановки: a=%d , b=%d\n ", a, b);
        int temp = a;
        a=b;
        b=a;
        b=temp;


        System.out.printf("После перестановки: a=%d, b=%d\n",a, b);

    }


}

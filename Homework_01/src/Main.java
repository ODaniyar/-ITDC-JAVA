import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение стороны a:");
        int SideA = scanner.nextInt();
        System.out.println("Введите значение стороны b:");
        int SideB = scanner.nextInt();
        System.out.println("Введите значение стороны c");
        int SideC = scanner.nextInt();
        int result = SideA * SideB * SideC;
        System.out.printf("Обьем параллелепиппеда равно(%d * %d * %d) равен %d",
                SideA, SideB, SideC, result);
    }

}
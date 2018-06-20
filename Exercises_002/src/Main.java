import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трехзначное число");
        /100int number = scanner.nextInt();
        int sum = number + number/10%10 + number%10;
        System.out.println("Сумма всех цифр числа " + number + " равна " + sum);





    }






}

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summa = number/100 + number/10%10 + number%10;
        System.out.println(summa);
    }

}

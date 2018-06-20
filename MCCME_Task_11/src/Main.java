import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hour= n/60%24;
        int minute = n%60;
        System.out.printf("%d часов, %d минут",hour, minute);
    }




}

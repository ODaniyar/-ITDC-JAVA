import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hour = n/3600%24;
        int minute = n/60%60;
        int sec = n%60;
        System.out.printf("%d:%d%d:%d%d",hour, minute/10, minute%10, sec/10, sec%10);

    }

}

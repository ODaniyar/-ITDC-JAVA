public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение катета стороны a:");
        int a = scanner.nextInt();
        System.out.println("Введите значение другой стороны катета b:");
        int b = scanner.nextInt();
        int c = sgrt(a** 2 + b** 2);
        System.out.println(c);
    }



}












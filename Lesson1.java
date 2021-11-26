import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = scanner.nextInt();
        System.out.println("Nhap so b");
        int b = scanner.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("a / b = " + f);
        System.out.println("a % b = " + g);
    }
}

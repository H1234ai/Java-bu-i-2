import java.util.Scanner;
public class Bai5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
        System.out.println("Các số chẵn tù 1 đến 100 là: ");
        int i = 2;
        while (i <=100) {
            System.out.print(i + "  ");
            i += 2;
        }
    }
}

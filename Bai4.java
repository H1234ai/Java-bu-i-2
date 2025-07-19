import java.util.Scanner;
public class Bai4 {
    public static void main ( String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập la: ");
        for (int i=0; i<5; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        long T = 0;
        for (int i = 0; i < 5; i++) {
            T += a[i];
        }
        System.out.println("Tổng các phần tử trong mảng: " + T);
        int max = a[0];
        for (int i = 0; i < 5; i++) {
            if (a[i] > max) max = a[i];
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}

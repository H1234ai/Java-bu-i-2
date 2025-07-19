import java.util.Scanner;
public class Bai3 {
    public static void main (String[] args ) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Tổng 2 số nguyên là: " + (a+b));
        System.out.println("Hiệu 2 số nguyên là: "+ (a-b));
        System.out.println("Tích 2 số nguyên là: "+ (a*b));
        if (b==0) System.out.println("Không thực hiện được phép chia và phép chia lấy dư!");
        else {
            double T = (double) a/b;
            System.out.println("Kết quả phép chia 2 số: " + T);
            System.out.println("Kết quả phép chia lấy dư: " + (a%b));
        }
        if (a==b) System.out.println("Hai số bằng nhau!");
        else System.out.println("Hai số khác nhau!");

    }
}

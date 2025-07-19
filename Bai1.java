import java.util.Scanner;
public class Bai1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine ();
        sc.nextLine();
        System.out.println("Nhập tuổi của bạn: " );
        int a = sc.nextInt();
        double n;
        System.out.println("Nhập chiều cao của bạn: ");
        n= sc.nextDouble();
        System.out.println("Xin chào "+ name + ", bạn " + a+" tuổi và cao "+ n +" mét.");

    }
}

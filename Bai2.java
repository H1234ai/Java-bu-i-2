import java.util.Scanner;
public class Bai2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuổi của bạn: ");
        int a = sc.nextInt();
        System.out.println("Nhập lớp của bạn: ");
        String Lop = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double b= sc.nextDouble();
        System.out.println ("Tên: "+name+" - "+"Tuổi: "+ a+" - "+"Lớp: "+Lop+" - "+"GPA: "+ b);

    }
}
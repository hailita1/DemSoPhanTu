import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        char kyTu = 'a';
        int count = 0;
        System.out.print("Moi ban nhap 1 ky tu:");
        kyTu = scanner.next().charAt(0);
        System.out.print("Ky tu vua nhap:" + kyTu);
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
import java.util.*;

public class IV {
    public static void main(String[] args) {
        // nomor 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Username : ");
        String username = scan.next();
        System.out.print("Password : ");
        String password = scan.next();
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Gagal");
        }

        // nomor 2
        double syaratZakat = 5240000;
        double besaranZakat = 2.5 / 100;
        System.out.print("Penghasilan : ");
        double penghasilan = scan.nextDouble();
        double zakat;
        if (penghasilan >= syaratZakat) {
            zakat = besaranZakat * penghasilan;
        } else {
            zakat = 0;
        }
        System.out.println("Besaran Zakat : " + zakat);
        scan.close();
    }
}

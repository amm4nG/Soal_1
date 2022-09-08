public class V {
    public static void main(String[] args) {
        // nomor 1
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }

        // nomor 2
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

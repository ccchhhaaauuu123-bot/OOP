import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { // Kiểm tra xem còn dữ liệu không
            if (sc.hasNextLong()) { // Nếu là số thì mới xử lý
                long n = sc.nextLong();
                if (isPerfectNumber(n)) {
                    System.out.println(n);
                }
            } else {
                sc.next(); // Nếu là chữ thì "nhảy qua" để đọc từ tiếp theo
            }
        }
        System.out.println("null");
        sc.close();
    }

    public static boolean isPerfectNumber(long n) {
        if (n <= 1) return false;
        long sum = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) sum += n / i;
            }
        }
        return sum == n;
    }
}
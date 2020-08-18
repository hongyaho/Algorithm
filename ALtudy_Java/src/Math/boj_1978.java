package Math;

import java.util.Scanner;

// 소수 찾기
public class boj_1978 {
    public static boolean isPrime(int uinput) {
        //boolean isPrime = true;

        if (uinput < 2)
            return false;

        for (int i = 2; i < uinput; i++) {
            if (uinput % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int cnt = 0;

        while ((N--) != 0) {
            int uinput = scanner.nextInt();
            if (isPrime(uinput)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }


}

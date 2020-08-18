package Math;

import java.util.Scanner;

// 소수 찾기
// 소수 : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수
public class boj_1978 {
    public static boolean isPrime(int uinput) {

        if (uinput < 2)
            return false;

        // 1과 자기 자신만으로 나누어 떨어져야 하니까 2부터 시작, 자기 자신 전까지만 반복
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

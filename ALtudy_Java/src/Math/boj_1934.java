package Math;

import java.util.Scanner;

// 최소공배수
public class boj_1934 {
    // 유클리드 호제법
    public static int GCD(int a, int b) {
        int r;
        while (b != 0) {
            r = a;
            a = b;
            b = r % b;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int GCD, LCM;

        while ((n--) != 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // ** 이거 없얻ㅎ 잘 나옴
            // **(a, b 누가 더 큰 값인지는 노상관)**
//            if (B>A) {
//                int tmp;
//                tmp = A;
//                A = B;
//                B = tmp;
//            }

            if (A%B == 0) {
                GCD = B;
            }
            else {
                GCD = GCD(A,B);
            }

            LCM = GCD*(A/GCD)*(B/GCD);
            System.out.println(LCM);
        }

    }
}

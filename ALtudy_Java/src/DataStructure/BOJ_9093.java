package DataStructure;

import java.util.Scanner;
import java.util.Stack;
// 단어 뒤집기
public class BOJ_9093 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine()); //*** 원래 코드 : int num = nextInt()

        /* 문제 : while문이 n-1번 돌아갔음 + for문 건너뛰고 개행 들어감 (line 33)
        // --> WHY? nextInt 와 nextLine 같이 써서 n뒤에 있는 '\n'(빈 문자열 "")이 input에 들어감
        //          문자를 여러줄 받는 경우, nextLine 메서드를 이용해서 한 줄 씩 읽어서 처리하자.
        //              ※ next() 개행문자를 무시하고 입력을 받음, 즉 숫자를 치고 엔터를 누를경우 엔터 전까지만 입력을 받음.
        //              ※ nextLine() 한줄 단위로 입력 받기 때문에, 개행문자도 한 줄로 인식합니다.
        */
        while ((num--) != 0) {    // 원래 코드 : while (num != 0) { num--; ~~~
            Stack stack = new Stack<>();
            String uinput = scanner.nextLine()+" ";

            for (int j = 0; j < uinput.length(); j++) {
                // 띄어쓰기(빈 문자열) 있으면 출력
                if (uinput.charAt(j) == ' ') {
                    while (!stack.empty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                }

                // 그냥 문자열이면 push
                else {
                    stack.push(uinput.charAt(j));
                }
            }

            System.out.println();
        }
    }
}
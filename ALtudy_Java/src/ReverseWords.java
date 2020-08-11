import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num != 0) {
            Stack stack = new Stack<>();
            String uinput = scanner.nextLine()+" ";
            num--;

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

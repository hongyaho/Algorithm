import java.util.Scanner;

// 스택
public class BOJ_10828 {
    int[] ArrayStack = new int[1000];
    int size = 0;

    void push(int num) {
        ArrayStack[size] = num;
        size++;
    }

    int pop() {
        if (empty())
            return -1;
        else {
            size--;
            return ArrayStack[size];
        }
    }

    /*
    size는 그냥 현재 정수 출력 해주면 되니까 함수 따로 필요 없
        int size() {

        }
    */
    boolean empty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    int top() {
        if (empty())
            return -1;
        else
            return ArrayStack[size - 1];
    }

    public static void main(String args[]) {
        BOJ_10828 s = new BOJ_10828();

        int num;
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        while (num != 0) {
            String uinput;
            uinput = scanner.next();
            num--;

            switch (uinput) {
                case "push":
                    // n을 여기서 받아야 위에서 오류 안나지.
                    // 위에서 받으면 다른 함수들은 정수 입력 필요 없으니까 오류 뜸!!
                    int n;
                    n = scanner.nextInt();
                    s.push(n); // 출력할 필요 X
                    break;
                case "pop":
                    System.out.println(s.pop());
                    break;
                case "empty":
                    if (s.empty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                        break;
                case "top":
                    System.out.println(s.top());
                    break;
                case "size":
                    System.out.println(s.size);
                    break;
            }

        }
    }
}

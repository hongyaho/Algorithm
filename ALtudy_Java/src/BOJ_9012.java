import java.util.Scanner;
import java.util.Stack;

// 괄호 짝 맞는지
// ##1)  왜 n-1회 돌아가니,,,,, : 9093번과 같은 이유 (intNext 와 nextLine 같이 써서)
// ##2)  몇번할껀지만 쳐도 NO 나옴(size 0이면 출력돼서)  : \##1 해결했더니 해결됨
//            (##1 때문에 input에 빈 문자열이 들어감 -> ""은 (,) 둘 다 해당 안되니까 size 값 변화 없는채로(size=0) 내려가서 YES 출력된거였음
public class BOJ_9012 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());  //*** 원래 코드 : int num = scanner.nextInt();


        while (num != 0) {
            Stack stack = new Stack<>();
            String uinput = scanner.nextLine();
            int size = 0;

            for (int i = 0; i < uinput.length(); i++) {
                if (uinput.charAt(i) == '(') {
                    size --;
                    while (!stack.empty()) {
                        stack.pop();
                        //size --;  ##여기다 넣어노니까 empty일땐 -- 안먹혀서 NO로 떴음 으이구##
                    }
                } else if (uinput.charAt(i) == ')') {
                    stack.push(uinput.charAt(i));
                    size++;  //*****(line 23)
                }

            }

            if(size==0 ) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            num--;
        }
    }

}

// ### 이 문제는 스택 안쓰고 size 변수만 써서 풀어도 될듯!!
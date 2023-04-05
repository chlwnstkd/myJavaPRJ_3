package Computer_2;
import java.io.IOException;
import java.util.*;
public class Star_1 {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                f(i,j);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void f(int x, int y) {

        if(x < 3 && y < 3) {
            if(x % 3 == 1 && y % 3 == 1) {
                sb.append(" ");
            }
            else {
                sb.append("*");
            }
        } else {
            if(x % 3 == 1 && y % 3 == 1) {
                sb.append(" ");
            }
            else {
                f(x/3,y/3);
            }
        }
    }

    public static class Ex07_04 {
        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            int a,b;
            char c;

            while(true){
                System.out.printf("계산할 첫번째 수를 입력 : ");
                a = sc.nextInt();
                System.out.printf("계산할 두번째 수를 입력 : ");
                b = sc.nextInt();
                System.out.printf("계산할 연산자를 입력하세요 : ");
                c = (char)System.in.read();

                switch(c){
                    case '+':
                        System.out.printf("%d + %d = %d입니다. \n", a,b,a+b);
                        break;
                    case '-':
                        System.out.printf("%d - %d = %d입니다. \n", a,b,a-b);
                        break;
                    case '*':
                        System.out.printf("%d * %d = %d입니다. \n", a,b,a*b);
                        break;
                    case '/':
                        System.out.printf("%d / %d = %f입니다. \n", a,b,a/(float)b);
                        break;
                    case '%':
                        System.out.printf("%d %% %d = %d입니다. \n", a,b,a%b);
                        break;
                    default :
                        System.out.printf("연산자를 잘못 입력했습니다. \n");
                }
            }
        }
    }
}

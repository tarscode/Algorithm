package alibaba.stack;
import java.util.Stack;
/**
 * Created by Tars on 2017/4/26 0026.
 */
public class Main {

    public static int resolve(String expr) {
        char[] arr = expr.toCharArray();
        Stack stack = new Stack();
        int num;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= '0' && arr[i] <= '9'){
                if (stack.size() > 16)
                    return -2;
                num = Integer.parseInt(String.valueOf(arr[i]));
                stack.push(num);
            }else if (arr[i] == '*' || arr[i] == '+'){
                if (stack.size() <=1)
                    return -1;
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                if (arr[i] == '*')
                    stack.push(a*b);
                else if (arr[i] == '+')
                    stack.push(a+b);
            }else if (arr[i] == '^'){
                num = (int) stack.pop();
                stack.push(num+1);
            }
        }
        return (int) stack.peek();
    }

}

import java.util.Stack;

public class Fourteen {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char par : s.toCharArray()) {

            if (par == '{' || par == '[' || par == '(') {
                stack.push(par);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if ((par == ')' && top == '(') ||
                        (par == ']' && top == '[') ||
                        (par == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Fourteen obj = new Fourteen();

        System.out.print("() ->");
        System.out.println(obj.isValid("()"));

    }
}

import java.util.*;

 class stack{

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println(cheak(input));
        }
    }
     static boolean cheak(String input)
     {
         Stack<Character> st = new Stack();
            //Complete the code
            for(int i=0;i<input.length();i++) {
                char a = input.charAt(i);

                if (a == '(' || a == '{' || a == '[') {
                    st.push(a);
                } else {
                    if (a == ')' && !st.isEmpty() && st.pop() == '(') {
                        continue;
                    } else if (a == '}' && !st.isEmpty() && st.pop() == '{') {
                        continue;
                    } else if (a == ']' && !st.isEmpty() && st.pop() == '[') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }

            return st.empty();







        }



    }





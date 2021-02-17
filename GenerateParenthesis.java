public class GenerateParenthesis {

    public static void generate(int left, int right, String s) {


        if(left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            System.out.println(s);
            return;
        }

        if (left > 0) {
            //do recursive call
            generate(left - 1, right, s + "(");
        }

        if (right > 0) {
            generate(left, right - 1, s + ")");

        }
    }

    public static void main(String[] args) {

        generate(3,3, "");

    }
}
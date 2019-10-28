public class Kalkulator {

    public static void main(String[] args) {
        long result = calculate (10, 2, '*');
        System.out.println("Result is: " + result);

    }
    static long calculate(int a, int b, char c) {
        long result = 0;

        if(c == '*') {
            result  = a * b;
        }

        if(c == '/') {
            result = a / b;
        }

        if(c == '+') {
            result = a + b;
        }

        if(c == '-') {
            result = a - b;
        }

        return result;
    }
}

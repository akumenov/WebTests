public class Task8 {
    public static double Summation(double a, double b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        int sum;
        if (a >= b) {
            sum = a - b;
        }
        else {
            sum = b - a;
        }
        return sum;
    }

    public static int Multiplication (int a, int b) {
        return a * b;
    }

    public static double Division (double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(Subtraction(5, 15));
    }
}

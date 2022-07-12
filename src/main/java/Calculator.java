public class Calculator {

    private final int b;
    private int a;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addAToB() {
        return a + b;
    }
    public int subtractAFromB() {
        return b - a;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator(-200, 300);
        int result1;
        result1 = calculator.addAToB();
        System.out.println(result1);
        int result2 = calculator.subtractAFromB();
        System.out.println(result2);
    }
}
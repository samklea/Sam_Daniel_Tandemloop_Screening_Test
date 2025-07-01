public class Problem1 {
    public static double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide": return b != 0 ? a / b : Double.NaN;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Add: " + calculate(10, 5, "add"));
        System.out.println("Subtract: " + calculate(10, 5, "subtract"));
        System.out.println("Multiply: " + calculate(10, 5, "multiply"));
        System.out.println("Divide: " + calculate(10, 5, "divide"));
    }
}

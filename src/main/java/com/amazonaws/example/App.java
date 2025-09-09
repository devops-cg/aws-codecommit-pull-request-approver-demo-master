public class SampleSonarQubePOC {

    public static void main(String[] args) {
        int a = 10;
        int b = 0; // Potential division by zero
        int unusedVariable = 100; // Unused variable

        SampleSonarQubePOC poc = new SampleSonarQubePOC();
        poc.doCalculation(a, b);
        poc.printMessage("Hello SonarQube!");
    }

    public void doCalculation(int x, int y) {
        int result = 0;
        try {
            result = x / y; // Division by zero risk
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        System.out.println("Result: " + result);
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public void hardcodedLogic() {
        String env = "PROD"; // Hardcoded environment
        if (env.equals("PROD")) {
            System.out.println("Running in production mode");
        }
    }
}

import java.util.Scanner;

class Calculator {
    public double addition(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return a - b;
    }
    public double multiplication(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by 0 ");
        }
        return a/b;
    }
}
public class Problem_1{
    public static void main(String[] args) {
        System.out.println("Welcome to calculator : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(""" 
                Enter the operation to be performed
                
                1. addition
                2. subtratction
                3. multiplication
                4. division
                """);
        String operation = sc.nextLine().toLowerCase();
        System.out.println("Enter first Operator: ");
        double a = sc.nextDouble();
        System.out.println("Enter second Operator: ");
        double b = sc.nextDouble();

        Calculator calculator = new Calculator();

        switch(operation){
            case "addition" ->{
                double addition = calculator.addition(a,b);
                System.out.println(addition);
            }
            case "subtraction" -> {
                double subtraction = calculator.subtraction(a,b);
                System.out.println(subtraction);
            }
            case "multiplication" -> {
                double multiplication = calculator.multiplication(a,b);
                System.out.println(multiplication);
            }
            case "division" -> {
                double division = calculator.division(a,b);
                System.out.println(division);
            }

            default -> System.out.println("Enter the correct Operation ");
        }

    }

}


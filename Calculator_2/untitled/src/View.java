import util.Operators;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class View {
    private final Calculable calculator;
    private final List<String> validOperators;

    public View(Calculable calculator) {
        this.calculator = calculator;
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }

    public void run() {
        while (true) {
            prepare();
            String action = prompt();
            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }

    private void prepare() {
        double real1 = promptInt("Введите  действительное 1-е число: ");
        double imaginary1 = promptInt("Введите  мнимое 1-е число: ");
        String operator = getOperator();
        double real2 = promptInt("Введите действительное 2-е число ");
        double imaginary2 = promptInt("Введите мнимое 2-е число ");

        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        if (operator.equals("*")) {
            calculator.multiply(num1, num2);
        }

        if (operator.equals("+")) {
            calculator.sum(num1, num2);
        }

        if (operator.equals("/")) {
            calculator.divide(num1, num2);
        }



        calculator.clear();
    }

    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("Continue?... (y/n)");
        return in.nextLine();
    }

    private String getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите математическую оперецию (*, +, / ) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Введен недопустимый математический оператор " + "Введите математическую операцию (*, +, /, -) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        int result = 0;
        try {
            result = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Номер не был введен. Пожалуйста, введите номер");
            promptInt(message);
        }
        return result;
    }
}

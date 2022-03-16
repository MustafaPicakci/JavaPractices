package calculator;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CalculatorClassLoader calculatorLoader = new CalculatorClassLoader();
        Calculator calculator = (Calculator) calculatorLoader.
                load("../Jar/App2.jar", "com.calculator.Calculator");

        int result = calculator.sum(3, 5);
        System.out.println(result);
    }
}

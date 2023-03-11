
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double soma = somar(a, b);
            double subtrai = subtrair(a, b);
            double multiplica = multiplicar(a, b);
            double divide = dividir(a, b);
            System.out.println("A soma é: " + soma);
            System.out.println("A subtração é: " + subtrai);
            System.out.println("A multiplicação é: " + multiplica);
            System.out.println("A divisão é: " + divide);
        sc.close();
    }

    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}
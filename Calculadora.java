
package Proyecto;

import java.text.NumberFormat;

/**
 * Clase calculadora que implementa los métodos necesarios para hacer
 * operaciones básicas
 *
 *
 * @author Ivan
 */
public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;

    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static String dividir(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Error.No se puede dividir por cero");
        }
        NumberFormat formateador = NumberFormat.getInstance();
        formateador.setMaximumFractionDigits(3);
        return formateador.format(a / b);
    }

    public static double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

}

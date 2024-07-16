package Ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    public List<String> resultadoEjercicio(int n) {
        List<String> resultado = new ArrayList<>();
        resultadoEjercicio(new StringBuilder(), n, n, resultado);
        return resultado;
    }

    private void resultadoEjercicio(StringBuilder current, int open, int close, List<String> resultado) {
        if (open == 0 && close == 0) {
            resultado.add(current.toString());
            return;
        }

        if (open > 0) {
            current.append('(');
            resultadoEjercicio(current, open - 1, close, resultado);
            current.deleteCharAt(current.length() - 1);
        }

        if (close > open) {
            current.append(')');
            resultadoEjercicio(current, open, close - 1, resultado);
            current.deleteCharAt(current.length() - 1);
      
    
        }  
    }

}
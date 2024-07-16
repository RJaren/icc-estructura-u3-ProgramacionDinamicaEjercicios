package Ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {
    public List<List<Integer>> subsets(List<Integer> set) {
        HashSet<List<Integer>> resultado = new HashSet<>();
        int num = set.size();
        int numeroSubsets = calcularNumeroSubsets(num);

        for (int i = 0; i < numeroSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            int act = i;
            for (int j = 0; j < num; j++) {
                if (act % 2 == 1) {
                    subset.add(set.get(j));
                }
                act /= 2;
            }
            resultado.add(subset);
        }
        return new ArrayList<>(resultado);
    }

    public int calcularNumeroSubsets(int num) {
        int result = 1;
        for (int i = 0; i < num; i++) {
            result *= 2;
        }
        return result;
    }
}

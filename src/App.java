import Ejercicio.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        List<List<Integer>> result = ejerUno.subsets(set);
        System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);

        EjercicioDos ejerDos = new EjercicioDos();
        int n = 1;
        List<String> resultad = ejerDos.resultadoEjercicio(n);
        System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
        System.out.println(resultad);
        int nu = 3;
        List<String> resulta = ejerDos.resultadoEjercicio(nu);
        System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
        System.out.println(resulta);

    }
}

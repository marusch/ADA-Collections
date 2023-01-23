import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ListaNumeros = new ArrayList<Integer>();
        ListaNumeros.add(1);
        ListaNumeros.add(2);
        ListaNumeros.add(3);

        //Implementacion del bucle for each
        for (Integer valor: ListaNumeros){
            System.out.println(valor);


        }

    }
}
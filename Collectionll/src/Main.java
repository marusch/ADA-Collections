import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        List<Integer> lisNum = new ArrayList<Integer>();
        System.out.println("Ingrese la cantidad de numeros a cargar: ");
        int N = input.nextInt();

        for (int i = 0; i< N; i++){
            System.out.println("Ingrese un numero nuevo");
            int numero = input.nextInt();
            lisNum.add(numero);
        }

     /*   for (int i = 0; i < lisNum.size(); i++) {
            int elemento = lisNum.get(i);
            System.out.println(elemento);
        }

      */

        for (Integer elemento: lisNum) {
            System.out.println(elemento);
        }


    }
}
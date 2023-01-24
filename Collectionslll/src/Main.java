import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> ListaNombres = new ArrayList<String>();

        System.out.println("Ingrese la cantidad de nombres a cargar:");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un nombre nuevo");
            String nombre = input.next();
            ListaNombres.add(nombre);
        }

        for (String elemento : ListaNombres) {
            System.out.println(elemento);
        }

    }
}
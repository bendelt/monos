import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nelementos, aux;

        nelementos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de monos"));

        arreglo = new int[nelementos];

        for (int i = 0; i < nelementos; i++) {
            System.out.println((i + 1) + " Escribe tu número:");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < (nelementos - 1); i++) {
            for (int j = 0; j < (nelementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.print("\nArreglo ordenado en forma creciente: ");
        for (int i = 0; i < nelementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
    }
}

import java.util.Scanner;
public class Corte4_JDVM{

    public static void main (String [] arg){

        Scanner sc = new Scanner(System.in);
        int l, sum = 0;
        int datos[] = new int [10];

        //Ciclo for para agregar los datos
        //Mientras la variable K sea menor a la dimension del array, se le sumara un numero a la variable. Haciendo que cada vez se vaya desplazando entre las posiciones y agregando numero
       
        for (int k = 0; k < datos.length; k++){

            System.out.println("Valor del dato " + (k + 1) + ": ");
            l = Integer.valueOf(sc.nextLine());
            //La variable 'l' lee el numero deseado para agregarlo al arreglo.

            datos[k] = l;
            sum += l;  
            //Cada numero que se agregue al arreglo se le ira sumando a la variable 'sum' para al final sacar la suma aritmetica
        }

        System.out.println("La suma total de los numeros insertados es: " + sum);
        System.out.println("El promedio de numeros insertados es: " + (sum/datos.length));
    }
}
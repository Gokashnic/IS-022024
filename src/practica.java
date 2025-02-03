import java.util.Scanner;

public class practica{
 /**
 * @param args
 */
public static void main(String[] args){
    //Datos primitivos
    int numero = 1; 
    float flotante = 15.4f;
    char caracter = 'a';
    boolean bool = true;
    double doble = 15.5555555;

    System.err.println("hola mundo");
    //tomar por consola
    try (Scanner entrada = new Scanner(System.in)) {
        String cadena = entrada.nextLine();
        System.err.println("entrada:" + cadena);
        numero = entrada.nextInt();
        flotante = entrada.nextFloat();
        caracter =entrada.next().charAt(0);
    }
    int[] array = {1,2,3};

    for(int i: array){
        System.err.print("["+ i +"]");
    }
 }
 new Jframe_Principal().setVisible(true);
}
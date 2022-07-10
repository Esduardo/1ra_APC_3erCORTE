import java.util.Scanner;

public class Main {
    static Scanner entrada =  new Scanner(System.in);
    static int opc;
    public static void main(String [] srgs) {
        do {
            System.out.println(":: Leer numeros reales y guardarlos en un arreglo ::" +
                    "\n:: 1. guardar elementos" +
                    "\n:: 2. Mostrar Suma de los elementos" +
                    "\n:: 3. Salir");
            System.out.printf("        : ");
            opc = entrada.nextShort();
            switch (opc){
                case 1:
                    Operacion.guardarDatos();
                    break;
                case 2:
                    Operacion.mostrarSuma(Operacion.tam);
                    break;
                case 3:
                    System.out.println("Byee");
                    break;
                default:
                    System.out.println("No existe  :|");
            }
        }while (opc != 3);
    }
}

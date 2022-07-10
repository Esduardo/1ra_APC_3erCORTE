public class Operacion {
    static Dato arregloA [];
    static int tam;
    public static int  guardarDatos(){
        int elem;
        System.out.println("Guardar elementos en el arreglo");
        System.out.printf("dame el tamaño del arreglo: ");
        tam = Main.entrada.nextInt();
        arregloA =  new Dato[tam];
        for(int i = 0; i < tam; i++){
            System.out.printf("Ingresa el elemento " + (i + 1)  + ": ");
            elem = Main.entrada.nextInt();
            arregloA[i] = new Dato(elem);
        }
        return tam;
    }


    public static void mostrarSuma(int tam){
        int total = 0;
        for(int i = 0; i < tam ; i++){
            total = total + arregloA[i].dato;
        }
        System.out.println("la suma de todos los elementos es: " + total + "\n");
    }
}

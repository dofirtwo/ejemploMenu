package ejemplomenu;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjemploMenu {
    
    static Scanner teclado = new Scanner(System.in);
    static double temp[][] =new double [2][7];
    static String dias[] = new String [7];
    
    public static void Dias(){
        dias[0]="Lunes";
        dias[1]="Martes";
        dias[2]="Miercoles";
        dias[3]="Jueves";
        dias[4]="Viernes";
        dias[5]="Sabado";
        dias[6]="Domingo";
    }
    
    private static void entradaDatos(){
        System.out.println("Ingresando datos..."); 
        Dias(); 
        for (int fila = 0; fila < 1; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                System.out.print("ingrese la temperatura ");
                if (fila==0) {
                    System.out.println("ingrese la temperatura menor del "+dias[columna]);
                    temp[fila][columna]=teclado.nextDouble();
                }
                if (fila==1) {
                    System.out.println("ingrese la temperatura mayor del "+dias[columna]);
                    temp[fila][columna]=teclado.nextDouble();
                } 
    }
    }
    
        /*    private static void temperaturaMaxima(){*/        
    }
    
    private static void temperaturaMinima(){
        
    }
    
    private static void temperaturaDias(){
        
    }
    
    private static void menu(){
        int opcion=0;
        do{
            System.out.println("\tMENU DE OPCIONES");
            System.out.println("\t1. Ingresar temperaturas");
            System.out.println("\t2. Consultar temperatura maxima");
            System.out.println("\t3. Consultar temperatura minima");
            System.out.println("\t4. Listar temperatura de todos los dias");
            System.out.println("\t5. Salir");
            System.out.println("Ingrese opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:entradaDatos();
                    break;
                /*case 2:temperaturaMaxima();
                
                    break;*/
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Cerrando");
                    break;
                default:
                    System.out.println("Opcion errada");
                    break;
            }
        }while(opcion!=5);
    }
    
    
    public static void main(string[] args) {
        menu();
    }

    
    
}

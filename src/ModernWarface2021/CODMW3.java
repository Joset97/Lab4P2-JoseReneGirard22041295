/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernWarface2021;

/**
 *
 * @author jrgir
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CODMW3 {

    public static void main(String[] args) throws MiExepcion {

        Scanner leer = new Scanner(System.in);
        ArrayList<Zonas> zone = new ArrayList();
        ArrayList<Escuadrones> Escuadron = new ArrayList();

        int opcion = 0;

        while (opcion > 0 && opcion < 12) {
            System.out.println("\n0. Salir\n"
                    + "1. Crear zona\n"
                    + "2. Listar zonas\n"
                    + "3. Crear escuadron\n"
                    + "4. Listar escuadrones\n"
                    + "5. Listar escuadron\n"
                    + "6. Eliminar escuadron\n"
                    + "7. Añadir soldado a escuadron\n"
                    + "8. Listar soldados de escuadron\n"
                    + "9. Listar soldados de escuadron por tipo\n"
                    + "10. Eliminar soldados de escuadron\n"
                    + "11. Pelear\n");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\nIngrese el nombre de la zona");
                    String nombre = leer.next();
                    System.out.println("\nIngrese el tamaño de la zona");
                    int size = leer.nextInt();
                    System.out.println("\nIngrese su coordenada X");
                    int x = leer.nextInt();
                    System.out.println("\nIngrese su coordenada Y");
                    int y = leer.nextInt();

                    Zonas zn = new Zonas(size, x, y, nombre);

                    zone.add(zn);
                    System.out.println("Se ha agregado Exitosamente");

                    break;
                case 2:
                    System.out.println("Zonas");
                    int listaZ = 0;
                    for (Zonas zona : zone) {
                        System.out.println(listaZ + "\t" + zona);
                        listaZ++;
                    }
                    break;
                case 3:

                    System.out.println("\nIngrese el nombre del escuadron");
                    nombre = leer.next();
                    Escuadron.add(new Escuadrones(nombre));

                    break;
                case 4:

                    System.out.println("\nListar Escuadrones\n");
                    int listaSquad = 0;
                    for (Escuadrones squad : Escuadron) {
                        System.out.println(listaSquad + "\t" + squad);
                        listaSquad++;
                    }

                    break;

                case 5:

                    System.out.println("Ingrese la posicion del escuadron que quiere listar");
                    int posicion = leer.nextInt();

                    System.out.println(Escuadron.get(posicion));
                    break;
                case 6:

                    System.out.println("Ingrese la posicion del escuadron que desea eliminar");
                    int pos = leer.nextInt();

                    Escuadron.remove(pos);

                    System.out.println("Se ha eliminado El Escuadron ");
                    break;
                case 7:

                    System.out.println("Ingrese la posicion del escuadron");
                    int posi = leer.nextInt();

                    System.out.println("Ingrese su nombre:");
                    String names = leer.next();
                    System.out.println("Ingrese su rango en el ejercito:");
                    String rango= leer.next();
                    System.out.println("Ingrese su Edad:");
                    int Edad= leer.nextInt();
                    System.out.println("Ingrese sus puntos de vida:");
                    int Hitpoints= leer.nextInt();
                    System.out.println("Ingrese sus años en el ejercito");
                    int años=leer.nextInt();
                    //  queria usar esto pero no recuerdo como usarlo y por el tiempo   SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");

                    Escuadron.get(posi).addSoldado(names, rango, Edad, Hitpoints, años);
                    
                 
                    break;

                case 8:

                   

                    break;
                case 9:
                    

                    break;
                case 10:
              
                    break;

                case 11:
                    break;

            } //Fin Switch

        }//Fin While
    }

}

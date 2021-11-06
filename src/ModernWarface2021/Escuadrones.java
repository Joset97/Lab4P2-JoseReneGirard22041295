/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernWarface2021;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jrgir
 */
public class Escuadrones {

    private String nombre;
    private ArrayList<Zonas> zone;
    private ArrayList<Soldado> Team;

    public Escuadrones(String nombre) {
        this.nombre = nombre;
        this.zone = new ArrayList();
        this.Team = new ArrayList();
    }
    static Scanner leer = new Scanner(System.in);

    public void addZona(int size, int x, int y, String Nombre) throws MiExepcion {

        if (size <= 300 && size >= 100 && x >= 0 && x <= 100 && y >= 0 && y <= 100) {
            zone.add(new Zonas(size, x, y, Nombre));
        } else {
            throw new MiExepcion("Uno de los tamaños no "
                    + "\ncorresponde a los especificados");
        }
    }

    public void addSoldado(String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) throws MiExepcion {

        int control = 0;
        do {

            System.out.println("1-Infanteria Ligera \n"
                    + "2-Infanteria pesada\n"
                    + "3-Sargento\n"
                    + "4-capitan\n"
                    + "5-SuperSoldado\n"
                    + "6-Salir");

            switch (control) {

                case (1):
                    System.out.println("Ingrese el nombre del ArmaBlanca");
                    String Ar = leer.next();
                    ArmaBlanca Arb = new ArmaBlanca(Ar);
                    InfanteriaLigera IL = new InfanteriaLigera(Arb, nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
                    Team.add(IL);

                    break;
                case (2):
                    System.out.println("Ingrese el nombre de las Bombas ");
                    String Bomb = leer.next();
                    Bombas bim = new Bombas(Bomb);

                    InfanteriaPesada IP = new InfanteriaPesada(bim, nombre, rango, edad, Hitpoints, tiempoEnElEjercito);

                    Team.add(IP);
                    break;
                case (3):

                    if (validarSarG() == false) {
                        System.out.println("Ingrese el nombre de la Escopeta");
                        String Shoty = leer.next();
                        Escopeta Shote = new Escopeta(Shoty);

                        Sargento ST = new Sargento(Shote, nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
                    } else {
                        System.out.println("Ya no puede ingresar mas sargentos");
                    }
                    break;

                case (4):

                    if (validarCap() == false) {
                        System.out.println("Ingrese el nombre del Lanzallamas");
                        String Flame = leer.next();
                        Lanzallamas Flames = new Lanzallamas(Flame);

                        Capitan Pyro = new Capitan(Flames, nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
                    } else {
                        System.out.println("Ya no puede ingresar mas capitanes");
                    }
                    break;
                case (5):

                    if (validarSS() == false) {

                        System.out.println("Ingrese el nombre del ArmaBlanca");
                        String Ab = leer.next();
                        ArmaBlanca AB = new ArmaBlanca(Ab);
                        System.out.println("Ingrese el nombre de las Bombas ");
                        String bomb = leer.next();
                        Bombas bam = new Bombas(bomb);
                        System.out.println("Ingrese el nombre de la Escopeta");
                        String Shot = leer.next();
                        Escopeta Shotg = new Escopeta(Shot);
                        System.out.println("Ingrese el nombre del Lanzallamas");
                        String Flamesms = leer.next();
                        Lanzallamas flama = new Lanzallamas(Flamesms);

                        Team.add(new SuperSoldado(AB, bam, Shotg, flama, nombre, rango, edad, Hitpoints, tiempoEnElEjercito));
                    }

                    break;
                case (6):

                    System.out.println("Saliendo...");

                    break;

                default:
                    System.out.println("Elija lo que se le pide");

            }
        } while (control != 6);

        throw new MiExepcion("ERROr Esto no deberia suceder");

    }

    public boolean validarSS() {

        for (Soldado sol : Team) {

            if (sol instanceof SuperSoldado) {

                return true;
            }

        }

        return false;

    }

    public boolean validarCap() {

        int control = 0;
        for (Soldado sol : Team) {

            if (sol instanceof Capitan) {
                control++;

                if (control == 2) {
                    return true;
                }
            }

        }

        return false;

    }

    public boolean validarSarG() {

        int control = 0;
        for (Soldado sol : Team) {

            if (sol instanceof Sargento) {
                control++;

                if (control == 2) {
                    return true;
                }
            }

        }

        return false;

    }

    @Override
    public String toString() {
        return "Escuadrones{" + "\nnombre=" + nombre + ", \nzone=" + zone + ", \nTeam=" + Team + '}';
    }

}

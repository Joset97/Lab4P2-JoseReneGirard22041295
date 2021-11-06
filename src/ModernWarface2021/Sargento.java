/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernWarface2021;

import java.util.Date;

/**
 *
 * @author jrgir
 */
public class Sargento extends Soldado {

    private Escopeta Shotg;

    public Sargento(Escopeta Shotg, String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.Shotg = Shotg;
    }

    @Override
    public int Damage(Soldado sol) {

        if (sol instanceof InfanteriaLigera) {

            return ((int) (Shotg.getDamage() * 0.15));

        }
        if (sol instanceof InfanteriaPesada) {

            return ((int) (Shotg.getDamage() * 0.10));
        } else {
            return Shotg.getDamage();
        }
    }

    @Override
    public String toString() {
        return "Sargento{" + "Shotg=" + Shotg + '}';
    }

}

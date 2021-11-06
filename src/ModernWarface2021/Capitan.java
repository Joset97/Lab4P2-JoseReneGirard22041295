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
public class Capitan extends Soldado {

    private Lanzallamas Flame;

    public Capitan(Lanzallamas Flame, String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.Flame = Flame;
    }

    @Override
    public int Damage(Soldado sol) {
        
        if (sol instanceof InfanteriaLigera) {

            return ((int) (Flame.getDamage() * 0.25));

        }
        if (sol instanceof InfanteriaPesada) {

            return ((int) (Flame.getDamage() * 0.20));
        }
        if (sol instanceof Sargento) {

            return ((int) (Flame.getDamage() * 0.15));
        } else {
            return Flame.getDamage();
        }
    }

    @Override
    public String toString() {
        return "Capitan{" + "Flame=" + Flame + '}';
    }

}

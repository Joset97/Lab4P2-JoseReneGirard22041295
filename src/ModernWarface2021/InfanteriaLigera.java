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
public class InfanteriaLigera extends Soldado {

    private ArmaBlanca Ab;

    public InfanteriaLigera(ArmaBlanca Ab, String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.Ab = Ab;
    }

    @Override
    public int Damage(Soldado sol) {
        
        return Ab.getDamage();
        
    }

    @Override
    public String toString() {
        return "InfanteriaLigera{" + "Ab=" + Ab + '}';
    }


}

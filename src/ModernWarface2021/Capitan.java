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

    private int DamageLlamas;
     private String nombreArma;

    public Capitan(String nombre, String rango, int edad, int Hitpoints, Date tiempoEnElEjercito, String NombreArma) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.DamageLlamas = 110;
          nombreArma = NombreArma;
        
    }

    public int getDamageLlamas() {
        return DamageLlamas;
    }

    
}

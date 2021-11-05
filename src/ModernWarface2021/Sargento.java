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
public class Sargento extends Soldado{
    
    private int DamageEscopeta;
     private String nombreArma;

    public Sargento(String nombre, String rango, int edad, int Hitpoints, Date tiempoEnElEjercito, String NombreArma) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.DamageEscopeta = 150;
          nombreArma = NombreArma;
    }

    public int getDamageEscopeta() {
        return DamageEscopeta;
    }

    public void setDamageEscopeta(int DamageEscopeta) {
        this.DamageEscopeta = DamageEscopeta;
    }
    
    
}

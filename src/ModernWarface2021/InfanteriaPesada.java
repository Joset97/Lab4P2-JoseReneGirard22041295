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
public class InfanteriaPesada  extends Soldado{
    
    private int DamageBomba;
 private String nombreArma;
    
    
    public InfanteriaPesada(String nombre, String rango, int edad, int Hitpoints, Date tiempoEnElEjercito, String NombreArma) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.DamageBomba = 50;
          nombreArma = NombreArma;
    }

    public int getDamageBomba() {
        return DamageBomba;
    }
    
    @Override
    public void Bonus(){
    
   
    
    }
            
    
}

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
    

    private Bombas Bomb;

    public InfanteriaPesada(Bombas Bomb, String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.Bomb = Bomb;
    }

    @Override
    public int Damage(Soldado sol){
        
    if(sol instanceof InfanteriaLigera ){
    
    return  ((int) (Bomb.getDamage()*0.05));
    
    }else{return Bomb.getDamage();}
    
  
    }

    @Override
    public String toString() {
        return "InfanteriaPesada{" + "Bomb=" + Bomb + '}';
    }

   
            
    
}
 // throw new MiExepcion("Algo salio mal");
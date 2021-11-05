
package ModernWarface2021;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jrgir
 */
public class SuperSoldado extends Soldado {
 
    
    private ArrayList <Weapons> armas;

    public SuperSoldado( String nombre, String rango, int edad, int Hitpoints, Date tiempoEnElEjercito) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.armas = new ArrayList();
    }
    
    public void addArmas(){
    
    }
    
     public boolean HasArmaBlanca() {

         for (Weapons ar : armas) {
           

            if (ar instanceof ArmaBlanca) {

                return true;

            }

        }

        return false;
    }
    
}

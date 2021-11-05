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

    private int DamageArmaBlanca;
    private String nombreArma;

    public InfanteriaLigera(String nombre, String rango, int edad, int Hitpoints, Date tiempoEnElEjercito, String NombreArma) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);

        nombreArma = NombreArma;
        DamageArmaBlanca = 50;

    }

    public int getDamageArmaBlanca() {
        return DamageArmaBlanca;
    }


    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

  

}

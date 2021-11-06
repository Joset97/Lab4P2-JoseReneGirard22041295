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
public abstract class Soldado {

    protected String nombre, rango;
    protected int edad, Hitpoints;
    protected int tiempoEnElEjercito;

    public Soldado(String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.Hitpoints = Hitpoints;
        this.tiempoEnElEjercito = tiempoEnElEjercito;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHitpoints() {
        return Hitpoints;
    }

    public void setHitpoints(int Hitpoints)throws MiExepcion{
        
        if(Hitpoints<=400 && Hitpoints>=100){
        this.Hitpoints = Hitpoints;
    }else{throw new MiExepcion("Su vida no es ta en los limites establecidos(100-400)");}
    }
    
    public int getTiempoEnElEjercito() {
        return tiempoEnElEjercito;
    }

    public void setTiempoEnElEjercito(int tiempoEnElEjercito) {
        this.tiempoEnElEjercito = tiempoEnElEjercito;
    }

    public abstract int Damage(Soldado sol)throws MiExepcion;
    
    
    @Override
    public String toString() {
        return "Soldado{" + "\nnombre=" + nombre + ",\n rango=" + rango + ", \nedad=" + edad + ", \nHitpoints=" + Hitpoints + ", \ntiempoEnElEjercito=" + tiempoEnElEjercito + '}';
    }

    
    
    
    
}

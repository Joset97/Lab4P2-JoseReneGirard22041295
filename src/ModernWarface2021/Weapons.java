/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernWarface2021;

/**
 *
 * @author jrgir
 */
public class Weapons {

    protected String nombre;
    protected int Damage;

    public Weapons(String nombre, int Damage) {
        this.nombre = nombre;
        this.Damage = Damage;
    }

    @Override
    public String toString() {
        return "Weapons{" + "\nnombre=" + nombre + ", \nDamage=" + Damage + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }

}

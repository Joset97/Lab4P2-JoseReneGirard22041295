package ModernWarface2021;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jrgir
 */
public class SuperSoldado extends Soldado {

    private ArmaBlanca Ab;
    private Bombas Bomb;
    private Escopeta Shotg;
    private Lanzallamas Flame;

    public SuperSoldado(ArmaBlanca Ab, Bombas Bomb, Escopeta Shotg, Lanzallamas Flame, String nombre, String rango, int edad, int Hitpoints, int tiempoEnElEjercito) {
        super(nombre, rango, edad, Hitpoints, tiempoEnElEjercito);
        this.Ab = Ab;
        this.Bomb = Bomb;
        this.Shotg = Shotg;
        this.Flame = Flame;
    }

    public ArmaBlanca getAb() {
        return Ab;
    }

    public void setAb(ArmaBlanca Ab) {
        this.Ab = Ab;
    }

    public Bombas getBomb() {
        return Bomb;
    }

    public void setBomb(Bombas Bomb) {
        this.Bomb = Bomb;
    }

    public Escopeta getShotg() {
        return Shotg;
    }

    public void setShotg(Escopeta Shotg) {
        this.Shotg = Shotg;
    }

    public Lanzallamas getFlame() {
        return Flame;
    }

    public void setFlame(Lanzallamas Flame) {
        this.Flame = Flame;
    }

    @Override
    public int Damage(Soldado sol) throws MiExepcion {

        boolean control = false;
        int controlSwitch = 0;
        do {

            System.out.println("1-ArmaBlanca \n"
                    + "2-Bomba\n"
                    + "3-Escopeta\n"
                    + "4-Lanzallamas\n");

            switch (controlSwitch) {

                case (1):
                    if (sol instanceof InfanteriaLigera) {

                        return ((int) (Ab.getDamage() * 0.5));

                    }
                    if (sol instanceof InfanteriaPesada) {

                        return ((int) (Ab.getDamage() * 0.4));
                    }
                    if (sol instanceof Sargento) {

                        return ((int) (Ab.getDamage() * 0.35));
                    }
                    if (sol instanceof Capitan) {

                        return ((int) (Ab.getDamage() * 0.3));
                    } else {
                        return Ab.getDamage();
                    }

                case (2):
                    if (sol instanceof InfanteriaLigera) {

                        return ((int) (Bomb.getDamage() * 0.5));

                    }
                    if (sol instanceof InfanteriaPesada) {

                        return ((int) (Bomb.getDamage() * 0.4));
                    }
                    if (sol instanceof Sargento) {

                        return ((int) (Bomb.getDamage() * 0.35));
                    }
                    if (sol instanceof Capitan) {

                        return ((int) (Bomb.getDamage() * 0.3));
                    } else {
                        return Bomb.getDamage();
                    }

                case (3):
                    if (sol instanceof InfanteriaLigera) {

                        return ((int) (Shotg.getDamage() * 0.5));

                    }
                    if (sol instanceof InfanteriaPesada) {

                        return ((int) (Shotg.getDamage() * 0.4));
                    }
                    if (sol instanceof Sargento) {

                        return ((int) (Shotg.getDamage() * 0.35));
                    }
                    if (sol instanceof Capitan) {

                        return ((int) (Shotg.getDamage() * 0.3));
                    } else {
                        return Shotg.getDamage();
                    }

                case (4):

                    if (sol instanceof InfanteriaLigera) {

                        return ((int) (Flame.getDamage() * 0.5));

                    }
                    if (sol instanceof InfanteriaPesada) {

                        return ((int) (Flame.getDamage() * 0.4));
                    }
                    if (sol instanceof Sargento) {

                        return ((int) (Flame.getDamage() * 0.35));
                    }
                    if (sol instanceof Capitan) {

                        return ((int) (Flame.getDamage() * 0.3));
                    } else {
                        return Flame.getDamage();
                    }

            }
        } while (control);

        throw new MiExepcion("ERROr Esto no deberia suceder");

    }

    @Override
    public String toString() {
        return "SuperSoldado{" + "Ab=" + Ab + ", Bomb=" + Bomb + ", Shotg=" + Shotg + ", Flame=" + Flame + '}';
    }

}

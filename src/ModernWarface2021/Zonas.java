
package ModernWarface2021;

/**
 *
 * @author jrgir
 */
public class Zonas {
    
    private int size;
    private int x;
    private int y;
    private String Nombre;

    public Zonas(int size, int x, int y, String Nombre) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.Nombre = Nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}

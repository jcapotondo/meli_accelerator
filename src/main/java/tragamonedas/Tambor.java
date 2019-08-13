package tragamonedas;

public class Tambor {
    private int posicion;

    public Tambor() {
        this.posicion = 1;
    }

    public int obtenerPosicion() {
        return posicion;
    }

    public void girar() {
        int min = 1;
        int max = 8;
        posicion = (int)(Math.random() * ((max - min) + 1)) + min;
    }
}

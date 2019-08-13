package tragamonedas;

public class Tragamonedas {

    private Tambor tambor1;
    private Tambor tambor2;
    private Tambor tambor3;

    public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3) {
        this.tambor1 = tambor1;
        this.tambor2 = tambor2;
        this.tambor3 = tambor3;
    }

    public void activar() {
        tambor1.girar();
        tambor2.girar();
        tambor3.girar();
    }

    public boolean entregarPremio() {
        int posicion1 = tambor1.obtenerPosicion();
        int posicion2 = tambor2.obtenerPosicion();
        int posicion3 = tambor3.obtenerPosicion();

        return posicion1 == posicion2 && posicion2 == posicion3;
    }
}

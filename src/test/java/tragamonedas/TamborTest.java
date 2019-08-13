package tragamonedas;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TamborTest {

    @Test
    public void obtenerPosicionDevuelveUnoSiNadaFueSeteado() {
        Tambor tambor = new Tambor();

        int posicion = tambor.obtenerPosicion();

        assertThat(posicion).isEqualTo(1);
    }

    @Test
    public void cuandoGiraSeGeneraUnaPosicionEntreUnoYOcho() {
        Tambor tambor = new Tambor();

        tambor.girar();

        assertThat(tambor.obtenerPosicion()).isBetween(1, 8);
    }
}

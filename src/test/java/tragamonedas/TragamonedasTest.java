package tragamonedas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TragamonedasTest {

    @Spy
    Tambor tambor1Spy;

    @Spy
    Tambor tambor2Spy;

    @Spy
    Tambor tambor3Spy;

    @Test
    public void activar() {
        Tragamonedas tragamonedas = new Tragamonedas(tambor1Spy, tambor2Spy, tambor3Spy);

        tragamonedas.activar();

        verify(tambor1Spy, times(1)).girar();
        verify(tambor2Spy, times(1)).girar();
        verify(tambor3Spy, times(1)).girar();
    }

    @Test
    public void entregarPremio() {
        when(tambor1Spy.obtenerPosicion()).thenReturn(2);
        when(tambor2Spy.obtenerPosicion()).thenReturn(2);
        when(tambor3Spy.obtenerPosicion()).thenReturn(2);
        Tragamonedas tragamonedas = new Tragamonedas(tambor1Spy, tambor2Spy, tambor3Spy);

        boolean entregarPremio = tragamonedas.entregarPremio();

        assertThat(entregarPremio).isTrue();
    }
  
}

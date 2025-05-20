import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilidadesTest {

    @Test
    public void testEsParParametroPar() {
        assertTrue(Utilidades.esPar(4));
        //assertFalse(Utilidades.esPar(5));
    }

    @Test
    public void testEsParParametroImpar() {
        //assertTrue(Utilidades.esPar(4));
        assertFalse(Utilidades.esPar(5));
    }

    @Test
    public void testMayor() {
        assertEquals(7, Utilidades.mayor(3, 7));
        assertEquals(9, Utilidades.mayor(9, 2));
    }

    @Test
    public void testSaludar() {
        assertEquals("Hola, Ana",
                Utilidades.saludar("Ana"));
    }
}

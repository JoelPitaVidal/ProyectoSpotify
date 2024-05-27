

import static org.junit.Assert.assertEquals;
import javax.swing.JTextField;

import Artistas.SingersInfo;
import org.junit.Before;
import org.junit.Test;

public class SingersInfoTest {
    private SingersInfo singersInfo;

    @Before
    public void setUp() {
        singersInfo = new SingersInfo();
        singersInfo.menuDeBusqueda();
    }

    private void simulateEnterKey(JTextField textField) {
        textField.postActionEvent();
    }

    @Test
    public void testBuscarArtista1() {
        singersInfo.buscador.setText("Ghostmane");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA1, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista2() {
        singersInfo.buscador.setText("Nigth Lovel");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA2, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista3() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA3, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista4() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA4, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista5() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA5, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista6() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA6, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista7() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA7, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista8() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA8, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista9() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA9, singersInfo.mostrarInfo.getText());
    }

    @Test
    public void testBuscarArtista10() {
        singersInfo.buscador.setText("Snoop Dog");
        simulateEnterKey(singersInfo.buscador);
        assertEquals(singersInfo.INFOARTISTA10, singersInfo.mostrarInfo.getText());
    }

}


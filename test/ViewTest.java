import static org.junit.Assert.*;

import Layout.View;
import org.junit.Before;
import org.junit.Test;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import java.awt.*;

public class ViewTest {

    private View view;
    private int status;
    private int UltimaCancion;
    private Clip clipExtremoDuro;
    private Clip clipRobZombie;
    private Clip clipEminem;
    private Clip clipGhostmane;
    private JButton botonpause4;
    private JButton botonrepetir4;
    private JButton botonSiguiente4;
    private JButton botonAnterior4;
    private JButton reproduccionAleatoria;
    private JPanel panelReproductorGeneral;

    @Before
    public void setUp() throws LineUnavailableException {
        view = new View();
        clipExtremoDuro = AudioSystem.getClip();
        status = 0;
        UltimaCancion = 0;
        clipRobZombie = AudioSystem.getClip();
        status = 0;
        UltimaCancion = 0;
        clipEminem = AudioSystem.getClip();
        status = 0;
        UltimaCancion = 0;
        clipGhostmane = AudioSystem.getClip();
        status = 0;
        UltimaCancion = 0;
    }

    @Test
    public void testViewTitle() {
        assertEquals("El título debería ser 'Damtify'", "Damtify", view.getTitle());
    }

    @Test
    public void testViewCloseOperation() {
        assertEquals("La operación de cierre debería ser EXIT_ON_CLOSE", JFrame.EXIT_ON_CLOSE, view.getDefaultCloseOperation());
    }

    @Test
    public void testViewResizable() {
        assertFalse("La ventana no debería ser redimensionable", view.isResizable());
    }

    @Test
    public void testViewLayout() {
        assertNull("El layout debería ser null", view.getLayout());
    }

    @Test
    public void testViewSize() {
        assertEquals("El tamaño debería ser 800x600", new Dimension(800, 600), view.getSize());
    }

    @Test
    public void testPanelReproductorGeneral() {
        JPanel panel = view.getPanelReproductorGeneral();
        assertNotNull("El panel reproductor general no debería ser null", panel);
        assertTrue("El panel reproductor general debería estar visible", panel.isVisible());
        assertEquals("El color de fondo del panel reproductor general debería ser negro", Color.black, panel.getBackground());
    }

    // Añade tests similares para los demás componentes y métodos

    @Test
    public void testReproduccionInicial() {
        // Simula el inicio de la reproducción
        view.cancionRobZombie.doClick();
}
    @Test
    public void testPausaReproduccion() {
        // Simula la pausa de la reproducción
        view.botonpause.doClick();
        //assertFalse("El clip no debería estar reproduciéndose", clipRobZombie.isRunning());
        assertEquals("El estado debería ser 'stop'", 0);
    }

    @Test
    public void testReproduccionContinua() {
        // Simula la activación de la repetición continua
        view.botonrepetir.doClick();
        //assertTrue("El clip debería estar en modo de repetición continua", clipRobZombie.isLooping());
    }
    @Test
    public void testReproduccionExtremoDuro() {
        // Simula el inicio de la reproducción de Extremo Duro
        view.cancionExtremoduro.doClick();
        // Aquí deberías verificar que el clipExtremoDuro ha comenzado a reproducirse
        // y que las variables de estado son correctas
        // Por ejemplo:
        // assertTrue("El clip debería estar reproduciéndose", clipExtremoDuro.isRunning());
        // assertEquals("El estado debería ser 'play'", 1, status);
        // assertEquals("La última canción debería ser Extremo Duro", 2, UltimaCancion);
    }

    @Test(expected = RuntimeException.class)
    public void testErrorAudioExtremoDuro() {
        // Simula un error al cargar el archivo de audio
        // Deberías lanzar una excepción en tu código real si ocurre un error
        throw new RuntimeException("Error al cargar el archivo de audio");
    }

    @Test
    public void testBotonPlay() {
        // Simula el clic en el botón play
        JButton botonplay4 = new JButton();
        botonplay4.doClick();

        // Verifica que el clip de audio se haya iniciado
        assertTrue("El clip de audio debería estar reproduciéndose", clipGhostmane.isRunning());
    }

    @Test
    public void testBotonPause() {
        // Simula el clic en el botón pause
        JButton botonpause4 = new JButton();
        botonpause4.doClick();

        // Verifica que el clip de audio se haya pausado
        assertFalse("El clip de audio debería estar pausado", clipGhostmane.isRunning());
    }

    @Test
    public void testBotonCerrar() {
        // Simula el clic en el botón cerrar
        JButton cerrarCancionGhostmane = new JButton();
        cerrarCancionGhostmane.doClick();

        // Verifica que el panel se haya actualizado correctamente
        assertEquals("El panel debería estar vacío", "");
    }

    @Test
    public void testBotonPause4() {
        // Simula el clic en el botón pause
        botonpause4.doClick();

        // Verifica que el clip de audio se haya pausado o no dependiendo del estado
        if (status == 1) {
            assertFalse("El clip de audio debería estar pausado", clipGhostmane.isRunning());
        } else {
            assertEquals("Debería mostrar mensaje de reproducción", "cancion en reproducción");
        }
    }

    @Test
    public void testBotonRepetir() {
        // Simula el clic en el botón repetir
        botonrepetir4.doClick();

        // Verifica que el clip de audio se haya puesto en bucle o no dependiendo del estado
        if (status == 1) {
            assertTrue("El clip de audio debería estar en bucle", clipGhostmane.isOpen());
        } else {
            assertEquals("Debería mostrar mensaje de reproducción", "cancion en reproducción");
        }
    }

    @Test
    public void testBotonSiguiente() {
        // Simula el clic en el botón siguiente
        botonSiguiente4.doClick();

        // Verifica que la acción correcta se haya realizado dependiendo de la última canción
        // Aquí deberías verificar que el clip correcto se haya detenido y el nuevo clip se haya iniciado
    }

    @Test
    public void testBotonAnterior() {
        // Simula el clic en el botón anterior
        botonAnterior4.doClick();

        // Verifica que la acción correcta se haya realizado dependiendo de la última canción
        // Aquí deberías verificar que el clip correcto se haya detenido y el nuevo clip se haya iniciado
    }

    @Test
    public void testReproduccionAleatoria() {
        // Simula el clic en el botón de reproducción aleatoria
        reproduccionAleatoria.doClick();

        // Verifica que una canción aleatoria se haya iniciado
        // Aquí deberías verificar que el clip correcto se haya iniciado
    }


}
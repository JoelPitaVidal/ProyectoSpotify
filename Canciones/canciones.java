import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class canciones extends artistas{

    String asociarArtistas;

    //La clave del HashMap es el nombre de la canción, el elemento asociado el nombre del Artista
        HashMap<String, String> datosCanciones = new HashMap<String, String>();
        HashMap<String, String> datosCanciones2 = new HashMap<String, String>();
        HashMap<String, String> datosCanciones3 = new HashMap<String, String>();

        artistas arCan = new artistas();


        public HashMap<String, String> darDatosCanciones(){
            // Se obtienen los datos de los artistas
            arCan.darDatosArtistas();

            // Se obtiene un artista aleatorio del primer conjunto de datos de artistas
            String artistaAleatorio = arCan.asociarAartista();

            // Se recorren las claves (nombres de las canciones) del HashMap de datos de artistas
            for (String cancion : arCan.datosArtistas1.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones.put("Hot demon bitches near you", artistaAleatorio);
                datosCanciones.put("\nShutdown", artistaAleatorio);
                datosCanciones.put("\nSmoke weed everyday", artistaAleatorio);
                datosCanciones.put("\nLive sucks so we fuck", artistaAleatorio);
                datosCanciones.put("\nMiss you!", artistaAleatorio);
                datosCanciones.put("El Perro Verde", artistaAleatorio);
                datosCanciones.put("\nPreaty Savage", artistaAleatorio);
                datosCanciones.put("\nDragula", artistaAleatorio);
                datosCanciones.put("\nShorty Party", artistaAleatorio);
                datosCanciones.put("\nSmoke your grass", artistaAleatorio);
            }
            JOptionPane.showMessageDialog(null,datosCanciones);
            return datosCanciones;

        }

    public void listaDeCanciones(){
//TODO: corregier error--> no muestra la lista de canciones
    }
}

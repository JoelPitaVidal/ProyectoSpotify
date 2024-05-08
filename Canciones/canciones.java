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

    // Se obtiene un artista aleatorio del primer conjunto de datos de artistas
    String artistaAleatorio = arCan.asociarAartista();

        public HashMap<String, String> darDatosCanciones(){
            // Se obtienen los datos de los artistas
            arCan.darDatosArtistas();



            // Se recorren las claves (nombres de las canciones) del HashMap de datos de artistas
            for (String cancion : arCan.datosArtistas1.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones.put("\nHot demon bitches near you", artistaAleatorio);
                datosCanciones.put("\nShutdown", artistaAleatorio);
                datosCanciones.put("\nSmoke weed everyday", artistaAleatorio);
                datosCanciones.put("\nLive sucks so we fuck", artistaAleatorio);
                datosCanciones.put("\nMiss you!", artistaAleatorio);
            }
            return datosCanciones;

        }

    public String getDatosCanciones() {
        darDatosCanciones();
        String devolverLista="";
        devolverLista = "\nShutdown ->" + artistaAleatorio+
        "\nHot demon bitches near you\n ->"+artistaAleatorio+
        "\nSmoke weed everyday\n ->"+artistaAleatorio+
        "\nLive sucks so we fuck\n ->"+artistaAleatorio+
        "\nMiss you! ->"+artistaAleatorio;
        return devolverLista;
    }

    public void listaDeCanciones(){
//TODO: corregier error--> no muestra la lista de canciones
    }
}

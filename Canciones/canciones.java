import java.util.HashMap;

public class canciones extends artistas{

    String asociarArtistas;

    //La clave del HashMap es el nombre de la canción, el elemento asociado el nombre del Artista
        HashMap<String, String> datosCanciones = new HashMap<String, String>();
        HashMap<String, String> datosCanciones2 = new HashMap<String, String>();
        HashMap<String, String> datosCanciones3 = new HashMap<String, String>();

        artistas arCan = new artistas();
        HashMap<String, String> guardarArtistas;


        public HashMap<String, String> darDatosCanciones(){
            // Se obtienen los datos de los artistas
            arCan.darDatosArtistas();

            // Se obtiene un artista aleatorio del primer conjunto de datos de artistas
            String artistaAleatorio = arCan.asociarAartista();
            String artistaAleatorio2 = arCan.getAsociarArtistas2();
            String artistaAleatorio3 = arCan.getAsociarArtistas3();

            // Se recorren las claves (nombres de las canciones) del HashMap de datos de artistas
            for (String cancion : arCan.datosArtistas1.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones.put("\nHot demon bitches near you", artistaAleatorio);
                datosCanciones.put("\nShutdown", artistaAleatorio);
                datosCanciones.put("\nSmoke weed everyday", artistaAleatorio);
                datosCanciones.put("\nLive sucks so we fuck", artistaAleatorio);
                datosCanciones.put("\nMiss you!", artistaAleatorio);


            }
            for (String cancion : arCan.datosArtistas2.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones2.put("\nHot demon bitches near you", artistaAleatorio2);
                datosCanciones2.put("\nShutdown", artistaAleatorio2);
                datosCanciones2.put("\nSmoke weed everyday", artistaAleatorio2);
                datosCanciones2.put("\nLive sucks so we fuck", artistaAleatorio2);
                datosCanciones2.put("\nMiss you!", artistaAleatorio2);
            }
            for (String cancion : arCan.datosArtistas3.keySet()) {
                // Se asocia el nombre de la canción con el artista aleatorio
                datosCanciones3.put("\nHot demon bitches near you", artistaAleatorio3);
                datosCanciones3.put("\nShutdown", artistaAleatorio3);
                datosCanciones3.put("\nSmoke weed everyday", artistaAleatorio3);
                datosCanciones3.put("\nLive sucks so we fuck", artistaAleatorio3);
                datosCanciones3.put("\nMiss you!", artistaAleatorio3);
            }
            return datosCanciones;
        }





    public String getDatosCanciones() {
        darDatosCanciones();
        String devolverLista="";
        devolverLista = "Lista aleatoria :" + datosCanciones
        +"\n"
        +"\nLista aleatoria: "+datosCanciones2
        +"\n"
        +"\nLista aleatoria: "+datosCanciones3;
        return devolverLista;
    }
}

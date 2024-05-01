import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class canciones {
    //La clave del HashMap es el nombre de la canción, el elemento asociado el nombre del Artista
        HashMap<String, String> datosCanciones = new HashMap<String, String>();
        HashMap<String, String> datosCanciones2 = new HashMap<String, String>();
        HashMap<String, String> datosCanciones3 = new HashMap<String, String>();




        public HashMap<String, String> darDatosCanciones(){
        artistas arCan = new artistas();

            datosCanciones.put("Hot demon bitches near you", arCan.asociarAartista());
            datosCanciones.put("Smoke weed everyday", arCan.asociarAartista());
            datosCanciones.put("El perro verde", arCan.asociarAartista());
            datosCanciones.put("Shorty Party", arCan.asociarAartista());
            datosCanciones.put("Shutdown", arCan.asociarAartista());

            return datosCanciones;
        }


//        public void listaDeCanciones(){
//TODO: corregier error--> no muestra la lista de canciones
            // Obtener una lista de los valores (nombres de artistas) del HashMap
//          List<String> valores = new ArrayList<>(datosCanciones.values());
            // Generar un número aleatorio entre 0 y el tamaño de la lista - 1
//            Random random = new Random();
//            int indiceAleatorio = random.nextInt(valores.size());
//            String nombreCancion = datosCanciones.get(indiceAleatorio);
            // Devolver el valor (nombre de artista) en el índice aleatorio
//            System.out.println(" Se recomiendan al usuario las siguientes canciones: "+indiceAleatorio +" "+ nombreCancion);

//        }

}

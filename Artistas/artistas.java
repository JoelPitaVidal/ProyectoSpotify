import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class artistas {
    //la clave del HashMap es el nombre de el artista, y su elemento asociado la fecha de inicio de este
    HashMap<String, Integer> datosArtistas1 = new HashMap<>();
    HashMap<String, Integer> datosArtistas2 = new HashMap<>();
    HashMap<String, Integer> datosArtistas3 = new HashMap<>();

    String asociarArtistas;

    public void darDatosArtistas(){

//TODO: Cambiar los nombres de los artistas de los HashMap datosArtistas2 y datosArtistas3

        datosArtistas1.put("Rob Zombie",1980);
        datosArtistas1.put("Eminem",1995);
        datosArtistas1.put("Disturbed",2000);
        datosArtistas1.put("CORPSE",2013);
        datosArtistas1.put("Extremo duro",1975);
        datosArtistas1.put("Cartel de Santa",2005);
        datosArtistas1.put("Blackpink",2010);
        datosArtistas1.put("Ghostmane",1991);
        datosArtistas1.put("Nigth Lovel",1975);
        datosArtistas1.put("Snoop Dog",1979);

        datosArtistas2.put("Rob Zombie",1980);
        datosArtistas2.put("Eminem",1995);
        datosArtistas2.put("Disturbed",2000);
        datosArtistas2.put("CORPSE",2013);
        datosArtistas2.put("Extremo duro",1975);
        datosArtistas2.put("Cartel de Santa",2005);
        datosArtistas2.put("Blackpink",2010);
        datosArtistas2.put("Ghostmane",1991);
        datosArtistas2.put("Nigth Lovel",1975);
        datosArtistas2.put("Snoop Dog",1979);


        datosArtistas3.put("Rob Zombie",1980);
        datosArtistas3.put("Eminem",1995);
        datosArtistas3.put("Disturbed",2000);
        datosArtistas3.put("CORPSE",2013);
        datosArtistas3.put("Extremo duro",1975);
        datosArtistas3.put("Cartel de Santa",2005);
        datosArtistas3.put("Blackpink",2010);
        datosArtistas3.put("Ghostmane",1991);
        datosArtistas3.put("Nigth Lovel",1975);
        datosArtistas3.put("Snoop Dog",1979);


    }

    public void generarLista () {
//Primera Lista
        List<String> keys = new ArrayList<>(datosArtistas1.keySet());
        // Genera un número aleatorio entre 0 y el tamaño de la lista de claves
        Random random = new Random();
//TODO:Esta linea falla, buscar y arreglar el bug
        int randomIndex = random.nextInt(keys.size());
        // Obtiene la clave aleatoria usando el número aleatorio generado
        String randomKey1 = keys.get(randomIndex);
        // Obtiene el valor asociado con la clave aleatoria
        Integer randomValue1 = datosArtistas1.get(randomKey1);

//Segunda Lista
        List<String> keys2 = new ArrayList<>(datosArtistas2.keySet());
        // Genera un número aleatorio entre 0 y el tamaño de la lista de claves
        Random random2 = new Random();
        int randomIndex2 = random2.nextInt(keys2.size());
        // Obtiene la clave aleatoria usando el número aleatorio generado
        String randomKey2 = keys2.get(randomIndex2);

        // Obtiene el valor asociado con la clave aleatoria
        Integer randomValue2 = datosArtistas2.get(randomKey2);
//Tercera Lista
        List<String> keys3 = new ArrayList<>(datosArtistas3.keySet());
        // Genera un número aleatorio entre 0 y el tamaño de la lista de claves
        Random random3 = new Random();
        int randomIndex3 = random3.nextInt(keys3.size());
        // Obtiene la clave aleatoria usando el número aleatorio generado
        String randomKey3 = keys3.get(randomIndex3);

        // Obtiene el valor asociado con la clave aleatoria
        Integer randomValue3 = datosArtistas3.get(randomKey3);



        // Imprime la clave y el valor obtenidos aleatoriamente
        JOptionPane.showMessageDialog(null,"Nombre del artista numero 1 y fecha de inicio:  " + randomKey1 + " , " + randomValue1 + "\n" +
                                                                  "Nombre del artista numero 2 y fecha de inicio: " + randomKey2 + " , " + randomValue2 + "\n" +
                                                                  "Nombre del artista numero 3 y fecha de inicio: " + randomKey3 + " , " + randomValue3);


    }

    public String asociarAartista(){
        List<String> keys = new ArrayList<>(datosArtistas1.keySet());
        // Verificar si hay artistas disponibles
        if (keys.isEmpty()) {
            return null; // Si no hay artistas disponibles, devolver null
        }
        // Generar un número aleatorio entre 0 y el tamaño de la lista de claves
        Random random = new Random();
        int randomIndex = random.nextInt(keys.size());
        // Obtener la clave aleatoria usando el número aleatorio generado
        String randomKey1 = keys.get(randomIndex);
        // Obtener el valor asociado con la clave aleatoria
        Integer randomValue1 = datosArtistas1.get(randomKey1);
        // Devolver el nombre del artista aleatorio
        return randomKey1;
    }
}

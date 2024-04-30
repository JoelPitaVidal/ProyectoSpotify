import java.util.HashMap;

public class artistas {
    //la clave del HashMap es el nombre de el artista, y su elemento asociado la fecha de inicio de este
    HashMap<String, Integer> datosArtistas = new HashMap<String, Integer>();

    public HashMap<String, Integer> darDatosArtistas(){

        datosArtistas.put("Rob Zombie",1980);
        datosArtistas.put("Eminem",1995);
        datosArtistas.put("Disturbed",2000);
        datosArtistas.put("Dilom",2013);
        datosArtistas.put("Marea",1975);
        datosArtistas.put("Cartel de Santa",2005);
        datosArtistas.put("Blackpink",2010);
        datosArtistas.put("Ghostmane",1991);
        datosArtistas.put("Nigth Lovel",1975);
        datosArtistas.put("Snoop Dog",1979);

        return datosArtistas;

    }



}

import javax.swing.*;

public class infoArtistas extends artistas{
    artistas art = new artistas();
    public void DarInfoArtista(){
        JOptionPane.showMessageDialog(null,"La información de el artista NOMBRE es : \n" +
                "Nombre real: Eric Ghoste Whitney \n" +
                "Fecha de nacimiento:");
    }
}

import javax.swing.*;

public class infoArtistas extends artistas{

    artistas art = new artistas();

    final String ARTISTA1 = "Ghostmane";
    final String ARTISTA2 = "Nigth Lovel";
    final String ARTISTA3 = "Snoop Dog";
    final String ARTISTA4 = "Blackpink";
    final String ARTISTA5 = "Cartel de Santa";
    final String ARTISTA6 = "Extremo duro";
    final String ARTISTA7 = "CORPSE";
    final String ARTISTA8 = "Disturbed";
    final String ARTISTA9 = "Eminem";
    final String ARTISTA10 = "Rob Zombie";

    public void DarInfoArtista(){
        String buscarInfo=JOptionPane.showInputDialog("Introduzca el nombre de el artista del que desea usted buscar información");
        switch (buscarInfo) {
            case  ARTISTA1:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA2:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA3:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA4:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA5:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA6:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA7:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA8:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA9:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            case  ARTISTA10:
                JOptionPane.showMessageDialog(null, "La información de el artista NOMBRE es : \n" +
                        "Nombre real: Eric Ghoste Whitney \n" +
                        "Fecha de nacimiento: 15 de abril de 1991 \n " +
                        "Origen: Lake Worth, Florida, Estados Unidos|\n" +
                        "Géneros musicales: Dark trap, noise, hip hop, trap, hip hop, cloud rap, rap Metal" +
                        "Sitio Web: ghostemanemerch.online");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Artista invalido");
        }
    }
}
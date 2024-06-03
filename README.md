Descripción del proyecto de fin de curso:

Mi proyecto consiste en un reproductor de audio que trata de simular a Spotify, 
consta de un panel central dividido en otros paneles más pequeños para facilitar
el manejo de las diferentes funciones, primero consta de un botón de inicio de 
sesión el la parte superior que permite iniciar sesión con un usuario, debajo de
ese botón tenemos un JTextArea, superpuesto encima de un panel del mismo tamaño, 
en el que se muestran listas aleatorias de canciones. En el centro del panel tenemos
un espacio para que aparezca el reproductor de la canción cuyo botón hallamos pulsado, 
debajo de ese reproductor tenemos un botón de reproducción aleatoria, el cual con un objeto 
random  decide entre una de las cuatro canciones disponibles y la reproduce, debajo de este
hay un botón de ayuda al usuario, que abre un pequeño panel con  un JLabel que muestra un texto 
explicando las funciones básicas del programa.


En la parte superior derecha de este tenemos cuatro botones con la imagen de los artistas autores 
de las canciones disponibles, estos botones son los que al pulsarse abren el reproductor del centro 
del panel general y hacen aparecer el botón para cerrar este y que vuelva a desaparecer. Por ultimo 
debajo de estos cuatro botones tenemos el botón para abrir el buscador de Artistas, este abre un panel 
con un JTextField en el que escribir el nombre del artista cuya información se desea buscar y un JTextArea 
en el que mostrarla.



Inicio de sesión

El inicio de sesión está configurado en la clase DataBase, dentro del package  Users, esta consta de un método llamado ConexionBaseDeDatos 
,  este consta de un try-catch, dentro del try se hace la conexión a la base de datos de postgres utilizando getConnection, donde establecemos la ruta a la base de datos
, el nombre del usuario y la contraseña, dentro del catch recogemos la excepción producida por el fallo de la conexión en caso de que esta no sea posible 
e informamos por consola del fallo. Los siguientes métodos configuran el  panel que aparece al pulsar el botón de inicio de sesión, y el último método se encarga de recoger 
elnombre del JTextArea y compararlo con el de la base de datos, y en caso de coincidencia muestra los datos del usuario.


Listas aleatorias de canciones

En el panel inferior se muestran tres listas de canciones, cada una consta de cinco canciones aleatoriamente escogidas 
de diferentes ArrayList,  tres métodos diferentes en la clase singers recogen aleatoriamente  cinco canciones aleatorias de la clase 
RandomSongs y en la clase Singers se recogen del HashMap de artistas tres de ellos aleatoriamente escogidos, las canciones y el artista
escogidos para cada lista van a parar a la clase RandomSongs, donde se introducen en 3 Hashmap diferentes, los cuales se muestran  en un método 
llamado getDatosCanciones, el cual es llamado desde la clase view


Menú de reproducción y botones

El menú de reproducción de las canciones disponibles aparece al pulsar el botón correspondiente,
cada uno de los siguientes botones abre su propio reproductor, este consta de un panel con un botón de play 
para iniciar la reproducción de la canción, otro de pausa para pararla, uno de anterior canción y otro de siguiente,
y otro para añadirlas a una lista personal de canciones. Debajo de el panel principal encontramos un botón de 
fin de reproducción, que cerrará todo el reproductor y a si mismo. 


En el centro del panel, debajo de el espacio para el reproductor nos encontramos un botón de reproducción aleatoria,
este elige aleatoriamente una de las cuatro canciones basandose en el orden que estas tienen, y utilizando doclick
pulsa el botón del reproductor de la canción seleccionada y luego el botón de play para iniciar la reproducción

Y finalmente tenemos el botón de ayuda, que abre un panel independiente con un JLable con instrucciones sobre las 
funciones del programa, algún defecto del mismo y consejos variados que pueden ayudar al usuario




Buscador de información de artistas

La última de las funciones del programa consta de un buscador de información sobre los diferentes artistas disponibles, 
este botón abre un panel de 300 x 600 pixeles, consta de un JTextField en el que  el usuario escribe el nombre del 
Artista cuya información desea encontrar,  al pulsar la tecla intro, se guarda lo que a escrito el usuario y se  imprime
en otro panel situado en la parte inferior la información del susodicho artista, 




Tecnologías Utilizadas

La tecnología más destacable utilizada en este proyecto son los Clips, este se utiliza para la reproducción de audio,
lo primero que hay que hacer para  habilitar la reproducción de audio de esta forma es conseguir el archivo de audio
en el formato .wav, que es el soportado por las sentencias utilizadas, en este caso lo siguiente  es configurar la 
reproducción del audio.


Dentro del ActionEvent del botón de play, crear la variable audioInputStream, de tipo AudioInputStream, que permite acceder 
a los mezcladores de audio del sistema y lo más importante, permite leer los archivos de audio desde el equipo,  
el siguiente paso es crear una variable tipo string con la ruta del archivo de audio.

Procedemos a iniciar un try-catch en el que igualamos la variable audioInputStream a un Audiostream con getAudioStream, 
en la que como parametros establecemos la variable con  la ruta al archivo y un getAbsoluteFile que devuelve el objeto de 
archivo absoluto de la ruta de acceso abstracta dada.

Finalmente utilizamos la variable Clip creada antes para obtener dicho clip de forma definitiva, luego procedemos a abrirla 
con la variable audioInputStream antes creada y con clip.start() lo iniciamos, igualando el estado a 1 para poder modificar 
el estado de la canción si es necesario utilizando esa variable.

Cerramos el try catch capturando las posibles excepciones que puedan surgir, que el archivo de audio no esté soportado, que halla un 
fallo en el propio audio o que no sea capaz de acceder al archivo.



![Diagrama de Clases]()

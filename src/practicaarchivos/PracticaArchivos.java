package practicaarchivos;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class PracticaArchivos {
public static void main(String[] args) {

        String nombre[] = {
            "Regina",
            "Gabriela",
            "Pamela",
            "David",
            "Daniel",
            "Arturo",
            "Alba",
            "Araceli",
            "Ismael",
            "Dulce",
            "Sofia",
            "Jorge",
            "Lilia",
            "Cynthia",
            "Guadalupe"
            
        };
        
        for (int contador = 0;
               contador < nombre.length; contador++ )
        
         try {
        Files.write(
             Paths.get("archivo.txt"),
                (nombre[contador] + "\r\n").getBytes(),
             StandardOpenOption.APPEND);
      }catch (IOException e){
         
      }
          
      }
    }
    


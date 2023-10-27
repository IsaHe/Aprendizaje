package Prog3.Clase.Ficheros;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Clase27deOctubre {
    public static void main(String[] args) {
        Path path = Paths.get(""); //Consigo la ruta al directorio actual
        System.out.println(path.toAbsolutePath()); //Imprimo la ruta absoluta

        for (File f : Objects.requireNonNull(path.toFile().listFiles(f -> f.isFile() && f.getName().endsWith(".c")))) {
            System.out.println(f);
        }
    }
}

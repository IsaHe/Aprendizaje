package Prog3.Clase;


import java.util.StringTokenizer;

public class TokenizerUsage {
    public static void main(String[] args) {
        System.out.println(palabraMasLarga(
                "En un mundo cada vez más interconectado e impulsado por la tecnología las personas se enfrentan a" +
                        " una creciente complejidad en sus vidas diarias ya que deben adaptarse constantemente a nuevos " +
                        "avances y desafíos aprender a utilizar herramientas digitales mantenerse al tanto de las " +
                        "últimas tendencias en un flujo constante de información y equilibrar sus vidas en línea con " +
                        "sus relaciones en el mundo real todo ello mientras navegan por un panorama laboral en constante " +
                        "evolución que demanda habilidades y competencias cada vez más diversas y adaptables lo que nos " +
                        "lleva a reflexionar sobre la importancia de la educación continua y el desarrollo personal como " +
                        "medios para prosperar en esta era de cambio acelerado"));
    }

    static String palabraMasLarga(String texto){

        StringTokenizer st = new StringTokenizer(texto);
        String palabraMasLarga = "";

        while(st.hasMoreTokens()){
            String palabra = st.nextToken();
            if(palabra.length() > palabraMasLarga.length()){
                palabraMasLarga = palabra;
            }
        }

        return palabraMasLarga;
    }
}

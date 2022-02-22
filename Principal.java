package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena frase1 = new Cadena();
        System.out.println("Ingrese una frase");
        String frase = read.next();
        frase1.setFrase(frase);
        frase1.setLongitud(frase.length());
        frase1.mostrarVocales();
        frase1.invertirFrase();
        System.out.println("Ingresar una letra");
        String letra = read.next();
        frase1.vecesRepetido(letra);
        System.out.println("Ingresar una nueva frase");
        String frase2=read.next();
        frase1.compararLongitud(frase2);
        System.out.println("Ingresar una nueva frase");
        String frase3=read.next();
        frase1.unirFrase(frase3);
        System.out.println("Ingresar un caracter");
        String caracter=read.next();
        frase1.reemplazar(caracter);
        System.out.println("Ingrese otra letra");
        String letra2=read.next();
        frase1.contiene(letra2);
    }
    
}

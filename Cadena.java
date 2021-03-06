package Ejercicio8;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public void mostrarVocales() {
        int contv = 0;
        for (int i = 0; i < longitud; i++) {
            if (this.frase.charAt(i) == 'a' || this.frase.charAt(i) == 'e' || this.frase.charAt(i) == 'i' || this.frase.charAt(i) == 'o' || this.frase.charAt(i) == 'u') {
                contv++;
            }
        }
        System.out.println("La frase ingresada tiene: " + contv + " vocales");
    }

    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = longitud - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {
        int contl = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                contl++;
            }
        }
        System.out.println("La frase contiene " + contl + " veces la letra ingresada");
    }

    public void compararLongitud(String frase2) {

        if (frase2.length() == this.frase.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }

    }

    public void unirFrase(String frase3) {
        System.out.println(frase + " " + frase3);
    }

    public void reemplazar(String caracter) {
        String reemplazo;
        reemplazo = this.frase.replace("a", caracter);
        System.out.println("La frase con el caracter: " +caracter+" resulta en: "+ reemplazo);
    }
public void contiene(String letra2){
    if (this.frase.contains(letra2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

}
}
/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se crear?? el objeto y se le pedir?? al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a trav??s de los m??todos set, se guardar?? la frase y la longitud de manera
autom??tica seg??n la longitud de la frase ingresada. Deber?? adem??s implementar los
siguientes m??todos:
??? M??todo mostrarVocales(), deber?? contabilizar la cantidad de vocales que tiene la
frase ingresada.
??? M??todo invertirFrase(), deber?? invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
??? M??todo vecesRepetido(String letra), recibir?? un car??cter ingresado por el usuario
y contabilizar cu??ntas veces se repite el car??cter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El car??cter 'a' se repite 4 veces.
M??todo compararLongitud(String frase), deber?? comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
??? M??todo unirFrases(String frase), deber?? unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
??? M??todo reemplazar(String letra), deber?? reemplazar todas las letras ???a??? que se
encuentren en la frase, por alg??n otro car??cter seleccionado por el usuario y
mostrar la frase resultante.
??? M??todo contiene(String letra), deber?? comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/

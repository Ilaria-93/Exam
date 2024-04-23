/* **Ricerca Elemento Array:**
   - Crea una classe `ArraySearch` con un attributo array di interi.
   - Implementa un metodo per cercare un numero specifico
   nell'array e stampare se è presente o meno.
   - Implementa un metodo per trovare e stampare la posizione
   (indice) del primo elemento pari presente nell'array.
   - Utilizza la classe e la funzione nel main
*/

public class Main {
    public static void main(String[] args) {
        ArraySearch search = new ArraySearch();
        int[] arrayDiInteri = {1, 6, 13, 22, 35, 46};
        System.out.println("Il numero specifico nell'array è presente: " + search.cercaNumeroSpecifico(arrayDiInteri,3));
        System.out.println("La posizione del primo elemento pari è: " + search.trovaPosizioneIndice(arrayDiInteri));
    }
}
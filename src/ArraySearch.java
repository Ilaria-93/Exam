public class ArraySearch {
    //private int[] arrayDiInteri = {1, 6, 13, 22, 35, 46};

    public boolean cercaNumeroSpecifico(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int trovaPosizioneIndice (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                return i;
            }
        }
        return 0;
    }
}



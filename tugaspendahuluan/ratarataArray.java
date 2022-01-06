package tugaspendahuluan;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ratarataArray {
    
    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Deklarasi Array
        int[] data = {4,6,4,2,8,4,2,11};

        double total = 0;

        // Looping untuk menjumlahkan semua element array ke variabel total
        for(int i = 0; i < data.length; i++) {
            total += data[i];
        }

        // Variabel total dibagi banyak nya element array
        double average = total / data.length;
        System.out.println("Nilai Total Array : " + total);
        System.out.println("Nilai Rata Rata Array : " + average);

    }
}

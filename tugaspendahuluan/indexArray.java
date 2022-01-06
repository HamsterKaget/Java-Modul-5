package tugaspendahuluan;

import javax.swing.*;
import java.util.Arrays;

public class indexArray {
    
    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Deklarasi Array
        int[] data = {4,6,4,2,8,4,2,11};

        // Mengambil Input
        String input = JOptionPane.showInputDialog("Masukan Nilai Element");

        // Casting Input yang tadinya String menjadi Integer
        int request = Integer.parseInt(input);

        System.out.println("===== Mencari Index Array =====\n");

        // Looping 
        for (int index = 0; index < data.length; index++) {
            // Kondisi di jalankan jika data[index] cocok dengan value "request" yang tadi di inputkan
            if(data[index] == request) {
                System.out.println("nilai " + request + " ada di index " + index);
            }
        }

        /* Code dibawah bisa digunakan juga , tetapi saat value terdapat lebih dari 1
        dia hanya mengeluarkan output index paling terakhir , jadi saya buat code diatas agar
        kalau value memiliki index lebih dari satu , maka dia akan me loop sampe selesai 
        dengan begitu semua index yang memeiliki value dari input yang dimasukan bisa ketauan semua */

        int index = Arrays.binarySearch(data, request);
        System.out.println("nilai " + request + " ada di index " + index);
        

    }
}

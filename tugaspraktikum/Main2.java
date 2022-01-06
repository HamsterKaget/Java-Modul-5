import java.util.Scanner;
import javax.swing.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {

    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {

        // Mengambil input Nim 
        String inputNim = JOptionPane.showInputDialog("Masukan Nim Kamu");

        // Casting Dari String ke Integer
        int nim = Integer.parseInt(inputNim);

        
        // Buat Pengkondisian jika nim genap , semua input dilakukan dengan JOptionPane
        // Jika nim ganjil , semua input dilakukan menggunakan console 
        if(nim % 2 == 0) {
            
            JOptionPane.showMessageDialog(null, "nim kamu termasuk nim genap, silahkan memasukan input menggunakan tab selanjutnya dengan mengklik OK");

            /* Code Bagian Input Jumlah & Element Array */
            System.out.println("===== Input Jumlah Array dan Element Array =====\n");

            // Membaca Input Jumlah Array yang akan dibuat
            String inputJumlah = JOptionPane.showInputDialog("Masukan Jumlah Element Array yang Ingin Dibuat");

            // Casting String ke Integer
            int jumlahArray = Integer.parseInt(inputJumlah);

            System.out.println("Jumlah Array Yang Dibuat Adalah : " + jumlahArray + "\n");

            // Membuat Array sesuai dengan jumlah yang di inputkan
            int data[] = new int[jumlahArray];

            // Looping Hingga Semua index Array Terisi
            for(int a = 0 ; a < data.length; a++) {
                // Mengambil Input
                String input = JOptionPane.showInputDialog(null, "Masukan Element Index ke " + a);
                // Casting input dari String ke Integer
                data[a] = Integer.parseInt(input);

                // Logging nilai Array yang baru dimasukan
                System.out.println("Index ke " + a + " Adalah : " + data[a]);
            }

            // Tampilkan Array yang baru saja dimasukan
            JOptionPane.showMessageDialog(null, "Data Array Yang Kamu Masukan \n" + Arrays.toString(data));
            System.out.println("\nData Array Yang Kamu Masukan \n" + Arrays.toString(data));
            
            /* Code Untuk Mencari Minimal dan Maksimal Serta Posisi Index nya */
            System.out.println("\n==== Mencari Nilai Maksimal dan Minimal Serta Posisi Index nya ====\n");

            int max = data[0];
            int min = data[0];

            for(int b = 0; b < data.length; b++) {
                
                if(max < data[b]) {
                    max = data[b];

                } else if (min > data[b]) {
                    min = data[b];

                }

            }

            int indexMax = 0;
            int indexMin = 0;


            for(int c = 0; c < data.length; c++) {
                if(data[c] == max) {
                    indexMax = c;

                } else if(data[c] == min) {
                    indexMin = c;

                }


            }

            JOptionPane.showMessageDialog(null, "Nilai Terbesar Adalah : " + max + " Yang Terdapat Pada Index ke " + indexMax + "\n" +
            "Nilai Terkecil Adalah  : " + min + " Yang Terdapat Pada Index ke " + indexMin);

            System.out.println("Nilai Terbesar Adalah : " + max + " Yang Terdapat Pada Index Ke " + indexMax);
            System.out.println("Nilai Terkecil Adalah : " + min + " Yang Terdapat Pada Index Ke " + indexMin);

            /* Code Bagian Mencari Total dan Rata Rata Array */
            System.out.println("\n ==== Jumlah Total dan Rata Rata Array ==== \n");

            int total = 0;

            for(int d = 0; d < data.length; d++) {
                total += data[d];
            }

            int average = total / data.length;

            System.out.println("Nilai Total Array ini Adalah : " + total);
            System.out.println("Nilai Rata Rata Array ini Adalah : " + average);

            JOptionPane.showMessageDialog(null, "Nilai Total Array ini Adalah : " + total);
            JOptionPane.showMessageDialog(null, "Nilai Rata Rata Array ini Adalah : " + average);

            int totalGanjil = 0;

            for(int e = 0; e < data.length; e++) {
                if(data[e] % 2 != 0) {
                    totalGanjil += data[e];
                }
            }
        
            System.out.println("Semua Total Ganjil : " + totalGanjil);

            if(totalGanjil % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Nilai Total Termasuk Angka Genap");
            } else if (totalGanjil % 2 != 0) {
                JOptionPane.showMessageDialog(null, "Nilai Total Termasuk Angka Ganjil");
            }


            /* Code Untuk Mengurutkan Element Array */
            Arrays.sort(data);

            System.out.println("==== Arrays Setelah Di Sorting ====");
            System.out.println(Arrays.toString(data));
            
            JOptionPane.showMessageDialog(null, "Data Arrays Setelah Di Sorting \n" + Arrays.toString(data));
            

    




        } else if (nim % 2 != 0) {
            JOptionPane.showMessageDialog(null, "nim kamu termasuk nim ganjil, silahkan memasukan input menggunakan console dengan mengklik OK");
        }













    }
    
}

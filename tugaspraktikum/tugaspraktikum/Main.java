package tugaspraktikum;

// Import class / library yang dibutuhkan
import javax.swing.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {

        // Deklarasi Array 
        int data[] = new int[10];

        // Looping Hingga Semua index Array Terisi
        for(int a = 0 ; a < data.length; a++) {
            // Mengambil Input
            String input = JOptionPane.showInputDialog(null, "Masukan ELement Index ke " + a);
            // Casting input dari String ke Integer
            data[a] = Integer.parseInt(input);

            // Logging nilai Array yang baru dimasukan
            System.out.println("Index ke " + a + " Adalah : " + data[a]);
        }
            

        // Print Semua Element Array ke dalam String
        System.out.println();
        System.out.println("Data Array \n " + Arrays.toString(data));



        // Mencari Nilai Minimal & Maksimal dalam array
        System.out.println("\n===== Minimal & Maksimal =====\n");

        // Deklarasi Variabel
        int max = data[0];
        int min = data[0];

        // Looping
        for(int n = 0; n < data.length; n++) {
            // Jika data[n] lebih besar dari max , maka nilai max di update menjadi data[n]
            if(max < data[n]) {
                max = data[n];
            }
            // Jika data[n] lebih kecil dari min , maka nilai min di update menjadi data[n]
            if(min > data[n]) {
                min = data[n];
            }
        }



        //  Mencari Posisi Index Dari Element Maksimal dan Minimal
        for(int j = 0; j < data.length; j++) {
            if(data[j] == max) {
                System.out.println("Nilai Maksimal Adalah : " + max + " Yang Terdapat Pada Index : " + j);
            }

            if(data[j] == min) {
                System.out.println("Nilai Minimal Adalah : " + min + " Yang Terdapat Pada Index : " + j);
            }
        }



        // Mencari Rata Rata Array
        System.out.println("\n===== Nilai Rata Rata =====\n");

        // Deklarasi Variabel
        double total = 0;

        // Looping untuk Menambah Semua Array ke Variabel total
        for(int b = 0; b < data.length; b++) {
            total += data[b];
        }

        // Rata Rata Array 
        double average = total / data.length;

        System.out.println("Nilai Total Adalah : " + total);
        System.out.println("Nilai rata - rata adalah : " + average);


        // Mencari Posisi Index Dari Suatu Elemen 
        System.out.println("\n==== Mencari Index & Mengubah Nilai dari suatu index ====\n");


        // Membaca Input

        String input = JOptionPane.showInputDialog("Masukan Nilai Element Yang Ingin Kamu Cari");

        // Casting input Dari String Ke Integer
        int request = Integer.parseInt(input);

        for (int index = 0; index < data.length; index++) {
            // Kondisi di jalankan jika data[index] cocok dengan value "request" yang tadi di inputkan
            if(data[index] == request) {
                JOptionPane.showMessageDialog(null, "nilai " + request + " ada di index " + index);
                int x = JOptionPane.showConfirmDialog(null, "Ubah Nilai Dari index ini ?", "Program Array", JOptionPane.YES_NO_CANCEL_OPTION);

                switch ( x ) {
                    case 0:
                    String inputArray = JOptionPane.showInputDialog("Masukan Nilai Baru");
                    
                    int nilaiBaru = Integer.parseInt(inputArray);

                    data[index] = nilaiBaru;

                    JOptionPane.showMessageDialog(null, "Berhasil Mengubah Index ke : " + index + " Menjadi : " + nilaiBaru);

                    JOptionPane.showMessageDialog(null, Arrays.toString(data));
                    System.out.println("Data Array Yang Baru\n" + Arrays.toString(data));
                    break;
                    default :
                    JOptionPane.showMessageDialog(null, "Kamu Tidak Mengubah Array Manapun");
                }
                

            }
               
        }




        





    }
}

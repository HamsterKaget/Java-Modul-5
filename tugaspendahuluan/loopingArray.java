package tugaspendahuluan;

public class loopingArray {
    
    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Deklarasi Array
        int data[] = {4,6,4,2,8,4,2,11};

        // Looping Array Menggunakan while Method
        System.out.println("Looping Array Menggunakan While");
        int i = 0;
        while ( i < data.length ) {
            System.out.println(data[i]);
            i++;
        }

        // Looping Array Menggunakan do - while Method
        System.out.println("Looping Array Menggunakan do - while");
        int j= 0;
        do {
            System.out.println(data[j]);
            j++;
        } while ( j < data.length );


        // Looping Array Menggunakan for Method
        System.out.println("Looping ARray Menggunakan for ");
        for ( int n = 0; n < data.length; n++) {
            System.out.println(data[n]);
        }

        // Looping Array Menggunakan for each method
        System.out.println("Looping Menggunakan for each");
        for(int n : data) {
            System.out.println(n);
        }
    }
}

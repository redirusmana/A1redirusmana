
package redirprima;

// mengimpor Scanner ke program
import java.util.Scanner;

public class RedirPrima {
   
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in); //membuat object scanner untuk inputan angka
        Scanner txt = new Scanner(System.in); //membuat object scanner untuk inputan text atau ENTER
        
        int i, j, x, a=0,b=0; // Pendeklarasian Varibale bertipe data Integer
        boolean prima; // Pendeklarasian Varibale bertipe data Boolean
        int[] arr=new int[1000]; // Pendeklarasian Array of Integer
        String iu; //Pendeklarasian Varibale bertipe data String
        
        do{ // do while yang berfungsi untuk mengulang program ke awal setelah selesai
        System.out.println("Bilangan PRIMA"); // Menampilkan output ke User
        System.out.println("====================");  // Menampilkan output ke User
        System.out.print("Masukkan bilangan Prima ke - : "); // Menampilkan output ke User
        x = num.nextInt();//menggunakan scanner dan menyimpan apa yang diketik di variabel x  
        
        for (i=1;i<=1000;i++){ //perulangan dari 1 sampai seribu sesuai dengan index arraynya
            prima=false; // inisialisasi variable prima jadi false
            
            if (i==2){ // pengecekan kondisi apakah i sama dengan 2
                prima=true; // jika iya, maka variable prima jadi true
            } // 2 merupakan nilai pertama prima,juga nilai prima paling kecil, karena 1 tidak termasuk prima
            
            else{ //jika tidak, maka lanjut ke proses berikutnya
                for (j=2;j<i;j++){ // Perulangan dari j yang bernilai 2 sampai i yang bernilai 1000
                    if (i % j==0){ // pengecekan kondisi menggunakan modulus(%),
                        prima=false;//logikanya bilangan prima ialah bilangan yang tidak menghasilkan 0 ketika menggukanan mod
                        //ketika sama dengan 0 maka itu bukan bilangan prima
                        break; // break untuk keluar dari proses perulangan, dan melanjutkan keproses berikutnya
                    }
                    else{ //jika hasil modulus tidak sama dengan 0 
                    prima=true;//maka variable i itu bilangan prima
                    }
                }                
            }
            
            if (prima==true){//pengecekan kondisi apakah prima true
                a++;//variable yang di increment untuk mengisi index si Array arr
                arr[a]=i; //Array arr di assigment dengan nilai i yang merupakan bilangan prima, melalui beberapa proses diatas
            }     
        }
        
        for (i=1;i<=x;i++){ //perulangan i sampai x sesuai inputan kita
             System.out.print(arr[i]+" "); // Menampilkan output ke User yang menampilkan nilai pada Array arr yang isinya bilangan prima
        }        
        System.out.println(); // garis baru
        System.out.println(arr[x]+" adalah bilangan prima ke - "+x); // Menampilkan output nilai terakhir sesuai jumlah ke - x
        
        System.out.println();// garis baru
        System.out.print("Tekan Enter untuk mengulang!"); // Menampilkan output ke User
        System.out.println();// garis baru
        iu=txt.nextLine(); // menggunakan scanner dan menyimpan apa yang diketik di variabel iu        
        }while(iu.isEmpty()); //do while yang berfungsi untuk mengulang program ke awal setelah selesai
        // ketika varible iu kosong atau hanya ditekan enter, maka program akan berulang ke awal
        // namun ketika varible iu berisi character,angka ataupun yang lain, maka program akan berhenti
        
        System.out.println(" --- Selesai ---");//Menampilkan output ke User
        
        

    
        
    }   
}

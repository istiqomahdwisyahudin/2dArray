package array2d;
import java.util.Scanner;
/**
 *
 * @author istiqomah dwi syahudin
 * NIM E41200821
 * TIFB
 */
public class Array2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        int siswa,jml, banyakUjian = 3, nilai[][], ntt[], ntr[];
        float rata[], jumlah[], rtt, rtr;
        
       
        System.out.print("Masukkan Jumlah Siswa : ");
        siswa = input.nextInt();
        
       
        nilai = new int[siswa][banyakUjian];
        jumlah = new float[siswa];
        rata = new float[siswa];
        ntt = new int[banyakUjian];
        ntr = new int[banyakUjian];
        
        System.out.println();
        
       
        for(int h=0;h<siswa;h++){ 
            System.out.println("Siswa " + (h+1));
            
            for(int i=0;i<banyakUjian;i++){       
                System.out.print("Nilai Ujian " + (i+1) + " : ");
                nilai[h][i] = input.nextInt();
                
                
                jumlah[h] = jumlah[h] + nilai[h][i];
            }
            
            rata[h] = jumlah[h]/banyakUjian;
            System.out.println();
        }
       
       
        for(int i=0;i<banyakUjian;i++){
            ntt[i] = nilai[0][i];
            ntr[i] = nilai[0][i];
        }
        
       
        rtt = rata[0];
        rtr = rata[0];
        
        
        for(int i=0;i<banyakUjian;i++){
            for(int j=0;j<siswa;j++){
                if(ntt[i] < nilai[j][i]){
                    ntt[i] = nilai[j][i];
                }
                if(ntr[i] > nilai[j][i]){
                    ntr[i] = nilai[j][i];
                }
            }
        }
        
        
        for(int i=0;i<siswa;i++){
            if(rtt < rata[i]){
                    rtt = rata[i];
                }
                if(rtr > rata[i]){
                    rtr = rata[i];
                }
        }
       
        
        System.out.println("---------------------------");
        System.out.println("Daftar Nilai Siswa : ");
        System.out.println("---------------------------");
        System.out.println();
        
        System.out.println("\t\tUjian 1\tUjian 2\tUjian 3\tRata-rata");
        
     
        for(int j=0;j<siswa;j++){
            System.out.print("Siswa " + (j+1));
            for(int k=0;k<banyakUjian;k++){
                System.out.print("\t" + nilai[j][k]);
            }
            System.out.print("\t" + rata[j]);
            System.out.println();
        }
        
        System.out.println();
        
       
        System.out.print("Nilai Tertinggi\t");
        for(int j=0;j<banyakUjian;j++){//Nilai tertinggi
            System.out.print(ntt[j] + "\t");
        }
        System.out.print(rtt);//Rata-rata tertinggi
        System.out.println();
        
        
        System.out.print("Nilai Teredah\t");
        for(int j=0;j<banyakUjian;j++){//Nilai terendah
            System.out.print(ntr[j] + "\t");
        }
        System.out.print(rtr);//Rata-rata terendah
        System.out.println();
    
    }    
}

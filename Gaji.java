 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;

    public static int Gaji() {
            int gaji = 0;
            if (masaKerja < 5) {
                gaji = 5000000;
            } else if (masaKerja >= 5 && masaKerja <= 10) {
                gaji = 7500000;
            } else {
                gaji = 10000000;
            }
            return gaji;
        }

        public static int honorLembur(int lebihJamKerja) {
            int honor = 0;
            if (masaKerja < 5) {
                honor = 40000;
            } else if (masaKerja >= 5 && masaKerja <= 10) {
                honor = 50000;
            } else if (masaKerja > 10) {
                honor = 75000;
            }
            return honor * lebihJamKerja;
        }
 
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan masa kerja : ");
        masaKerja = input.nextInt();

        System.out.print("Masukan jam lembur : ");
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        Gaji();
        honorLembur(jamLembur);

        System.out.println(honorLembur(jamLembur) + Gaji()); 
     
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}

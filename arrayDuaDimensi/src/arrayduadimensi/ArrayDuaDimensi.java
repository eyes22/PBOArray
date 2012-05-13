/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayduadimensi;

/**
 *
 * @author Nda Edogawa
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDuaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
         
        String jml_mhs ="";
        int jmlah_int;
        int i;
        String NIM = null,Nama = null,tugas=null,UTS=null,UAS = null;
        String NIM_arr [] = new String[100];
        String Nama_arr [] = new String[100];
        int No [] = new int[100];
        String grade[] = new String[100];
        int tugas_int[] =new int[100];
        int UTS_int [] = new int[100];
        int UAS_int [] = new int[100];
        int akhir [] = new int[100];
        double nilai_akhir [] = new double[100] ;
        
        System.out.print("Masukkan Jumlah Mahasiswa : " );
        try

            {

		jml_mhs = dataIn.readLine();

            }

        catch( IOException e )

            {

		System.out.println("Error!");

            }

                jmlah_int = Integer.parseInt(jml_mhs);



            for ( i=1;i<=jmlah_int;i++)

        {

           try

            {

               System.out.print("Masukkan NIM             : ");

               NIM = dataIn.readLine();

               System.out.print("Masukkan Nama            : ");

               Nama = dataIn.readLine();

               System.out.print("Masukkan Nilai Tugas     : ");

               tugas = dataIn.readLine();

               System.out.print("Masukkan Nilai UTS       : ");

               UTS = dataIn.readLine();

               System.out.print("Masukkan Nilai UAS       : ");

               UAS = dataIn.readLine();

               System.out.println(" ");

            }

            catch( IOException e )

            {

		System.out.println("Error!");

            }

               tugas_int [i] = Integer.parseInt(tugas);

               UTS_int [i] = Integer.parseInt(UTS);

               UAS_int [i] = Integer.parseInt(UAS);

               NIM_arr [i] = (NIM);

               Nama_arr [i] = (Nama);

               No[i]=i;

               nilai_akhir [i] = ((double)0.30*(double)tugas_int[i])+((double)0.35*(double)UTS_int[i])+((double)0.35*(double)UAS_int[i]);



               if (nilai_akhir[i]<=100)grade[i]="A";

               if (nilai_akhir[i]<=85)grade[i]="B";

               if (nilai_akhir[i]<=75)grade[i]="C";

               if (nilai_akhir[i]<=60)grade[i]="D";

               if (nilai_akhir[i]<=45)grade[i]="E";

               if (nilai_akhir[i]>100)grade[i]=" ";

        }



                       System.out.println("No         "+"NIM                 "+"Nama                 "+"Nilai Akhir                 "+"Grade        ");



             for ( i=1;i<=jmlah_int;i++){

                 System.out.println(No[i]+"          "+NIM_arr[i]+"           "+Nama_arr[i]+"                 "+nilai_akhir[i]+"                        "+     grade[i]);

             }


    }
}

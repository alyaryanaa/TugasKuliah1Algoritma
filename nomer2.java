package tugas1;

import java.util.Scanner;

public class nomer2 {

    public static void main(String[] args) {
        int total=0;
    Scanner input = new Scanner(System.in);
    
    System.out.println("---    MASUKAN DATA     ---");
    System.out.print("MASUKAN JUMLAH DATA MAHASISWA : ");
    int masukan = input.nextInt();

    String []nama = new String[masukan];
    
    int[][] nil =new int[masukan][2];
    for( int i = 0; i < nil.length; i++ ){
        System.out.println("Mahasiswa Ke "+(i+1)+" : ");
        System.out.print("Nama = ");
        nama[i] = input.next();
        
        for (int kolom=0; kolom<2; kolom++){
            if (kolom==0)
                System.out.print("UTS = ");
            else if (kolom==1)
                System.out.print("UAS = ");
            
        System.out.print("");
        nil[i][kolom]=input.nextInt();
        }
    }
    
    System.out.println("NO\tNAMA\tUTS\tUAS\ttotal\trata-rata");
    System.out.println("=======================================================");
         for (int i=0; i<masukan;i++) {
            total=nil[i][0]+nil[i][1];
            double rata=(double) total/2;
            System.out.println((i+1)+"\t"+nama[i]+"\t"+nil[i][0]+"\t"+nil[i][1]+"\t"+total+"\t"+rata);
        
         }
    }
    
}
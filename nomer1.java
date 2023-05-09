package tugas1;

import java.util.Scanner;

public class nomer1 {

    public static void main(String[] args) {
        float total = 0;
    
    Scanner input = new Scanner (System.in);
 
    System.out.print("Berapa masukan nilai mahasiswa : ");
    int masukan=input.nextInt();
    
    String []nama=new String [masukan];
    float []nilai=new float [masukan];
   
    for(int i=0; i<masukan; i++){
    System.out.print("masukan nama mahasiswa : ");
    nama [i]=input.next();
    System.out.print("masukan nilai mahasiswa : ");
    nilai [i]= input.nextFloat();
    
    total=total+nilai[i];
    }
    
    System.out.println("total nilai mahasiswa : " +total);
    System.out.println("Berapa rata-rata nilai mahasiswa : "+(total/masukan));

}
}
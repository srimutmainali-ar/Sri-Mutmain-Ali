package com.mycompany.utspemdas;
import java.util.Scanner;

class MK {
    String namaMK;
    int sks;
    String nilaiHuruf;
    double bobot;
    

    // CONSTRUKTOR
    MK(String n, int s, String nh){
        namaMK = n;
        sks = s;
        nilaiHuruf = nh;
        
        // MENENTUKAN BOBOT NILAI
        if(nh.equalsIgnoreCase("A")){
            bobot = 4;
        }
        else if(nh.equalsIgnoreCase("A-")){
            bobot = 3.7;
        }
        else if(nh.equalsIgnoreCase("B+")){
            bobot = 3.3;
        }
        else if(nh.equalsIgnoreCase("B-")){
            bobot = 3;
        }
        else if(nh.equalsIgnoreCase("C+")){
            bobot = 2.7;
        }
        else if(nh.equalsIgnoreCase("C-")){
            bobot = 2.3;
        }
        else if(nh.equalsIgnoreCase("C")){
            bobot = 2;
        }
        else if(nh.equalsIgnoreCase("D")){
            bobot = 1;
        }
        else{
            bobot = 0;
        }
    }
    
    double hitungMutu(){
        double mutu = bobot * sks;
        return mutu;
    }
}

public class UTSpemdas {
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        MK dataMK[] = new MK[jumlah];
        
        int totalSks = 0;
        double totalMutu = 0;
        
        for (int i = 0; i < jumlah; i++) {
            
          System.out.println("\nData Mata Kuliah ke-" + (i+1));
          
          System.out.print("Nama MK: ");
          String nama = sc.nextLine();
          
          System.out.print("SKS :");
          int s = sc.nextInt();
          sc.nextLine();
          
          System.out.print("Nilai Huruf: ");
          String nilai = sc.nextLine();
          
          dataMK[i] = new MK(nama,  s, nilai);
          
          totalSks += s;
          totalMutu += dataMK[i].hitungMutu();          
        }
        
        double IPS = totalMutu / totalSks;
        
        System.out.println("\nTotal SKS =" +totalSks);
        System.out.println("IPS Semester =" + IPS);
    }
}

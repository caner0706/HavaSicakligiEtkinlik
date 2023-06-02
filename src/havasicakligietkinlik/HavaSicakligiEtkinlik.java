package havasicakligietkinlik;

import java.util.Scanner;

public class HavaSicakligiEtkinlik {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Hava Sıcaklığını Girin : ");
        double sicaklik = scanner.nextDouble();
        
        if(sicaklik < 5){
            System.out.println("Kaynak Yapabilirsiniz...");
        }
        else if(sicaklik >= 5 && sicaklik < 25){
            if(sicaklik < 15){
                System.out.println("Sinemaya Gidebilirsiniz...");
            }
            else{
                System.out.println("Piknik Yapabilirsiniz...");
            }
        }
        else{
            System.out.println("Yüzmeye Gidbilirsiniz...");
        }
    }
    
}

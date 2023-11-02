package Prak21;
import java.util.Scanner;

public class Percabangan {
    
    public static void main(String[] args) {
        System.out.println("Materi Percabangan");
        System.out.println("\nPercabangan if else");
       
        /*  if (kondisi1){
           pernyataan1;
        }else if (kondisi2) {
        										pernyataan2;
        }else if (kondisi3){
        					pernyataan3;
        }else {
   													 alternatif_pernyataan;
        }
        */
        Scanner masuk=new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan Nilai : ");
        nilai=masuk.nextInt();
        
        if (nilai>=90){
            System.out.println("Sangat Baik"); 
        }else if (nilai>=80){
             System.out.println("Baik"); 
        }else if (nilai>=70){
             System.out.println("Cukup"); 
        }else if (nilai>=60){
             System.out.println("Kurang"); 
        }else {
            System.out.println("Belajar Lagi"); 
        }    
        
        
       System.out.println("\nPercabangan Switch Case");
        /*
        switch (ekspresi){
        case nilai1:
           pernyataan1;
           break;
        case nilai2:
           pernyataan2;
           break;
        case nilai3:
           pernyataan3;
           break;
        default :
           pernyataan_default;
        }*/
        
       
        int day = 1;

        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Unknown day");
        } 
        
        
    }
    
}



import java.util.Scanner;

public class HesapmakinesiOdevi {
    
    static void toplama(){
        int say1 ,say2;
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz:");
        say1 = input.nextInt();
        say2 = input.nextInt();
        
        System.out.println("Toplam: "+(say1+say2));
    }
    
    static void cikarma(){ 
       int say1 ,say2;
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz:");
        say1 = input.nextInt();
        say2 = input.nextInt();
        
        System.out.println("Cikarma: "+(say1-say2));
    }
    
    static void carpma(){
        
       int say1 ,say2;
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz:");
        say1 = input.nextInt();
        say2 = input.nextInt();
        
        System.out.println("Carpma: "+(say1*say2));     
    }
    
    static void bolme(){
        int say1 ,say2;
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz:");
        say1 = input.nextInt();
        say2 = input.nextInt();
        
        System.out.println("Bolme: "+(say1/say2));
    }
    
    static void usAlma(){
        int taban,us,sonuc=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban ve Us degerlerini giriniz:");
        taban = input.nextInt();
        us = input.nextInt();
        
        for(int i=1;i<=us;i++){
            sonuc*=taban;
        }
        
        System.out.println("Sonuc: "+sonuc);
    }
    
    static void faktoriyel(){
        int sayi,fakt=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        sayi = input.nextInt();
        
        for(int i=1;i<=sayi;i++){
            fakt*=i;
        }
        
        System.out.println("Faktoriyel: "+fakt);
    }
    
    
    static void modAlma(){
        
        int sayi,mod;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz ve kac ile modunu almak istiyorsaniz giriniz:");
        sayi = input.nextInt();
        mod = input.nextInt();
        
        int sonuc = sayi%mod;
        System.out.println("Sonuc: "+sonuc);   
    }
            
    static void alanCevrehesaplama(){
        
        int alan=0,cevre=0,say1,say2;
        Scanner input = new Scanner(System.in);
        System.out.println("Alan Cevre hesabi yapilacak iki sayi giriniz:");
        say1 = input.nextInt();
        say2 = input.nextInt();
        
        alan = say1*say2;
        cevre = 2*(say1+say2);
        
        System.out.println("Alan: "+alan);
        System.out.println("Cevre: "+cevre);
    }
        
    public static void main(String[] args){
        
     int secim;
     boolean ihtimal = true;
     Scanner input = new Scanner(System.in);
    
     while(ihtimal){
         System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Us Alma\n6-Faktoriyel\n7-Mod Alma\n8-Alan Ve Cevre Hesaplama\nYukaridaki islemlerden birini seciniz:");
         secim = input.nextInt();
         
         if(secim==-1){
             break;
         }
     switch(secim){
         
        case 1: 
             toplama();
             break;
          
         case 2:
           cikarma();
           break;
         
         case 3:
           carpma();
           break;
         
         case 4: 
           bolme();
           break;
           
         case 5:
           usAlma();
           break;
           
         case 6:
           faktoriyel();
           break;
           
         case 7:
           modAlma();
           break;
    
         case 8:
           alanCevrehesaplama();
           break;
                 
         default:
          System.out.println("Hatali giris yaptiniz.Tekrar deneyiniz.");
     }
     }
    }
}

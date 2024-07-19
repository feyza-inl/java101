import java.util.Scanner;

public class KullaniciGirisi {
   public static void main(String[] args){
       
    int sifre;
    Scanner inpt = new Scanner(System.in);
    
    System.out.println("Sifreyi giriniz:");
    sifre = inpt.nextInt();
    
    
     if(sifre==123456){
         System.out.println("Giris Yapildi.");    
     }  
     else{
          int secim;
          System.out.println("1-Sifreyi Sifirla\n2-Bu Sifreyle Devam\n");
          secim = inpt.nextInt();
          
          switch(secim){
              case 1:
                  int yeniSifre;
                  System.out.println("Yeni sifreyi giriniz:");
                  yeniSifre = inpt.nextInt();
                  if(yeniSifre==123456){
                      System.out.println("Sifre olusturulamadi,lutfen baska sifre giriniz.");
                  }
                  else{
                      System.out.println("Sifre olusturuldu");
                  }
                  break;
              case 2:
                  System.out.println("Eski sifre degistirilmeden giris yapildi");
                  break;
          }
     }  
        
   } 
}

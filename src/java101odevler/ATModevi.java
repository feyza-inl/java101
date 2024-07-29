import java.util.Scanner;

public class ATModevi {
   public static void main(String[] args){
       
       boolean dogruluk = true;
       String isim,sifre;
       int bakiye=1500,secim,cekilecekMiktar,yatirilacak;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Patika.Dev Bankasina Hosgeldiniz.");
       System.out.println("Islem Yapmadan Once Kullanici Adini Ve Sifreyi Giriniz.");
       
       
       for(int i=0;i<3;i++){
           System.out.println("\nKullanici Adi:");
           isim = input.nextLine();
           System.out.println("Sifre:");
           sifre = input.nextLine();
           
           if(isim.equals("Feyza") && sifre.equals("İnal")){
       while(dogruluk){        
       System.out.print("\n1-Para Cekme\n2-Bakiye Sorgulama\n3-Para Yatirma\n4-Cikis Yap\n\n");
       secim = input.nextInt();
       
       switch(secim){
           
           case 1:
               System.out.println("Cekilecek Miktari Giriniz:");
               cekilecekMiktar = input.nextInt();
               if(cekilecekMiktar>bakiye){
                  System.out.println("Bakiye Yetersiz:");
               }
               else{
                   bakiye-=cekilecekMiktar;
               }
               break;
               
           case 2:
               System.out.println("Bakiyeniz:"+bakiye);
               break;
               
           case 3:
               System.out.println("Yatirilacak Miktari Giriniz:");
               yatirilacak = input.nextInt();
               bakiye+=yatirilacak;
               break;
               
           case 4:
               break;
               
           default:
               System.out.println("Hatali Islem Yaptiniz.Tekrar Deneyiniz");       
       }
         if(secim>=4){
             break;
         }
           }
       break;
           }
           System.out.println("Kalan Hakkiniz:"+(2-i));
           if(i==2){
               System.out.println("\nHesabiniz Bloke Olmustur.Bankanizla Iletisime Giriniz.");
           }
       }
   } 
}

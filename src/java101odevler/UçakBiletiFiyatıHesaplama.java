import java.util.Scanner;

public class UçakBiletiFiyatıHesaplama {
    public static void main(String[] args){
        
      int mesafe,yas,gidis;
      double indirim = 0,indirimli = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Mesafeyi KM turunden giriniz:");
      mesafe = input.nextInt();
      System.out.print("Yasinizi giriniz:");
      yas = input.nextInt();
      System.out.println("Yolculuk tipini seciniz:\n1 => Tek yon\n2 => Gidis-Donus");
      gidis = input.nextInt();
      
        
      if( mesafe<0 || yas<0 || gidis>2 || gidis<1 ){
          System.out.println("Hatali Veri Girdiniz!");
      }  
      else{
          
       double fiyat = mesafe*0.10; 
       System.out.println("Normal Tutar:"+fiyat);
               
      if(yas<12){
        indirim =(fiyat*0.50);  
         indirimli =fiyat-(fiyat*0.50); 
      } 
       if(yas>=12 || yas<=24){
          indirim =(fiyat*0.10);
          indirimli =fiyat-(fiyat*0.10); 
       } 
       if(yas > 65){
          indirim =(fiyat*0.30);
          indirimli =fiyat-(fiyat*0.30);
       } 
        
       System.out.println("Yas Indirimi:"+indirim);
       System.out.println("Indirimli Tutar:"+indirimli);
       System.out.println("Toplam Tutar:"+indirimli); 

        if(gidis==2){
           System.out.println("Gidis-Donus Bilet Indirimi:"+indirimli*0.20);
           System.out.println("Toplam Tutar:"+(indirimli-indirimli*0.20)*2);
        }
      }
    }
}

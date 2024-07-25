import java.util.Scanner;

public class ÇiftBulmaProgrami {
   public static void main(String[] args){
       
       int sayi,ortToplam=0,adet=0;
       Scanner input = new Scanner(System.in);
       System.out.println("Bir sayi giriniz:");
       sayi = input.nextInt();
       
       for(int i=1;i<sayi;i++){
           if(i%3==0 && i%4==0){
               ortToplam+=i;
               adet++;
           }
       }       
       System.out.println("Ortalama:"+(ortToplam/adet));    
   } 
}

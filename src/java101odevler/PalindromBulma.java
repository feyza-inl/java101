import java.util.Scanner;

public class PalindromBulma{
    
    static void palindrom(int sayi){
        
       int yeniSayi=0,basamak;
       int temp = sayi;
       
       while(0<temp){
          
           basamak = temp%10;
          yeniSayi = yeniSayi*10+basamak;
          temp = temp/10;  
       }
        
       if(yeniSayi==sayi){
           System.out.println(sayi+" bir palindrom sayidir.");
       } 
        
       else{
           System.out.println(sayi+" palindrom degildir.");
       }    
    }
   
     public static void main(String[] args){
         
      int sayi;
      Scanner input = new Scanner(System.in);
      System.out.println("Bir sayi giriniz:");
      sayi = input.nextInt();
         
     palindrom(sayi);    
     }
}

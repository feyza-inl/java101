import java.util.Scanner;

public class HesapMakinesi {
  public static void main(String[] args){
      
      int sayi1,sayi2,secim;
      Scanner input = new Scanner(System.in);
      System.out.print("1. sayiyi giriniz:");
      sayi1 = input.nextInt();
      System.out.print("2. sayiyi giriniz:");
      sayi2 = input.nextInt();
      
      System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nScimlerinden birini yapiniz:");
      
      secim = input.nextInt();
          
      switch(secim){
          
          case 1:
              System.out.println("Toplam:"+(sayi1+sayi2));
              break;
          case 2:
              if(sayi1>sayi2){
                  System.out.println("Cikarma:"+(sayi1-sayi2));
              }
              
              else{
                  System.out.println("Cikarma:"+(sayi2-sayi1)); 
              }
              break;
          case 3:
              System.out.println("Carpma:"+(sayi1*sayi2));
              break;
          case 4:
             if(sayi1>sayi2){
                  System.out.println("Bolme:"+(sayi1/sayi2));
              }
              
              else{
                  System.out.println("Bolme:"+(sayi2/sayi1)); 
             }
              break;
              
      }
  }  
}

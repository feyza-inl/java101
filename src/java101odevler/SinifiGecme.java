import java.util.Scanner;

public class SinifiGecme {
  public static void main(String[] args){
      
      int mat,fizik,turk,kimya,muzik,ort=0,adet=0;
      Scanner input = new Scanner(System.in);
      System.out.println("Matematik notunuzu giriniz:");
      mat = input.nextInt();
      if(mat>=0 || mat<100){
          ort+=mat;
          adet++;
      }
      System.out.println("Fizik Notunuzu giriniz:");
      fizik = input.nextInt();
      if(fizik>=0 || fizik<100){
          ort +=fizik;
          adet++;   
      }
      System.out.println("Turkce notunuzu giriniz:");
      turk = input.nextInt();
      if(turk>=0 || turk<100){
          ort +=turk;
          adet++;
      }
      System.out.println("Kimya notunuzu giriniz:");
      kimya = input.nextInt();
      if(kimya>=0 || kimya<100){
          ort +=kimya;
          adet++;
      }
      System.out.println("Muzik notunuzu giriniz:");
      muzik = input.nextInt();
      if(muzik>=0 || muzik<100){
          ort +=muzik;
          adet++;
      }
      
      float yenOrt = ort/adet;
      if(yenOrt >= 55){
          System.out.println("Tebrikler Gectiniz.");
      }
      else{
          System.out.println("Donem tekrari gerekmektedir.");
      }
  }  
}
import java.util.Scanner;

public class Java101Odevler {

public static void main(String[] args){
    
    int mat,fiz,kim,turk,tarih,muz;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Matematik ders notunu giriniZ:");
    mat = input.nextInt();
    
    System.out.print("Fizik ders notunu giriniZ:");
    fiz = input.nextInt();
    
    System.out.print("Kimya ders notunu giriniZ:");
    kim = input.nextInt();
    
    System.out.print("Türkce ders notunu giriniZ:");
    turk = input.nextInt();
    
    System.out.print("Tarih ders notunu giriniZ:");
    tarih = input.nextInt();
    
    System.out.print("Müzik ders notunu giriniZ:");
    muz = input.nextInt();
    
   double a =(mat+fiz+kim+turk+tarih+muz)/6;
   System.out.println("Ortalama:"+a);
   
   boolean sonuc1 = a > 60;
   String str =(sonuc1)? "Sinifi Gecti" : "Sinifta Kaldi";
   System.out.println(str);
   
    
}    
}


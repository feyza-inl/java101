import java.util.Scanner;

public class Kdvtutarıodevi {
    
    public static void main(String[] args){
        
        float sayi;
        System.out.print("Miktar giriniz:");
        Scanner miktar = new Scanner(System.in);
        sayi = miktar.nextInt();
        
       float kdv = (sayi*18)/100;
       float kdvli = sayi+kdv;
       
       System.out.println("KDVsiz tutar = "+sayi);
       System.out.println("KDV tutari = "+kdv);
       System.out.println("KDVli tutar = "+kdvli);
    } 
}

import java.util.Scanner;

public class ManavKasaOdev {

    public static void main(String[] args){
    
    int armt,elma,domat,muz,patlican;
    Scanner input = new Scanner(System.in);
    System.out.println("Armut Kac Kilo ? :");
    armt = input.nextInt();
    
    System.out.println("Elma Kac Kilo ? :");
    elma = input.nextInt();
    
    System.out.println("Domates Kac Kilo ? :");
    domat = input.nextInt();
    
    System.out.println("Muz Kac Kilo ? :");
    muz = input.nextInt();
    
    System.out.println("Patlican Kac Kilo ? :");
    patlican = input.nextInt();
    
    double toplam = (armt*2.14)+(elma*3.67)+(domat*1.11)+(muz*0.95)+(patlican*5.00);
    
   System.out.println("Toplam Tutar:"+toplam);
    
}    
}

import java.util.Scanner;

public class MinVeMaxHesaplama {
    public static void main(String[] args){
        
        int sayi,adet,min = 5555,max = -55555;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz:");
        adet = input.nextInt();
        
        for(int i=1;i<=adet;i++){
           System.out.println("Bir sayi giriniz:");
           sayi = input.nextInt();
            
           if(sayi>max){
               max=sayi;
           }
           if(sayi<min){
               min = sayi;
           }
        }
        
        System.out.println("En buyuk deger: "+max);
        System.out.println("En kucuk deger: "+min);   
    }
}

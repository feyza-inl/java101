import java.util.Scanner;

public class RecursiveAsalKontrol {
    
    static int AsalKontrol(int sayi,int yarim){
        
        if(yarim == 1){
            return 1;
        }
        
        if(sayi%yarim == 0){
            return 0;
        }
        
        return AsalKontrol(sayi,yarim-1);
    }
    
    public static void main(String[] args){
        
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        sayi = input.nextInt();
        
        if(AsalKontrol(sayi,sayi/2)==1){
            System.out.println(sayi+" sayisi Asal sayidir.");
        }
        
        if(AsalKontrol(sayi,sayi/2)==0){
            System.out.println(sayi+" sayisi Asal sayi degildir.");
        }
    }
}

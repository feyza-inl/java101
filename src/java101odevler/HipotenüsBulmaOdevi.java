import java.util.Scanner;

public class HipotenüsBulmaOdevi {
    
    public static void main(String[] args){
        
        float knr1,knr2,knr3;
        Scanner input = new Scanner(System.in);
        System.out.println("1. 2. 3. Kenari giriniz:");
        knr1 = input.nextFloat();
        knr2 = input.nextFloat();
        knr3 = input.nextFloat();
        
        float u = (knr1+knr2+knr3)/2;
        
        double alan;
        
        alan = Math.sqrt(u*(u-knr1)*(u-knr2)*(u-knr3));
        
        System.out.println("Kenarlarini girdiginiz ücgenin alani:"+alan);       
    }
}

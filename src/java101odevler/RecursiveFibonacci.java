import java.util.Scanner;

public class RecursiveFibonacci{
    
    static int fibonacci(int adet){
        
        if(adet==1){
            return 0; 
        }
        if(adet==2){
            return 1;
        }
        return fibonacci(adet-2)+fibonacci(adet-1);
    }
    
    public static void main(String[] args){
        int adet;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaclik fibonacci dizisi olsun:");
        adet = input.nextInt();
        
        for(int i=adet;i>0;i--){
          System.out.println(fibonacci(adet--));
        }  
    }
}

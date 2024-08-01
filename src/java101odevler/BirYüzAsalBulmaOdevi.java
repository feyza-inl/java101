public class BirYüzAsalBulmaOdevi {
    public static void main(String[] args){
        
        for(int i = 2; i <= 100; i++){
            int adet = 0;
            
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    adet++;
                }
            }
            
           //1 ve kendisine bölünebildiği için ikiye eşitliyoruz.
            if(adet == 2){
                System.out.print(i + " ");
            }
        }         
    }
}


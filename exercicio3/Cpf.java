import java.util.Scanner;
public class Cpf {
    
       
    
    public static void main(String[] args) {
        int cpf[] = new int[11];
        int peso[] = new int[11];
        int mult[] = new int[11];
        int i, soma=0;
        String Cpf;
        int p = 2;
        int x = 0,y = 0;
        
        
     
            Scanner input = new Scanner ( System.in);
            System.out.println( "Digite os 9 primeiros digitos do seu cpf: ");
                Cpf = input.next();
                
                
              
     
            for ( i=8; i>=0; i--){
                cpf[i] = Character.getNumericValue(Cpf.charAt(i));
            }
            
            
      
            for ( i=8; i >=0; i--){
                peso[i] = p;
                p++;
        }
           
     
           
            for ( i = 8; i >=0; i--){
                mult [i] = peso[i] * cpf[i];
            }
                
        
                
            for ( i = 0; i <=8; i++){
            soma += mult[i];
            }
   
                if ((soma % 11)<2){
                 x = 0;
                }
             
             else {
                 x = ( 11 - (soma % 11) ) ;
             }
              
        
    
            p = 2;
            for ( i=0; i <=8; i++){
                peso[i] = p;
                p++;
        }
           

           mult[i] = 0;
            for ( i=0; i <=8; i++){
                mult [i] = peso[i] * cpf[i];
            }
                
    
            soma = 0;
            for ( i = 0; i <=8; i++){
            soma += mult[i];
            }

                if ((soma % 11)<2){
                 y = 0;
                }
             
             else {
                 y = ( 11 - (soma % 11) ) ;
             }

         System.out.println(" Seu CPF eh : " + Cpf + x + y);
    }
    
}

import java.util.Scanner;
public class Cpf {
    public String lerCpf(){
        Scanner input = new Scanner( System.in );
        String cpf = input.next();
        return cpf;
    }
    public int[] getCaracter(String w){
        int[] x = new int[11];
        for (int i = 0; i < 9; i++) {
            char caracter = w.charAt(i);
            x[i] = Character.getNumericValue(caracter);
        }
        return x;
    }
    public int getx9(int[] x){
        int j = 10, x =0, i;
        for (i = 9; i > 0; i--) {
            x =+ x[i] * (j--);
        }    
            if( x % 11 < 2){
                x[9] = 0;
            }else{
                x[9] = (11-(x % 11));
            }
        return x[9];
    }
    public int getx10(int[] x){
        int i, x, j = 11, z = 0;
        for (i = 10; i > 0; i--) {
            x =+ x[i] * (j--);
        }
        if( z % 11 < 2){
            x[10] = 0;
        }else{
            x[10] = (11-(z%11));
        }
        return x[10];
    }
    
    
 
    public static void main (String[] args){
        int[] x = new int[11];
        Cpf n = new Cpf();
        String w;
        w = n.lerCpf();
        x = n.getCaracter(w);
        x[9] = n.getx9(x);
        x[10] = n.getx10(x);
        System.out.print("CPF é: ");
        int i = 0;
        for (i = 0; i<11 ;i++){
            System.out.print(x[i]);
        }
    }                                                                    
    
}

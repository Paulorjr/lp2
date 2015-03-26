import java.util.Scanner;
public class Calculadora{
	int variavel1;
	int variavel2;
	
	public void Soma(){
		System.out.println("A soma dos dois números é: " + (this.variavel1 + this.variavel2));
		
	}

	public void Subtracao(){
		System.out.println("A subtração dos dois números é: " + (this.variavel1 - this.variavel2));
		
	}

	public void Multiplicacao(){
		System.out.println("A multiplicação dos dois números é: " + (this.variavel1 * this.variavel2));
		
	}

	public void Divisao(){
		System.out.println("A divisão dos dois números é: " + (this.variavel1 / this.variavel2));
		
	}


	public static void main(String [] args){
		Calculadora Paulo1 = new Calculadora();
		Calculadora Paulo2 = new Calculadora();
		Calculadora Paulo3 = new Calculadora();
		Scanner input = new Scanner ( System.in );


		System.out.println( "Digite um valor1: ");
		Paulo1.variavel1 = input.nextInt();
		System.out.println( "Digite um valor2: ");
		Paulo1.variavel2 = input.nextInt();
                
		
		System.out.println( "Digite um valor1: ");
		Paulo2.variavel1 = input.nextInt();
		System.out.println( "Digite um valor2: ");
		Paulo2.variavel2 = input.nextInt();
                


		System.out.println( "Digite um valor1: ");
		Paulo3.variavel1 = input.nextInt();
		System.out.println( "Digite um valor2: ");
		Paulo3.variavel2 = input.nextInt();
		
		Paulo1.Soma();
		Paulo1.Subtracao();
		Paulo1.Multiplicacao();
		Paulo1.Divisao(); 
	
		Paulo2.Soma();
		Paulo2.Subtracao();
		Paulo2.Multiplicacao();
		Paulo2.Divisao(); 

		Paulo3.Soma();
		Paulo3.Subtracao();
		Paulo3.Multiplicacao();
		Paulo3.Divisao(); 
	}
}

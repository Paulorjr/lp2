public class Aluno{
	
	String nome;
	int idade;
	String NumeroMatricula;
	
	public void ImprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Matricula: " + this.NumeroMatricula);
		
	}
	
	public static void main(String [] args){

		Aluno um = new Aluno();
		Aluno dois = new Aluno();
		Aluno tres = new Aluno();
		Aluno quatro = new Aluno();
		
		um.nome = "Marolero";
		um.idade = 16;
		um.NumeroMatricula = "20131811018";
		
		dois.nome = "Tiso";
		dois.idade = 17;
		dois.NumeroMatricula = "20131813015";

		tres.nome = "Pyjey";
		tres.idade = 18;
		tres.NumeroMatricula = "20131810510";

		quatro.nome = "Brunet";
		quatro.idade = 17;
		quatro.NumeroMatricula = "20131814560";

		um.ImprimirDadosCadastrais();
		dois.ImprimirDadosCadastrais();
		tres.ImprimirDadosCadastrais();
		quatro.ImprimirDadosCadastrais();
	}
	
}

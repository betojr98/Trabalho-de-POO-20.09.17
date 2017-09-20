package biblioteca;

public class Funcionario extends Usuario {
	public int codFunc;
	public String nome;
	public int rg;
	public int cpf;
	//construtor da Classe Funcionario
	public Funcionario(int cod, String name,int rg,int cpf){
		this.codFunc = cod;
		this.nome = name;
		this.rg = rg;
		this.cpf = cpf;
		mostrarFuncionario();
	}
	//Metodo para Mostrar Informações do Funcionario
	public void mostrarFuncionario(){
		System.out.println("Funcionario Cadastrado");
		System.out.println("Codigo "+this.codFunc);
		System.out.println("Nome "+this.nome);
		System.out.println("RG "+this.rg);
		System.out.println("CPF "+this.cpf);
	}
}

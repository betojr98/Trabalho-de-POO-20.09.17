package biblioteca;

public class Cliente extends Usuario {
	public int codCliente;
	public String nome;
	public int rg;
	public int cpf;
	//construtor da Classe Cliente
	public Cliente(int cod, String name,int rg,int cpf){
		this.codCliente = cod;
		this.nome = name;
		this.rg = rg;
		this.cpf = cpf;
		mostrarCliente();
	}
	//Methodo para Mostrar Informações do Cliente
	public void mostrarCliente(){
		System.out.println("Cliente Cadastrado");
		System.out.println("Codigo "+this.codCliente);
		System.out.println("Nome "+this.nome);
		System.out.println("RG "+this.rg);
		System.out.println("CPF "+this.cpf);
	}
}

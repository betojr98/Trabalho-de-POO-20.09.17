package biblioteca;
//Singleton
import java.util.Scanner;

import biblioteca.Livro.Builder;

public class Cadastro {

	private static Cadastro uniqueInstance;
	private Scanner teclado;

	private Cadastro() {
	}

	public static synchronized Cadastro getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Cadastro();

		return uniqueInstance;
	}
	//método para cadastro de livro
	public void cadLivro(){
		int cod;
		String nome;
		String autor;
		double preco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o codigo do livro");
		cod = teclado.nextInt();
		System.out.println("Digite o Nome do livro");
		nome = teclado.next();
		System.out.println("Digite o Autor do livro");
		autor = teclado.next();
		System.out.println("Digite o preco do livro");
		preco = teclado.nextDouble();

		Builder teste = new Livro.Builder(cod);
		teste.nome(nome);
		teste.autor(autor);
		teste.preco(preco);
		teste.mostrarInfoLivro();
		teclado.close();
	}
	//método para cadastro de Usuario
	public void cadUsuario(){
		int cod;
		String name;
		int rg;
		int cpf;
		String tipo;
		
		do{
		System.out.println("Digite C para Cliente ou F para Funcionario" );
		teclado = new Scanner(System.in);
		tipo = teclado.next();
		}while(tipo == "C" || tipo == "F");
		System.out.println("Digite o Codigo");
		cod = teclado.nextInt();	
		System.out.println("Digite o nome");
		name = teclado.next();
		System.out.println("Digite o  RG");
		rg = teclado.nextInt();
		System.out.println("Digite o CPF");
		cpf = teclado.nextInt();
		Usuario.getUsuario(tipo, cod, name, rg, cpf);
		teclado.close();
	}

	
}

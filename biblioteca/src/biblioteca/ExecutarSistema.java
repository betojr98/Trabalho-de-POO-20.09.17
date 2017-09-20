package biblioteca;

import java.util.Scanner;

/*
 * Design Patterns
 * Singleton
 * Builder
 * Factory Method
 */
public class ExecutarSistema {
	public static void main(String[] args){
		
		int op;
		Scanner teclado = new Scanner(System.in); 
		Cadastro x = Cadastro.getInstance();
		
			do{//retorna caso a escolha esteja incorreta
				System.out.println("Sistema de Cadastro");
				System.out.println("[1] Cadastrar Usuario");
				System.out.println("[2] Cadastrar Livro");
				op = teclado.nextInt();
			}while(op != 2 && op != 1);
			if(op == 1){
				x.cadUsuario();//executa metodo de cadastro de Usuario
			}else if(op==2){
				x.cadLivro();//executa metodo de cadastro de Livro
			}
			teclado.close();
		
		
	}
}

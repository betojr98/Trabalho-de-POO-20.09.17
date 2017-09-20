package biblioteca;
//Builder
public class Livro {

		public static class Builder {
			
			private int codLivro;
			private String nome;
			private String autor;
			private double preco;
			
			public Builder(int codLivro) {
				this.codLivro = codLivro;
			}
			
			public Builder nome(String val) {
				nome = val;
				return this;
			}
			
			public Builder autor(String val) {
				autor = val;
				return this;
			}

			public Builder preco(double val) {
				preco = val;
				return this;
			}
			
			public void Livro(Builder builder) {
				codLivro = builder.codLivro;
				nome = builder.nome;
				autor = builder.autor;
				preco = builder.preco;
			}
			//retorna informações do livro cadastrado
			public void mostrarInfoLivro(){
				System.out.println("Livro Cadastrado");
				System.out.println("Cod: "+codLivro);
				System.out.println("Nome: "+nome);
				System.out.println("Autor: "+autor);
				System.out.println("Preco: "+preco);
			}
			
		}

	
}

package biblioteca;
//Factory Method
public class Usuario {
	
	//metodo que verifica se é Cliente ou Funcionario e retorna a Classe
	public static Usuario getUsuario(String tipo,int cod,String name,int rg,int cpf) {
		if (tipo.equals("F"))
			return new Funcionario(cod,name,rg,cpf);
		else if(tipo.equals("C"))
			return new Cliente(cod, name, rg, cpf);
		else 
			return null;
	}

}

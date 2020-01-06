package exer1;

public class GerarSenha {
	private String senha;
	
	public String gerarSenha(int qtd) {
		++qtd;
		if (qtd < 10)
			this.setSenha( "CX0"+qtd );
		else
			this.setSenha( "CX"+qtd );
		return this.getSenha();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

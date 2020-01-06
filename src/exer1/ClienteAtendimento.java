package exer1;

public class ClienteAtendimento {
	private String conta, agencia, titular;

	public ClienteAtendimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteAtendimento(String conta, String agencia, String titular) {
		super();
		this.conta = conta;
		this.agencia = agencia;
		this.titular = titular;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}

package exer1;

import java.util.Map;
import java.util.HashMap;

public class main {
	public static void main(String... args) {
		
		ClienteAtendimento c1 = new ClienteAtendimento("004", "23131", "Fulano da Silva");
		ClienteAtendimento c2 = new ClienteAtendimento("002", "23121", "Cicrano da Silva");
		ClienteAtendimento c3 = new ClienteAtendimento("001", "23131", "Beltrano da Silva");
		
		Map<String, ClienteAtendimento> map = new HashMap<>();
		
		
		
		GerarSenha gera = new GerarSenha();
		
		String senha = gera.gerarSenha(map.size());
		map.put(senha, c1);
		
		senha = gera.gerarSenha(map.size());
		map.put(senha, c2);
		
		senha = gera.gerarSenha(map.size());
		map.put(senha, c3);
		
		System.out.println(map.get("CX01").getTitular());
		System.out.println(map.get("CX02").getTitular());
		System.out.println(map.get("CX03").getTitular());
	}
}

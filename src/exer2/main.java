package exer2;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class main {
	public static void main(String... args) {
		
		Map<String, ClienteAtendimento> map = new HashMap<>();
		GerarSenha gera = new GerarSenha();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade a ser cadastrado: ");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Informe a agência: ");
			String agencia = sc.next();
			System.out.print("Informe a conta: ");
			String conta = sc.next();
			System.out.print("Informe o titular: ");
			String titular = sc.next();
			ClienteAtendimento c = new ClienteAtendimento(agencia, conta, titular);
			String senha = gera.gerarSenha(map.size());
			map.put(senha, c);
			System.out.print("--- OK ---: ");
		}
		
		Set<Entry<String, ClienteAtendimento>> set = map.entrySet();
		Iterator it = set.iterator();
	     
		System.out.println("Código\t\tTitular");
		
		while(it.hasNext()){
			Entry<String, ClienteAtendimento> entry = (Entry)it.next();
			System.out.println(entry.getKey() + "\t\t"+entry.getValue().getTitular());
	    }
	}
}

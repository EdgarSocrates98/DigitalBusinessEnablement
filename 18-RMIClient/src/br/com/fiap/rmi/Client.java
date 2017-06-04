package br.com.fiap.rmi;

import java.rmi.Naming;

import br.com.fiap.bean.Pessoa;
import br.com.fiap.service.CotacaoService;
import br.com.fiap.service.PessoaService;

public class Client {

	public static void main(String[] args) throws Exception {
		//Chamada remota do método de conversão
		CotacaoService service = (CotacaoService) 
						Naming.lookup("rmi://localhost:123/objeto");
		
		PessoaService pessoaService =
			(PessoaService) Naming.lookup("rmi://localhost:123/pessoa");
		
		Pessoa pessoa = new Pessoa("Bruno José", 5);
		pessoaService.cadastrar(pessoa);
		
		System.out.println(service.converterRealDolar(1000));
		
	}
	
}

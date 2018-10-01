package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Joao");
		contato.setEmail("joaonovo@caelum.com.br");
		contato.setEndereco("R. do Cabrito");
		contato.setDataNascimento(Calendar.getInstance());
		Long id = (long)3;
		contato.setId(id);
		ContatoDao dao = new ContatoDao();
		
		//dao.adiciona(contato);
		dao.altera(contato);
		
		System.out.println("Contato alterado com sucesso! \n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nome: "+contato.getNome());
		System.out.println("Email: "+contato.getEmail());
		System.out.println("Endereço: "+contato.getEndereco());
		System.out.println("Data de Nascimento: "+sdf.format(contato.getDataNascimento().getTime())+"\n");
	}
}

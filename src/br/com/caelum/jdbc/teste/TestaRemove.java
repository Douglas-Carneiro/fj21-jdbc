package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {
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
		dao.remove(contato);
		
		System.out.println("Contato removido com sucesso! \n");
	}
}

package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaAlteraFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joao");
		funcionario.setUsuario("joaon45");
		funcionario.setSenha("3454555");
		Long id = (long)2;
		funcionario.setId(id);
		FuncionarioDao dao = new FuncionarioDao();
		
		//dao.adiciona(funcionario);
		dao.altera(funcionario);
		
		System.out.println("funcionario alterado com sucesso! \n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Email: "+funcionario.getUsuario());
		System.out.println("Endereço: "+funcionario.getSenha());
	}
}

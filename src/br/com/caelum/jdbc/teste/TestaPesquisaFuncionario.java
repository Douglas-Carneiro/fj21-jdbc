package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaPesquisaFuncionario {
	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		
		Funcionario funcionario = dao.pesquisar(1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Resultado da pesquisa: \n");
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Email: "+funcionario.getUsuario());
		System.out.println("Endereço: "+funcionario.getSenha());
	}
}

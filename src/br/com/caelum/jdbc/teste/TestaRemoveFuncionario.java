package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemoveFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Roberto");
		funcionario.setUsuario("R7obarril");
		funcionario.setSenha("ertr5");
		Long id = (long)3;
		funcionario.setId(id);
		FuncionarioDao dao = new FuncionarioDao();
		
		//dao.adiciona(funcionario);
		dao.remove(funcionario);
		
		System.out.println("Funcionario removido com sucesso! \n");
	}
}

package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Caelum");
		funcionario.setUsuario("Caelum3546");
		funcionario.setSenha("qvdhs12436");
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.adiciona(funcionario);
		
		System.out.println("Gravado!");
	}
}

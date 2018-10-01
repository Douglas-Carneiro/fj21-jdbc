package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaListaFuncionario {
	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		
		List<Funcionario> funcionarios = dao.getLista();
		
		for (Funcionario funcionario : funcionarios) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Nome: "+funcionario.getNome());
			System.out.println("Email: "+funcionario.getUsuario());
			System.out.println("Endereço: "+funcionario.getSenha());			
		}
	}
}

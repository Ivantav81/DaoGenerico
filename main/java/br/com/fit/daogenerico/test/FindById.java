package br.com.fit.daogenerico.test;

import br.com.fit.daogenerico.dao.DaoGenerico;
import br.com.fit.daogenerico.entity.Carro;
import br.com.fit.daogenerico.entity.Pessoa;

public class FindById {

	public static void main(String[] args) {

		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();

		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
		Carro carro = daoCarro.findById(Carro.class, 2L);

		System.out.println(" Entidade encontrada ");
		System.out.println("ID: " + pessoa.getId());
		System.out.println("NOME: " + pessoa.getNome());

		System.out.println("");

		System.out.println(" Entidade Carro encontrada ");
		System.out.println("ID: " + carro.getId());
		System.out.println("MODELO: " + carro.getModelo());

	}

}

package br.com.fit.daogenerico.test;

import br.com.fit.daogenerico.dao.DaoGenerico;
import br.com.fit.daogenerico.entity.Carro;
import br.com.fit.daogenerico.entity.Pessoa;

public class Insert {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Carro carro = new Carro();

		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();

		pessoa.setNome("Ivan Tava");
		pessoa.setIdade(29);

		carro.setModelo("Maserati");
		carro.setAnoFabricacao(2011);

		daoPessoa.saveOrUpdate(pessoa);
		daoCarro.saveOrUpdate(carro);

		System.out.println("Entidades salvas com sucesso!");

	}

}

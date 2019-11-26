package br.com.fit.daogenerico.test;

import br.com.fit.daogenerico.dao.DaoGenerico;
import br.com.fit.daogenerico.entity.Pessoa;

public class Update {

	public static void main(String[] args) {

		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();

		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 3L);
		pessoa.setNome("Teste 2");
		daoPessoa.saveOrUpdate(pessoa);
		System.out.println("Entidade atualizada.");

	}

}

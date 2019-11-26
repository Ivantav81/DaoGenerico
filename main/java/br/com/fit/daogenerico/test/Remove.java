package br.com.fit.daogenerico.test;

import br.com.fit.daogenerico.dao.DaoGenerico;
import br.com.fit.daogenerico.entity.Carro;
import br.com.fit.daogenerico.entity.Pessoa;

public class Remove {
	public static void main(String[] args) {

		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();

		daoPessoa.remove(Pessoa.class, 1L);
		daoCarro.remove(Carro.class, 2L);

		System.out.println("Entidades removidas com sucesso!");

	}
}

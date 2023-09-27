package view;

import java.util.List;

import model.Pais;

public class PaisView {

	public void exibirListaDePaises(List<Pais> paises) {
		System.out.println("== Lista de Países ==");
		System.out.println("-------------");

		for (Pais pais : paises) {
			System.out.println("País: " + pais.getNome());
			System.out.println("Capital: " + pais.getCapital());

			// Desta forma exibe tudo na mesma linha,e acima e cada uma numa linha no caso 2
			// System.out.println("País: " + pais.getNome() + "- Capital: " +
			// pais.getCapital());
		}
		System.out.println("-------------");
	}

}

package br.com.alura.treinamentos.rh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Ciclo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	private String nome;

	/**
	 * @deprecated
	 */
	public Ciclo() {

	}

	public Ciclo(@NotBlank String nome) {
		super();
		this.nome = nome;
	}

}

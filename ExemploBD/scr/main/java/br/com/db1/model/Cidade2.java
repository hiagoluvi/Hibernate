package br.com.db1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "cidade", schema = "recibo")
public class Cidade2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column
	@Enumerated(EnumType.STRING)
	private Uf2 uf;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uf_id", nullable = false)
	private Uf uf2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Uf getUf2() {
		return uf2;
	}

	public void setUf2(Uf uf2) {
		this.uf2 = uf2;
	}


	

}

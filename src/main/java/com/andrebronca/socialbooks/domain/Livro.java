package com.andrebronca.socialbooks.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Livro {

//	@JsonInclude(Include.NON_NULL)	//só será retornado quando não for nulo.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message = "O nome do livro é obrigatório")
	private String nome;
	
//	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "A data da publicação do livro é obrigatório")
	private Date publicacao;
	
//	@JsonInclude(Include.NON_NULL)
	@NotNull(message = "A editora é obrigatório")
	private String editora;
	
//	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message = "O resumo é obrigatório")
	@Size(max = 1500, message = "O resumo aceita no máximo 1500 caracteres.")
	private String resumo;
	
//	@JsonInclude(Include.NON_NULL)
	@OneToMany(mappedBy = "livro")
	private List<Comentario> comentarios;
	
//	@JsonInclude(Include.NON_NULL)
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor autor;
	
	public Livro() {}

	public Livro(String nome) {
		super();
		this.nome = nome;
	}

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

	public Date getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}

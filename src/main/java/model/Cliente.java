package model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty(message="Informe o nome do cliente")
	private String nome;
	
	@NotEmpty(message="Informe o CPF do cliente")
	private String cpf;
	
	@NotEmpty(message="Informe o RG cliente")
	private String rg;
	
	@OneToOne
	@JoinColumn(name = "idCidade")
	private Cidade cidade;
	
	private String endereco;
	private String estadoCivil;
	private Calendar dataNascimento = Calendar.getInstance();
	private Calendar dataCadastro = Calendar.getInstance(); 
	private String sexo;
	private String observacao;
	

	private String email;
	private String telefone;
	private String celular;
	private String bairro;
	private int numero;
	
	private String conjNome;
	private String conjEmail;
	private Calendar conjDataNascimento = Calendar.getInstance();
	private String conjRg;
	private String conjCpf;
	
	
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getConjRg() {
		return conjRg;
	}
	public void setConjRg(String conjRg) {
		this.conjRg = conjRg;
	}
	public String getConjCpf() {
		return conjCpf;
	}
	public void setConjCpf(String conjCpf) {
		this.conjCpf = conjCpf;
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
		this.nome = nome.toUpperCase();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco.toUpperCase();
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo.toUpperCase();
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao.toUpperCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}
	public String getConjNome() {
		return conjNome;
	}
	public void setConjNome(String conjNome) {
		this.conjNome = conjNome.toUpperCase();
	}
	public String getConjEmail() {
		return conjEmail;
	}
	public void setConjEmail(String conjEmail) {
		this.conjEmail = conjEmail.toLowerCase();
	}
	public Calendar getConjDataNascimento() {
		return conjDataNascimento;
	}
	public void setConjDataNascimento(Calendar conjDataNascimento) {
		this.conjDataNascimento = conjDataNascimento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}


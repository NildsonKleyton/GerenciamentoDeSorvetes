package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SORVETE")
public class Sorvete {

	@Id
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "FABRICANTE", nullable = false)
	private String fabricante;
	
	@Column(name = "INGREDIENTES", nullable = false)
	private String ingredientes;
	
	@Column(name = "QUANTIDADE", nullable = false)
	private double quantidade;
	
	@Column(name = "VALOR", nullable = false)
	private double valor;
	
	@Override
	public boolean equals(Object obj) {
		Sorvete sorveteEntrada = (Sorvete)obj;
		if (sorveteEntrada.getNome().equalsIgnoreCase(this.nome)) {
			return true;
		}else {
			return false;
		}		
	}
	
	@Override
	public String toString() {
		return "nome=" +this.nome + ", fabricante=" + this.fabricante + ", ingredientes=" + this.ingredientes
				+ ", quantidade=" + this.quantidade + ", valor= R$" + this.valor + " Valor Total= R$"+ (this.quantidade*this.valor) ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}

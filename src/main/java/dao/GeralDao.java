package dao;

import java.util.List;

import entidade.Sorvete;

public interface GeralDao {
	
	/**
	 * Inseri um Objeto no Banco
	 * @param obj
	 * @author Nildson Kleyton
	 */
	public void inserir(Object obj);
	
	/**
	 * Recebe um Objeto e chave primaria para pode deletar
	 * 
	 * @param obj
	 * @param chavePrimaria
	 * @return Objeto , ChavePrimaria
	 * @author Nildson Kleyton
	 */
	public Object remover(Object obj, Object chavePrimaria);
	
	/**
	 * Lista todos os atributos do Objeto
	 * 
	 * @param obj
	 * @return Lista o Objeto 
	 * @author Nildson Kleyton
	 */
	public List listar(Object obj);

	
}

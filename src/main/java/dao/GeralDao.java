package dao;

import java.util.List;

import entidade.Sorvete;

public interface GeralDao {
	
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
	 * 
	 * @param obj
	 * @return Lista do 
	 */
	public List listar(Object obj);

	
}

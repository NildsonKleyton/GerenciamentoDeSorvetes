package dao;

import java.util.List;

import entidade.Sorvete;

public interface GeralDao {
	
	public void inserir(Object obj);
	
	public Object remover(Object obj, Object chavePrimaria);
	
	public List listar(Object obj);

	
}

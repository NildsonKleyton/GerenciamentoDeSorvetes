package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidade.Sorvete;
import util.JpaUtil;

public class GeralDaoImpl implements GeralDao{
	

	@Override
	public Object inserir(Object obj) {
		EntityManager entM = JpaUtil.getEntityManager(); //Prove a Pessistência 
		EntityTransaction entT = entM.getTransaction();//Iniciar um trasação (EX.: Salvar , remover  etc)
		
		Object retorno =null;

		entT.begin();// inica a transação
		
		retorno = entM.merge(obj);//inserir ou salva no banco de dados
		
		entT.commit();// conmmit a 
		entM.close();//fecha a transação
		
		return retorno;
	}

	@Override
	public Object remover(Object obj, Object chavePrimaria) {
		EntityManager entM = JpaUtil.getEntityManager(); 
		EntityTransaction entT = entM.getTransaction();
		Object retorno = null;

		entT.begin();
		
		retorno = entM.find(obj.getClass(), chavePrimaria);//recebe o objeto e chavePrimaria 
		
		entM.remove(retorno);//deleta o objeto do banco de dados
		
		System.out.println("Removido");
		
		entT.commit();
		entM.close();
		return retorno;
	}

	
	@Override
	public List listar(Object obj) {
		
		EntityManager entM = JpaUtil.getEntityManager(); 
		System.out.println("Lista de Sorvete");
				
		Query query = entM.createQuery("from " + obj.getClass().getSimpleName());
		
		return query.getResultList();
	}


}

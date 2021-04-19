package GerenciamentoDeSorvetes.GerenciamentoDeSorvetes;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.GeralDao;
import dao.GeralDaoImpl;
import entidade.Sorvete;
import util.JpaUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GeralDao geralDao = new GeralDaoImpl();//cria um objeto generico com implementação do GeralDaoImpl
    	Sorvete sv =new Sorvete(); //cria um obj Sorvete
    	List<Sorvete> svLista = (List<Sorvete>) geralDao.listar(sv);

//    	sv.setNome("Uva0");
//    	sv.setFabricante("KIBOM");
//    	sv.setIngredientes("Leite, Suco de Uva, Açúcar e gordura de leite");
//    	sv.setQuantidade(5);
//    	sv.setValor(15.80);
//    	
//    	sv =(Sorvete) geralDao.inserir(sv);
    	
    	geralDao.listar(sv);
      	
//    	EntityManager ent = JpaUtil.getEntityManager();
//    	
//    	Sorvete s = new Sorvete();
//    	s.setNome("UVA");
//    	s.setIngredientes("Uvas pretas de Caruaru");
//    	s.setFabricante("Caruaru");
//    	
//    	EntityTransaction ts = ent.getTransaction();
//    	ts.begin();
//    	
//    	ent.persist(s);
//    	
//    	ts.commit();
//    	ent.close();
//    	
//    	System.out.println("==== inserido ===");
    }
}

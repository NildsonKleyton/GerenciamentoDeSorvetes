package GerenciamentoDeSorvetes.GerenciamentoDeSorvetes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.GeralDao;
import dao.GeralDaoImpl;
import entidade.Sorvete;

public class GerSoveteria {

	public static void main(String[] args) {
		int op;
		String nome, fab, ing;
		double valor, qtd;
		GeralDao geralDao = new GeralDaoImpl();// cria um objeto generico com implementação do GeralDaoImpl
		// Cria Objeto
		Sorvete sv = new Sorvete();

		Scanner scan = new Scanner(System.in);
		Scanner scantx = new Scanner(System.in);
		do {
			System.out.println("==============================");
			System.out.println("        Funcionalidades\n");
			System.out.println("1 - Inserir sorvete");
			System.out.println("2 - Remover sorvete");
			System.out.println("3 - Listar todos os sorvetes");
			System.out.println("0 - Sair");
			System.out.println("==============================");
			System.out.print("Escolha um Opção: ");
			op = scan.nextInt();

			switch (op) {
			case 1:// inserir

				// sabor
				System.out.print("\n***** Inserir *****");
				System.out.print("\nNome do Sorvete: ");
				nome = scantx.nextLine();// variavel recebe valor
				sv.setNome(nome);// atributo do Obj recebe valor

				// fabricante
				System.out.print("Nome do Fabricante: ");
				fab = scantx.nextLine();
				sv.setFabricante(fab);

				// ingredientes
				System.out.print("Ingredientes do Sorvete: ");
				ing = scantx.nextLine();
				sv.setIngredientes(ing);

				// quantidade
				System.out.print("Litros de Sorvete: ");
				qtd = scan.nextDouble();
				sv.setQuantidade(qtd);

				// valor
				System.out.print("Valor do Sorvete:\nEx.: 1,20 ou 1:\nR$");
				valor = scan.nextDouble();
				sv.setValor(valor);

				// adciona no banco de dados
				geralDao.inserir(sv);
				System.out.println("***** Inserido *****\n");

				op = 1;// ao sair do case retorna ao menu
				break;
			case 2:// remover
				System.out.println("Remover!");
				System.out.print("Nome do produto a remover:");
				nome = scantx.nextLine();
				geralDao.remover(sv, nome);
				op = 1;// ao sair do case retorna ao menu
				break;
			case 3:
				List<Sorvete> listaSorvete = geralDao.listar(new Sorvete());
				System.out.println("Litar de Sorvete");

				for (Sorvete sorvete : listaSorvete) {
					System.out.println(sorvete.toString());
				}
				
				double vTotal = 0, qLitros = 0;
				for (Sorvete svl : listaSorvete) {
					qLitros = qLitros + svl.getQuantidade();
					vTotal = (svl.getValor() * svl.getQuantidade());
				}
				System.out.println("\nTotal Litros em estoque:" + qLitros + "Lt");
				System.out.println("Valor total de estoque: R$" + vTotal);
				System.out.println("*******************************\n");
				op = 1;// ao sair do case retorna ao menu
				break;

			case 0:
				System.out.println("Sistema Finalizado.");
				op = 0;// sair 
				break;
			default:
				System.out.println("Opção invalida.");
				op = 1;// ao sair do case retorna ao menu
				break;
			}

		} while (op == 1);
	}
}
package application;

import java.util.Scanner;
import entities.Product;

public class Progam {

	public static void main(String []args) {

		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Cadastrando produto:");
		System.out.println("Nome: ");
		product.name = sc.nextLine();
		System.out.println("\nPreco: ");
		product.price = sc.nextDouble();
		System.out.println("\nQuantidade: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("\nProduto cadastrado "+product);
		
		System.out.println("\nDigite a quantidade que deseja adicionar:");
		 int quantity = sc.nextInt();
		 product.Addproduct(quantity);
		
		System.out.println("\nDados Atualizados: "+product);
		
		System.out.println("\nDigite a quantidade que deseja remover: ");
		 quantity = sc.nextInt();
		 product.removeProducts(quantity);
		 
		 System.out.println("\nDados Atualizados: "+product);
		
		
	}
}

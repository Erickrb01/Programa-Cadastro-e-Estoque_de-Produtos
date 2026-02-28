package application;

import java.util.Scanner;
import entities.Product;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastrando produto:");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("\nPreco: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);

		product.setName("computer");
		System.out.println("Update nome: " + product.getName());
		product.setPrice(700.00);
		System.out.println("Update price: " + product.getPrice());

		System.out.println("\nProduto cadastrado " + product);

		System.out.println("\nDigite a quantidade que deseja adicionar:");
		int quantity = sc.nextInt();
		product.Addproduct(quantity);

		System.out.println("\nDados Atualizados: " + product);

		System.out.println("\nDigite a quantidade que deseja remover: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("\nDados Atualizados: " + product);
		sc.close();

	}
}

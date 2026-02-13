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
		System.out.println("Preco: ");
		product.price = sc.nextDouble();
		System.out.println("Quantidade: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println(product);
		
	}
}

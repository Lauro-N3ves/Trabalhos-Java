package org.example;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n === MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por codigo");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opcao de cadastro selecionada.");

                    
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(codigo, nome, preco);
                    produtos.add(produto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Opcao de busca selecionada.");

                   
                    System.out.print("Digite o código do produto a ser buscado: ");
                    int codigoBusca = scanner.nextInt();

                    
                    boolean encontrado = false;
                    for (Produto p : produtos) {
                        if (p.codigo == codigoBusca) {
                            System.out.println("Produto encontrado: " + p);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;

                case 0: // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida. Digite novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

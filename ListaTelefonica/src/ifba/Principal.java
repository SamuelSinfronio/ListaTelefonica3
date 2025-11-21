package ifba;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ListaEncadeada lista = new ListaEncadeada();

	        int op;

	        do {
	            System.out.println("\n===== LISTA TELEFÔNICA =====");
	            System.out.println("1 - Inserir no início");
	            System.out.println("2 - Inserir no fim");
	            System.out.println("3 - Inserir em posição");
	            System.out.println("4 - Remover no início");
	            System.out.println("5 - Remover no fim");
	            System.out.println("6 - Remover em posição");
	            System.out.println("7 - Verificar posição");
	            System.out.println("8 - Pesquisar por nome");
	            System.out.println("9 - Listar contatos");
	            System.out.println("0 - Sair");
	            System.out.print("Opção: ");
	            op = sc.nextInt();
	            sc.nextLine(); // limpar buffer

	            switch (op) {

	                case 1:
	                    System.out.print("Nome: ");
	                    String n1 = sc.nextLine();
	                    System.out.print("Telefone: ");
	                    String t1 = sc.nextLine();
	                    lista.inserirInicio(new Telefone(n1, t1));
	                    break;

	                case 2:
	                    System.out.print("Nome: ");
	                    String n2 = sc.nextLine();
	                    System.out.print("Telefone: ");
	                    String t2 = sc.nextLine();
	                    lista.inserirFim(new Telefone(n2, t2));
	                    break;

	                case 3:
	                    System.out.print("Nome: ");
	                    String n3 = sc.nextLine();
	                    System.out.print("Telefone: ");
	                    String t3 = sc.nextLine();
	                    System.out.print("Posição: ");
	                    int p3 = sc.nextInt();
	                    lista.inserirPosicao(new Telefone(n3, t3), p3);
	                    break;

	                case 4:
	                    lista.removerInicio();
	                    break;

	                case 5:
	                    lista.removerFim();
	                    break;

	                case 6:
	                    System.out.print("Posição: ");
	                    int p6 = sc.nextInt();
	                    lista.removerPosicao(p6);
	                    break;

	                case 7:
	                    System.out.print("Posição: ");
	                    int p7 = sc.nextInt();
	                    Telefone tel7 = lista.verificarPosicao(p7);
	                    if (tel7 != null) System.out.println("Encontrado: " + tel7);
	                    break;

	                case 8:
	                    System.out.print("Nome para pesquisar: ");
	                    String pesq = sc.nextLine();
	                    Telefone tel8 = lista.pesquisar(pesq);
	                    if (tel8 != null) System.out.println("Encontrado: " + tel8);
	                    else System.out.println("Contato não encontrado.");
	                    break;

	                case 9:
	                    lista.listar();
	                    break;

	                case 0:
	                    System.out.println("Até a próxima!");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }

	        } while (op != 0);

	        sc.close();
	    }
}

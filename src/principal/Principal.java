package principal;

import java.util.Scanner;
import dao.PessoaDAO;
import model.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PessoaDAO dao = new PessoaDAO();

        int opcao;

        do {

            System.out.println("\n1 - Listar");
            System.out.println("2 - Inserir");
            System.out.println("3 - Excluir");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            if (opcao == 1) {

                dao.listar();

            } else if (opcao == 2) {

                Pessoa p = new Pessoa();

                sc.nextLine();

                System.out.print("Nome: ");
                p.setNome(sc.nextLine());

                System.out.print("Idade: ");
                p.setIdade(sc.nextInt());

                dao.inserir(p);

            } else if (opcao == 3) {

                System.out.print("ID para excluir: ");
                int id = sc.nextInt();

                dao.excluir(id);

            } else if (opcao == 4) {

                Pessoa p = new Pessoa();

                System.out.print("ID: ");
                p.setId(sc.nextInt());

                sc.nextLine();

                System.out.print("Novo nome: ");
                p.setNome(sc.nextLine());

                System.out.print("Nova idade: ");
                p.setIdade(sc.nextInt());

                dao.atualizar(p);
            }

        } while (opcao != 5);

        sc.close();
    }
}
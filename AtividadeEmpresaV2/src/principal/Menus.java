package principal;

import controle.CadastroCliente;
import controle.CadastroGerente;
import controle.CadastroVendedor;
import util.Input;

public class Menus {

    public static void menuPrincipal(){
        int op = 1;
        do{
            System.out.println("====Menu Principal====");
            System.out.println("| 1 - Cadastrar      |");
            System.out.println("| 2 - Exibir Dados   |");
            System.out.println("| 0 - Sair           |");
            System.out.println("======================");
            System.out.print("Resposta: ");
            op = Input.nextInt();

            switch (op) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> menuCadastro();
                case 2 -> menuExibir();
                default -> System.out.println("Por favor, insira um valor correto =)");
            }

        }while(op != 0);

    }

    private static void menuCadastro(){
        int op = 1;
        do{
            System.out.println("========Menu Cadastro========");
            System.out.println("| 1 - Cadastrar Cliente     |");
            System.out.println("| 2 - Cadastrar Vendedor    |");
            System.out.println("| 3 - Cadastrar Gerente     |");
            System.out.println("| 0 - Sair do menu Cadastro |");
            System.out.println("=============================");
            System.out.print("Resposta: ");
            op = Input.nextInt();

            switch (op) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> CadastroCliente.cadastrar();
                case 2 -> CadastroVendedor.cadastrar();
                case 3 -> CadastroGerente.cadastrar();
                default -> System.out.println("Por favor, insira um valor correto =)");
            }
        }while(op != 0);
    }

    private static void menuExibir(){
        int op = 1;
        do{
            System.out.println("========Menu Cadastro========");
            System.out.println("| 1 - Exibir Clientes       |");
            System.out.println("| 2 - Exibir Vendedor       |");
            System.out.println("| 3 - Exibir Gerente        |");
            System.out.println("| 0 - Sair do menu Exibir   |");
            System.out.println("=============================");
            System.out.print("Resposta: ");
            op = Input.nextInt();

            switch (op) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> CadastroCliente.exibir();
                case 2 -> CadastroVendedor.exibir();
                case 3 -> CadastroGerente.exibir();
                default -> System.out.println("Por favor, insira um valor correto =)");
            }
        }while(op != 0);
    }

}

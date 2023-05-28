package controle;

import modelo.Cliente;
import util.Input;

import java.util.ArrayList;
public class CadastroCliente {
     private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void cadastrar(){
        Cliente cli = new Cliente();

        UtilCadastro.setarDadosPessoa(cli);


        System.out.print("Digite o limite de credito: ");
        cli.setLimiteCredito(Input.nextDouble());

        listaClientes.add(cli);
    }

    public static void exibir(){
        for (Cliente listaCliente : listaClientes) {
            listaCliente.exibirCliente();
        }
    }




}

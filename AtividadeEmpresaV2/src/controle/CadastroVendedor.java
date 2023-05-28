package controle;

import modelo.Vendedor;

import java.util.ArrayList;

public class CadastroVendedor {
    private static ArrayList<Vendedor> listaVendedores = new ArrayList<>();
    public static void cadastrar(){
        Vendedor ven = new Vendedor();
        UtilCadastro.setarDadosFuncionario(ven);
        listaVendedores.add(ven);
    }
    public static void exibir(){
        for (Vendedor listaVendedor : listaVendedores) {
            listaVendedor.exibirVendedor();
        }
    }
}

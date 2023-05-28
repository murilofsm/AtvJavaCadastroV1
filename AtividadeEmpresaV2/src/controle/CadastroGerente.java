package controle;

import modelo.Gerente;
import util.Input;

import java.util.ArrayList;

public class CadastroGerente {

    private static ArrayList<Gerente> listaGerentes = new ArrayList<>();
    public static void cadastrar(){
        Gerente gen = new Gerente();
        UtilCadastro.setarDadosFuncionario(gen);
        System.out.print("Digite o departamento: ");
        gen.setDepartamento(Input.nextLine());
        System.out.print("Digite bonus: ");
        gen.setBonus(Input.nextDouble());
        listaGerentes.add(gen);
    }

    public static void exibir(){
        for (Gerente listaGerente : listaGerentes) {
            listaGerente.exibirGerente();
        }
    }

}

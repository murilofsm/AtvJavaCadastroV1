package modelo;

import java.time.LocalDate;

public class Vendedor extends Funcionario{
    public Vendedor() {
    }

    public Vendedor(String nome, String login, String senha, String email, String cpf, Endereco endereco, String ctps, LocalDate dataDeAdimissao, double salario) {
        super(nome, login, senha, email, cpf, endereco, ctps, dataDeAdimissao, salario);
    }




    public void exibirVendedor() {
        System.out.println(exibirFuncionario()+ " | Salário: "+calculoSalario2());
    }
}

package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcionario extends Pessoa{

    protected String ctps;
    protected LocalDate dataDeAdimissao;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String login, String senha, String email, String cpf, Endereco endereco, String ctps, LocalDate dataDeAdimissao, double salario) {
        super(nome, login, senha, email, cpf, endereco);
        this.ctps = ctps;
        this.dataDeAdimissao = dataDeAdimissao;
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public LocalDate getDataDeAdimissao() {
        return dataDeAdimissao;
    }

    public void setDataDeAdimissao(LocalDate dataDeAdimissao) {
        this.dataDeAdimissao = dataDeAdimissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoSalario2(){

        int anos = 2023 - getDataDeAdimissao().getYear();
        double salarioNovo = getSalario() * (anos*0.01);
        return getSalario() + salarioNovo;

    }
    /*
    public double calculoSalario3(){
        (LocalDate.now().minus(getDataDeAdimissao().) );
        int anos = 2023 - getDataDeAdimissao().getYear();
        double salarioNovo = getSalario() * (anos*0.01);
        return getSalario() + salarioNovo;

    }

     */


    public String exibirFuncionario() {
       return exibirPessoa() + "\nCTPS : "+getCtps()+ "| Data de Adimissão: "+getDataDeAdimissao();
    }
}

package modelo;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    protected String departamento;
    protected double bonus;

    public Gerente(){

    }
    public Gerente(String departamento, double bonus) {
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public Gerente(String nome, String login, String senha, String email, String cpf, Endereco endereco, String ctps, LocalDate dataDeAdimissao, double salario, String departamento, double bonus) {
        super(nome, login, senha, email, cpf, endereco, ctps, dataDeAdimissao, salario);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculoSalario2(){
        return super.calculoSalario2()+getBonus();
    }



    public void exibirGerente() {
        System.out.println(exibirFuncionario()+" | Salário: "+ calculoSalario2()+" | Departamento: "+getDepartamento());
    }

}

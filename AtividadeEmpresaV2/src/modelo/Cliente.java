package modelo;

public class Cliente extends Pessoa{

    protected double limiteCredito;

    public Cliente() {
    }
    public Cliente(String nome, String login, String senha, String email, String cpf, Endereco endereco, double limiteCredito) {
        super(nome, login, senha, email, cpf, endereco);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void exibirCliente() {
        System.out.println(exibirPessoa() + "| Limite Credito : "+getLimiteCredito());
    }
}

package controle;

import modelo.Endereco;
import modelo.Funcionario;
import modelo.Pessoa;
import util.Input;

public class UtilCadastro {
    protected static void setarDadosPessoa(Pessoa pessoa){
        System.out.print("Digite o nome: ");
        pessoa.setNome(Input.nextLine());
        System.out.print("Digite o login: ");
        pessoa.setLogin(Input.nextLine());
        System.out.print("Digite a senha: ");
        pessoa.setSenha(Input.nextLine());
        System.out.print("Digite o email: ");
        pessoa.setEmail(Input.nextLine());
        System.out.print("Digite o cpf: ");
        pessoa.setCpf(Input.nextLine());
        pessoa.setEndereco(setarDadosEndereco());
    }

    private static Endereco setarDadosEndereco(){
        Endereco endereco = new Endereco();
        System.out.print("Digite a Cidade: ");
        endereco.setCidade(Input.nextLine());
        System.out.print("Digite a Rua: ");
        endereco.setRua(Input.nextLine());
        System.out.print("Digite a Número: ");
        endereco.setNumero(Input.nextLine());
        return endereco;
    }
    protected static void setarDadosFuncionario(Funcionario funcionario){
        setarDadosPessoa(funcionario);
        System.out.print("Digite CTPS: ");
        funcionario.setCtps(Input.nextLine());
        System.out.print("Digite a data de admissão: ");
        funcionario.setDataDeAdimissao(Input.nextLocalDate());
        System.out.print("Digite o salário: ");
        funcionario.setSalario(Input.nextDouble());

    }
}

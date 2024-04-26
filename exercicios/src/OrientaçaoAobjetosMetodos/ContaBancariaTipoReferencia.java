package OrientaçaoAobjetosMetodos;

/*um exemplo de código que demonstra como pode usar a passagem de parâmetros
por referência para manipular o estado de uma conta bancária*/

public class ContaBancariaTipoReferencia {
    private String titular;
    private double saldo;

    // Construtor da classe
    public ContaBancariaTipoReferencia(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valorDeposito) {
        System.out.println("Depositando: " + valorDeposito);
        this.saldo += valorDeposito; // Atualiza o saldo adicionando o valor do depósito
        System.out.println("Novo saldo: " + this.saldo);
    }

    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.println("Saldo atual de " + this.titular + ": " + this.saldo);
    }

    public static void main(String[] args) {
        // Criando uma nova conta bancária para João com saldo inicial de 100
        ContaBancariaTipoReferencia contaJoao = new ContaBancariaTipoReferencia("João", 100.0);

        // Exibindo o saldo inicial da conta de João
        contaJoao.exibirSaldo();

        // Realizando um depósito de 50 na conta de João
        double valorDeposito = 50.0;
        contaJoao.depositar(valorDeposito);

        // Exibindo o saldo atualizado da conta de João
        contaJoao.exibirSaldo();
    }

}

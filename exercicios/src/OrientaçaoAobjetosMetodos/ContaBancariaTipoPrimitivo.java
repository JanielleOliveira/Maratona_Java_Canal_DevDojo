package OrientaçaoAobjetosMetodos;

/*Atualização de Estado: Se você tem um método que atualiza o estado de algum objeto com base em um valor primitivo, como
atualizar o saldo de uma conta bancária com um valor de depósito, você pode passar o valor do depósito como parâmetro
e o método atualizaria o saldo sem afetar o valor original do depósito.*/

    public class ContaBancariaTipoPrimitivo {
        //Passagem de parâmetros por valor
        private double saldo;

        // Construtor da classe
        public ContaBancariaTipoPrimitivo(double saldoInicial) {
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
            System.out.println("Saldo atual: " + this.saldo);
        }

        public static void main(String[] args) {
            // Criando uma nova conta bancária com saldo inicial de 100
            ContaBancariaTipoPrimitivo minhaConta = new ContaBancariaTipoPrimitivo(100.0);

            // Exibindo o saldo inicial da conta
            minhaConta.exibirSaldo();

            // Realizando um depósito de 50 na conta
            double valorDeposito = 50.0;
            minhaConta.depositar(valorDeposito);

            // Exibindo o saldo atualizado da conta
            minhaConta.exibirSaldo();
        }
    }



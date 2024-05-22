public class Main {
    public static void main(String[] args) {
       Cliente murilo = new Cliente();
       murilo.setNome("Murilo");

        Conta cc = new ContaCorrente(murilo);
        cc.depositar(100);
        
       
        Conta poupanca = new ContaPoupanca(murilo);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        
       
    }
}

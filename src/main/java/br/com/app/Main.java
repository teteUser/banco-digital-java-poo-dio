package br.com.app;

public class Main {
    public static void main(String[] args){
        Banco santander = new Banco("Santander");
        Banco bradesco = new Banco("Bradesco");

        Cliente tete = new Cliente("Tete");
        Conta cc1 = new ContaCorrente(tete, santander);
        cc1.depositar(1350d);

        Cliente juca = new Cliente("Juca");
        Conta cc2 = new ContaPoupanca(juca, bradesco);
        cc2.depositar(1800d);

        Cliente goiabada = new Cliente("Goiabada");
        Conta cc3 = new ContaPoupanca(goiabada, bradesco);
        cc3.depositar(2400d);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        cc3.imprimirExtrato();

        cc1.transferir(200d, cc2);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();

        System.out.println("Lista de contas do Banco Santander: " + santander.getContas());
        System.out.println("Lista de contas do Banco Bradesco: " + bradesco.getContas());


    }
}

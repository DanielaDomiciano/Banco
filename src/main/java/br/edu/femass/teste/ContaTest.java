package br.edu.femass.teste;

import br.edu.femass.model.Cliente;
import br.edu.femass.model.Conta;

import java.sql.SQLOutput;

public class ContaTest {

    public static void main(String[] args) {
        Cliente c =new Cliente(
                "Joao da Silva",
                "65006006064" );
        System.out.println("Imprimindo daos do cliente" + c.toString());

        c.criarConta(0D);
        c.criarConta(5000D);

        System.out.println("Imprimindo as contas do Cliente");
        for (Conta conta: c.getContas()){
            System.out.println("Número: " + conta.toString());

        }

        Conta conta = c.getContas().get(1);
        try {
            conta.creditar(1000D);
            conta.debitar(120D);
            conta.debitar(3000D);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Histórico de operações: \n" + conta.getHistorico());
    }
}

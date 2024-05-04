package ContaBancaria;

import java.util.Scanner;

public class ContaBanco {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Float saldo;

    public ContaBanco( Integer numero, String agencia, String nomeCliente, Float saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public Float getSaldo() {
        return saldo;
    }

}


class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Insira a agência: ");
        String agencia = sc.nextLine();
        System.out.print("Insira o numero da conta: ");
        Integer numero = sc.nextInt(); 
        System.out.print("Insira o saldo inicial: ");
        Float saldo = sc.nextFloat();

        ContaBanco cb = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + cb.getNomeCliente() +  ", obrigado por criar uma conta em nosso banco," 
        + " sua agência é " + cb.getAgencia() + ", conta " + cb.getNumero() + " e seu saldo " 
        + cb.getSaldo() + " já está disponível para saque.");
        
        sc.close();
    }

}
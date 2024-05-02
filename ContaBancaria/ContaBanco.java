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
        
        Scanner s = new Scanner(System.in);
        
    }

}
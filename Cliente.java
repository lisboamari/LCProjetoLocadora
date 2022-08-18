package main.Cliente;

import main.Aluguel;

public abstract class Cliente {
    
    protected String nomeCliente;
    protected String cpfCliente;
    protected double descontoCliente;
    protected Aluguel aluguel;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public double getDescontoCliente() {
        return descontoCliente;
    }
    public void setDescontoCliente(double descontoCliente) {
        this.descontoCliente = descontoCliente;
    }

    public Cliente() {};

    public Cliente(String nomeCliente, String cpfCliente, double descontoCliente, Aluguel aluguel) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.descontoCliente = descontoCliente;
        this.aluguel = aluguel;
    }

    public double descontoCliente(Aluguel aluguel) {
        double descontoCliente = 1;
        return descontoCliente;
    }

    @Override
    public String toString() {
        return nomeCliente + " " + cpfCliente;
    }

}

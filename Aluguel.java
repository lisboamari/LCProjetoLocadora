package main;

import main.Cliente.Cliente;
import main.Veiculo.Veiculo;

public class Aluguel {

    public int diasAluguel;
    public double valorLocacao;
    public Cliente cliente;
    public Veiculo veiculo;
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public int getDiasAluguel() {
        return diasAluguel;
    }
    
    public void setDiasAluguel(int diasAluguel) {
        this.diasAluguel = diasAluguel;
    }
    
    public double getValorLocacao() {
        return valorLocacao;
    }
    
    public Aluguel (Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Aluguel() {};

    public double valorAluguel(Cliente cliente, Veiculo veiculo) {
        int diasContratados = this.getDiasAluguel();
        double precoDiaria = veiculo.getPrecoVeiculo();
        double descontoDocliente = cliente.descontoCliente(this);

        double diariaComDesconto = precoDiaria * descontoDocliente;
        double valorLocacao = diasContratados * diariaComDesconto;

        return valorLocacao;
    }
    
    @Override
    public String toString() {
        return "Locação de " + cliente.getNomeCliente() + '\n' +
            "Veículo: " + veiculo.getMarcaVeiculo() + " " + veiculo.getModeloVeiculo() + '\n' +
          "Valor da Diária: R$" + veiculo.getPrecoVeiculo() + "; Dias de locação: " + this.diasAluguel + '\n' +
          "Valor total da locação: R$ " + valorAluguel(cliente, veiculo) + '\n' +
          "-----";
    }

    public void informacoes () {
        System.out.println(this.toString());
    }

}

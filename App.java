// Enunciado

// Crie uma aplicação que simule uma app para a locação de veículos. 
// Os clientes podem alugar três tipos diferentes de veículos sendo pequeno, médio e SUV. 
// O preço base da diária do aluguel de um veículo é 100 reais para carro pequeno, 150 para médio e 200 para SUV. 
// Os clientes de um aluguel podem ser pessoas físicas ou jurídicas, pessoas físicas tem desconto de 5% caso o aluguel tenha mais de 5 diárias, 
// já pessoas jurídicas tem 10% de desconto caso o aluguel tenha mais de 3 diárias.

// Crie a classe Aluguel que deve receber um Veículo, um Cliente e uma quantidade de dias para esse aluguel. 
// Com essas informações, a classe deve calcular qual é o valor final do aluguel.

// Use a classe Aplicacao para criar seu método main e demonstrar o funcionamento do seu código.


package main;

import main.Veiculo.*;
import main.Cliente.*;

public class App {

    public Aluguel novoAluguel (Cliente cliente, Veiculo veiculo) {
        return new Aluguel(cliente, veiculo);
    }

    public static void main(String[] args) throws Exception {

        //Cliente PJ
        Cliente mariana = new ClientePJ();
        mariana.setNomeCliente("Mariana");
        mariana.setCpfCliente("01234567");

        //Cliente PF
        Cliente luisa = new ClientePF();
        luisa.setNomeCliente("Luisa");
        luisa.setCpfCliente("7654321");

        //Veículo Pequeno
        Veiculo kwid = new VeiculoPequeno();
        kwid.setMarcaVeiculo("Renault");
        kwid.setModeloVeiculo("Kwid");

        //Veículo Médio
        Veiculo tesla = new VeiculoMedio();
        tesla.setMarcaVeiculo("Tesla");
        tesla.setModeloVeiculo("Model S");

        //Veículo SUV
        Veiculo velar = new VeiculoSUV();
        velar.setMarcaVeiculo("Range Rover");
        velar.setModeloVeiculo("Velar");

        //Novos aluguéis
        Aluguel aluguelMariana = new Aluguel(mariana, tesla);
        aluguelMariana.setDiasAluguel(5);
        aluguelMariana.valorAluguel(mariana, tesla);
        aluguelMariana.informacoes();

        Aluguel aluguelMarianaVelar = new Aluguel(mariana, velar);
        aluguelMarianaVelar.setDiasAluguel(7);
        aluguelMarianaVelar.valorAluguel(mariana, velar);
        aluguelMarianaVelar.informacoes();

        Aluguel aluguelLuisaTesla = new Aluguel(luisa, tesla);
        aluguelLuisaTesla.setDiasAluguel(5);
        aluguelLuisaTesla.valorAluguel(luisa, tesla);
        aluguelLuisaTesla.informacoes();

        Aluguel aluguelLuisaKwid = new Aluguel(luisa, kwid);
        aluguelLuisaKwid.setDiasAluguel(5);
        aluguelLuisaKwid.valorAluguel(luisa, kwid);
        aluguelLuisaKwid.informacoes();

    }
}

package main.Cliente;

import main.Aluguel;
import main.Veiculo.Veiculo;

public class ClientePF extends Cliente {

    protected Aluguel aluguel;
    protected Veiculo veiculo;

    @Override
    public double descontoCliente(Aluguel aluguel) {
        int diasAluguel = aluguel.getDiasAluguel();
        if (diasAluguel >= 5) {
            descontoCliente = 0.95;
        } else {
            descontoCliente = 1;
        }
        return descontoCliente;
    }
    
    public ClientePF (String nomeCliente, String cpfCliente, double descontoCliente, Aluguel aluguel) {
        super(nomeCliente, cpfCliente, descontoCliente, aluguel);
    }

    public ClientePF() {};
    
}

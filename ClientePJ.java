package main.Cliente;
import main.Aluguel;
import main.Veiculo.Veiculo;

public class ClientePJ extends Cliente {

    protected Aluguel aluguel;
    protected Veiculo veiculo;

    @Override
    public double descontoCliente(Aluguel aluguel) {
        int diasAluguel = aluguel.getDiasAluguel();
        if (diasAluguel >= 3) {
            descontoCliente = 0.90;
        } else {
            descontoCliente = 1;
        }
        return descontoCliente;
    }
    
    public ClientePJ (String nomeCliente, String cpfCliente, double descontoCliente, Aluguel aluguel) {
        super(nomeCliente, cpfCliente, descontoCliente, aluguel);
    }

    public ClientePJ() {};
}

package main.Veiculo;

public class VeiculoMedio extends Veiculo {

    @Override
    public double getPrecoVeiculo() {
        this.precoVeiculo = 150;
        return precoVeiculo;
    }

    public VeiculoMedio (String marcaVeiculo, String modeloVeiculo, final double precoVeiculo) {
        super (marcaVeiculo, modeloVeiculo, precoVeiculo);
    }
    
    public VeiculoMedio() {};
}

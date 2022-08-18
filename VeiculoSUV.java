package main.Veiculo;

public class VeiculoSUV extends Veiculo {

    @Override
    public double getPrecoVeiculo() {
        this.precoVeiculo = 200;
        return precoVeiculo;
    }

    public VeiculoSUV (String marcaVeiculo, String modeloVeiculo, double precoVeiculo) {
        super (marcaVeiculo, modeloVeiculo, precoVeiculo);
    }
    
    public VeiculoSUV() {};
}

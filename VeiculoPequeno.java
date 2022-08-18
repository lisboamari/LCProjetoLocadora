package main.Veiculo;

public class VeiculoPequeno extends Veiculo {

    @Override
    public double getPrecoVeiculo() {
        this.precoVeiculo = 100;
        return precoVeiculo;
    }
    
    public VeiculoPequeno (String marcaVeiculo, String modeloVeiculo, final double precoVeiculo) {
        super (marcaVeiculo, modeloVeiculo, precoVeiculo);
    }
    
    public VeiculoPequeno() {};

}

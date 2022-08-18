package main.Veiculo;

public abstract class Veiculo {

    protected String marcaVeiculo;
    protected String modeloVeiculo;
    protected double precoVeiculo;

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }
    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }
    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
    public double getPrecoVeiculo() {
        return precoVeiculo;
    }
    public void setPrecoVeiculo(double precoVeiculo) {
        this.precoVeiculo = precoVeiculo;
    }

    public Veiculo() {};

    public Veiculo (String marcaVeiculo, String modeloVeiculo, double precoVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.precoVeiculo = precoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo [marcaVeiculo=" + marcaVeiculo + ", modeloVeiculo=" + modeloVeiculo + ", precoVeiculo="
                + precoVeiculo + "]";
    }
    

}

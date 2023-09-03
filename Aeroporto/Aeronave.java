public class Aeronave {
    private String modelo;
    private int capacidade;
    private String companhia;

    public Aeronave(String modelo, int capacidade, String companhia) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.companhia = companhia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public void voar() {
        System.out.println("Aeronave modelo " + getModelo() + " está voando pela companhia " + getCompanhia() + ".");
    }
}
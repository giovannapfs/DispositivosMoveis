 public class Piloto extends Pessoa {
    private String brevete;
    private int horasVoadas;
    private Aeronave aeronave;
    public Passageiro numeroVoo;

    public Piloto(String nome, int idade, String sexo, String brevete, int horasVoadas) {
        super(nome, idade, sexo);
        this.brevete = brevete;
        this.horasVoadas = horasVoadas;
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete;
    }

    public int getHorasVoadas() {
        return horasVoadas;
    }

    public void setHorasVoadas(int horasVoadas) {
        this.horasVoadas = horasVoadas;
    }

    public void pilotar() {
        System.out.println(getNome() + " está pilotando com brevete " + brevete + ", e com um total de " + horasVoadas + " horas voadas.");
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public String getModeloAeronave(Aeronave aeronave) {
        return aeronave.getModelo();
    }

    public Passageiro getNumeroVoo(Passageiro numeroVoo) {
        return numeroVoo;
    }

    public void setNumeroVoo(Passageiro numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void pilotoAeronave(Aeronave aeronave){
        String modeloAeronave = aeronave.getModelo();
        System.out.println("O piloto da aeronave " + modeloAeronave + " é " + getNome());
    }
}

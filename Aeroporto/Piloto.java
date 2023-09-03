public class Piloto extends Pessoa {
    private String brevete;
    private int horasVoadas;
    private Aeronave aeronave;

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
}
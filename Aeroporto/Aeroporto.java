public class Aeroporto {
    private String nome;
    private String cidade;
    private String pais;

    public Aeroporto(String nome, String cidade, String pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

      public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void operarVoo(Aeronave aeronave) {
        System.out.println("Aeroporto " + getNome() + " está operando uma aeronave com modelo " + aeronave.getModelo());
    }
}
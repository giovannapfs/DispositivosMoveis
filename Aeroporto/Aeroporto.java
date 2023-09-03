import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private String cidade;
    private String pais;
    private List<Aeronave> aeronaves; 

    public Aeroporto(String nome, String cidade, String pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.aeronaves = new ArrayList<>();
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
        aeronaves.add(aeronave); 
        System.out.println("Aeroporto " + getNome() + " está operando uma aeronave com modelo " + aeronave.getModelo());
    }

    public void listarAeronaves() {
        System.out.println("Aeroporto " + getNome() + " possui as seguintes aeronaves:");
        for (Aeronave aeronave : aeronaves) {
            System.out.println("- Modelo: " + aeronave.getModelo());
        }
    }
}
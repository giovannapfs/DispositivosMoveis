public class Passageiro extends Pessoa {
    private int numeroVoo;
    private int bagagem;

    public Passageiro(String nome, int idade, String sexo, int numeroVoo, int bagagem) {
        super(nome, idade, sexo);
        this.numeroVoo = numeroVoo;
        this.bagagem = bagagem;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getBagagem() {
        return bagagem;
    }

    public void setBagagem(int bagagem) {
        this.bagagem = bagagem;
    }

    public void reservarVoo() {
        System.out.println(getNome() + " reservou um voo com número " + numeroVoo + ", e está levando " + bagagem + " bagagens.");
    }
}
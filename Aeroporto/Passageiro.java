public class Passageiro extends Pessoa {
    public int numeroVoo;
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

    public String getModeloAeronave(Aeronave aeronave) {
        return aeronave.getModelo();
    }

    public void reservarVoo() {
        System.out.println(getNome() + " reservou um voo com número " + numeroVoo + ", e está levando " + bagagem + " bagagens.");
    }

    public void vooAeronave(Aeronave aeronave) {
        String modeloAeronave = aeronave.getModelo();
        System.out.println("Os passageiros do voo " + getNumeroVoo() + " vão embarcar na aernave " + modeloAeronave);
    }
}
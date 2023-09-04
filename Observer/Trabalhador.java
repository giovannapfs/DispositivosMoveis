public class Trabalhador extends Pessoa implements Assinante {
    public Trabalhador(String nome, String documento) {
        super(nome, documento);
    }
    
    @Override
    public void lerNoticia(String noticia) {
        System.out.println(nome + " (Trabalhador) está lendo: " + noticia);
    }
}

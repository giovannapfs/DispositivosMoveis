public class Aluno extends Pessoa implements Assinante {
    public Aluno(String nome, String documento) {
        super(nome, documento);
    }
    
    @Override
    public void lerNoticia(String noticia) {
        System.out.println(nome + " (Aluno) está lendo: " + noticia);
    }
    
}

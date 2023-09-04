import java.util.ArrayList;
import java.util.List;

public class Revista implements Publicador {
    private String nome;
    private List<Assinante> assinantes = new ArrayList<>();
    
    public Revista(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }
    
    @Override
    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }
    
    @Override
    public void publicar(String noticia) {
        System.out.println("Revista " + nome + " publicou a notícia: " + noticia);
        for (Assinante assinante : assinantes) {
            assinante.lerNoticia(noticia);
        }
    } 
}

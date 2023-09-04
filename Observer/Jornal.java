import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publicador {
    private String nome;
    private List<Assinante> assinantes = new ArrayList<>();
    
    public Jornal(String nome) {
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
        System.out.println("Jornal " + nome + " publicou a notícia: " + noticia);
        for (Assinante assinante : assinantes) {
            assinante.lerNoticia(noticia);
        }
    }

    
}

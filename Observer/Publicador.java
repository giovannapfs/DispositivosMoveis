public interface Publicador {
    void adicionarAssinante(Assinante assinante);
    void removerAssinante(Assinante assinante);
    void publicar(String noticia);
}

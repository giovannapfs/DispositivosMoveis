public class Teste {
    public static void main(String[] args) {
        // Criando instâncias de Publicadores (Jornal e Revista)
        Jornal jornal1 = new Jornal("Notícias Diárias");
        Jornal jornal2 = new Jornal("Economia em Foco");
        Revista revista1 = new Revista("Ciência e Tecnologia");
        Revista revista2 = new Revista("Moda e Estilo");

        // Criando instâncias de Assinantes (Trabalhador e Aluno)
        Assinante assinante1 = new Trabalhador("Louis", "12345");
        Assinante assinante2 = new Aluno("Jaden", "67890");
        Assinante assinante3 = new Trabalhador("Nessa", "54321");

        // Vinculando Assinantes aos Publicadores
        jornal1.adicionarAssinante(assinante1);
        jornal1.adicionarAssinante(assinante2);
        jornal2.adicionarAssinante(assinante2);
        jornal2.adicionarAssinante(assinante3);
        revista1.adicionarAssinante(assinante1);
        revista2.adicionarAssinante(assinante3);

        // Executando o comportamento de publicação dos Publicadores
        jornal1.publicar("Manchete importante no Jornal Notícias Diárias!");
        System.out.println();
        jornal2.publicar("Nova edição do Jornal Economia em Foco disponível!");
        System.out.println();
        revista1.publicar("Nova edição da Revista Ciência e Tecnologia disponível!");
        System.out.println();
        revista2.publicar("Artigo de moda na Revista Moda e Estilo!");
    }
}


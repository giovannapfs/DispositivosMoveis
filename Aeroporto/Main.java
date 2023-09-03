public class Main {
    public static void main(String[] args) {
        // Instanciando algumas pessoas
        Passageiro passageiro1 = new Passageiro("Alice", 30, "Feminino", 12345, 2);
        Piloto piloto1 = new Piloto("Bob", 35, "Masculino", "P123", 5000);
        Passageiro passageiro2 = new Passageiro("Carol", 25, "Feminino", 67890, 1);
        Piloto piloto2 = new Piloto("David", 40, "Masculino", "P456", 6000);

        // Instanciando algumas aeronaves
        Aeronave aeronave1 = new Aeronave("Boeing 747", 400, "Airline X");
        Aeronave aeronave2 = new Aeronave("Airbus A320", 200, "Airline Y");

        // chamando os métodos
        System.out.println();
        passageiro1.cadastrar();
        passageiro2.cadastrar();
        piloto1.cadastrar();
        piloto2.cadastrar();

        // Imprimindo os nomes dos passageiros e pilotos
        System.out.println();
        System.out.println("Passageiro 1: " + passageiro1.getNome());
        System.out.println("Passageiro 2: " + passageiro2.getNome());
        System.out.println();
        System.out.println("Piloto 1: " + piloto1.getNome());
        System.out.println("Piloto 2: " + piloto2.getNome());

        System.out.println();
        piloto1.pilotar();
        piloto2.pilotar();

        System.out.println();
        passageiro1.reservarVoo();
        passageiro2.reservarVoo();

        System.out.println();
        aeronave1.voar();
        aeronave2.voar();
    }
}
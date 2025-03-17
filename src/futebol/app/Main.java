public class Main {
    public static void main(String[] args) {
        Atletico galo = new Atletico(3, 1, "Galo Doido");
        Cruzeiro zeiro = new Cruzeiro(4, 2, "Mineirão");

        System.out.println("=== Atlético Mineiro ===");
        galo.exibirInfo();
        
        System.out.println("\n=== Cruzeiro ===");
        zeiro.exibirInfo();
}

}
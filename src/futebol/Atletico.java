public class Atletico extends Futebol {
    private String mascote;

    public Atletico(int titulosNacionais, int titulosInternacionais, String mascote) {
        super("Atlético Mineiro", titulosNacionais, titulosInternacionais);
        this.mascote = mascote;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Mascote: " + mascote);
        System.out.println("Grito da Torcida: 'Galo! Galo! Galo!'");
    }
}
public class Cruzeiro extends Futebol {
    private String estadio;

    public Cruzeiro(int titulosNacionais, int titulosInternacionais, String estadio) {
        super("Cruzeiro", titulosNacionais, titulosInternacionais);
        this.estadio = estadio;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Estádio: " + estadio);
        System.out.println("Grito da Torcida: 'Zêêêroooo!'");
}
}

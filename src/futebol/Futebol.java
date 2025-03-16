public class Futebol {
    protected String nome;
    protected int titulosNacionais;
    protected int titulosInternacionais;

    public Futebol(String nome, int titulosNacionais, int titulosInternacionais) {
        this.nome = nome;
        this.titulosNacionais = titulosNacionais;
        this.titulosInternacionais = titulosInternacionais;
    }

    public void exibirInfo() {
        System.out.println("Time: " + nome);
        System.out.println("Títulos Nacionais: " + titulosNacionais);
        System.out.println("Títulos Internacionais: " + titulosInternacionais);
    }
}

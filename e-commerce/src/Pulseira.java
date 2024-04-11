public class Pulseira extends Acessorios {
    private int diametro;

    public Pulseira(String material, String cor, String marca, String preco, String forma, String genero, String categoria_acessorio, String revestimento, int diametro) {
        super(material, cor, marca, preco, forma, genero, categoria_acessorio, revestimento);
        this.diametro = diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDiametro() {
        return this.diametro;
    }
}

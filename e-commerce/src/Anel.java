public class Anel extends Acessorios {
    private int tamanho;

    public Anel(String material, String cor, String marca, String preco, String forma, String genero, String categoria_acessorio, String revestimento, int tamanho) {
        super(material, cor, marca, preco, forma, genero, categoria_acessorio, revestimento);
        this.tamanho = tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return this.tamanho;
    }
}

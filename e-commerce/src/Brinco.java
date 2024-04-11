public class Brinco extends Acessorios {
    private String tipoFixacao;

    public Brinco(String material, String cor, String marca, String preco, String forma, String genero, String categoria_acessorio, String revestimento, String tipoFixacao) {
        super(material, cor, marca, preco, forma, genero, categoria_acessorio, revestimento);
        this.tipoFixacao = tipoFixacao;
    }

    public void setTipoFixacao(String tipoFixacao) {
        this.tipoFixacao = tipoFixacao;
    }

    public String getTipoFixacao() {
        return this.tipoFixacao;
    }
}

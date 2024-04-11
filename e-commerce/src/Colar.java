public class Colar extends Acessorios {
    private String tipoFecho;

    public Colar(String material, String cor, String marca, String preco, String forma, String genero, String categoria_acessorio, String revestimento, String tipoFecho) {
        super(material, cor, marca, preco, forma, genero, categoria_acessorio, revestimento);
        this.tipoFecho = tipoFecho;
    }

    public void setTipoFecho(String tipoFecho) {
        this.tipoFecho = tipoFecho;
    }

    public String getTipoFecho() {
        return this.tipoFecho;
    }
}

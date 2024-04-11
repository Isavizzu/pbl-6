public class Acessorios extends Vestuario {
    private String categoria_acessorio;
    private String revestimento;

    public Acessorios(String material, String cor, String marca, String preco, String forma, String genero, String categoria_acessorio, String revestimento) {
        super(material, cor, marca, preco, forma, genero);
        this.categoria_acessorio = categoria_acessorio;
        this.revestimento = revestimento;
    }

    public void setCategoriaAcessorio(String categoria_acessorio) {
        this.categoria_acessorio = categoria_acessorio;
    }

    public String getCategoriaAcessorio() {
        return this.categoria_acessorio;
    }

    public void setRevestimento(String revestimento) {
        this.revestimento = revestimento;
    }

    public String getRevestimento() {
        return this.revestimento;
    }
}

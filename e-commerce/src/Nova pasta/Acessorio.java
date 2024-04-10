public class Acessorio extends Vestuario {

    private String categoria_acessorio;
    private String revestimento;

    public Acessorio(String material, String cor, String marca, String preco, String forma, String genero,
                     String categoria_acessorio, String revestimento){
        super(material, cor, marca, preco, forma, genero);
        this.categoria_acessorio = categoria_acessorio;
        this.revestimento = revestimento;
    }

}
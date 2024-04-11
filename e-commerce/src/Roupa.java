public class Roupa  extends Vestuario{
    private String tipoRoupa;
    private String estampa;
    private String tipoComprimento;

    public Roupa(String material, String cor, String marca, String preco, String forma, String genero, int estoque, String tipoRoupa, String estampa, String tipoComprimento){
        super(material, cor, marca, preco, forma, genero, estoque);
        this.tipoRoupa = tipoRoupa;
        this.estampa = estampa;
        this.tipoComprimento = tipoComprimento;
    }

    public String getTipoRoupa(){
        return  tipoRoupa;
    }

    public String getEstampa(){
        return estampa;
    }

    public String getTipoComprimento(){
        return  tipoComprimento;
    }

    public void descricao(){
        String espaco = "-------------------------";
        System.out.println(espaco);
        System.out.println("         Descrição        ");
        System.out.println(espaco);
        System.out.println("Cor: "+ getCor()+
                "\nMarca: "+ getMarca()+
                "\nPreço: "+ getPreco()+
                "\nForma: "+ getForma()+
                "\nGênero: "+ getGenero()+
                "\nEstoque: "+ getEstoque()+
                "\nMaterial: "+ getMaterial()+
                "\n Tipo de roupa: " + getTipoRoupa()+
                "\n Estampa: " +getEstampa()+
                "\n Tipo de comprimento: " +getTipoComprimento());
    }

}

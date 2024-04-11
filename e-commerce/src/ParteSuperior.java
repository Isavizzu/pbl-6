public class ParteSuperior extends Roupa{
    private String decote;
    private boolean gola;
    private boolean manga;

    public ParteSuperior(String material, String cor, String marca, String preco, String forma, String genero, int estoque,
                         String tipoRoupa, String estampa, String tipoComprimento,
                         String decote, boolean gola, boolean manga){
        super(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento);
        this.decote = decote;
        this.gola = gola;
        this.manga = manga;
    }
    public void descricao(){
        String temGola = verificaGola();
        String temManga = verificaManga();
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
                            "\n Tipo de comprimento: " +getTipoComprimento()+
                            "\nTipo de decote: "+ decote+
                            "\nTem gola: "+ temGola +
                            "\nTem mangas: "+ temManga);
    }
    private String verificaGola() {
        if (gola) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    private String verificaManga(){
        if (manga){
            return "Sim";
        }
        else{
            return "Não";
        }
    }

}

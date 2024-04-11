public class ParteInferior  extends Roupa{
    private String tipoCintura;
    private boolean bolso;
    private float comprimento;

    public ParteInferior(String material, String cor, String marca, String preco, String forma, String genero, int estoque,
                 String tipoRoupa, String estampa, String tipoComprimento,
                  String tipoCintura, boolean bolso, float comprimento){
        super(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento);
        this.tipoCintura = tipoCintura;
        this.bolso = bolso;
        this.comprimento = comprimento;
    }

    public void descricao(){
        String temBolso = verificaBolso();
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
                "\nTem bolso: "+ temBolso +
                "\nTipo de cintura: "+ tipoCintura +
                "\nComprimento: "+ comprimento);
    }

    private String verificaBolso() {
        if (bolso) {
            return "Sim";
        } else {
            return "Não";
        }
    }
}

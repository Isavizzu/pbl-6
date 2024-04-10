public class ParteInferior  extends Roupa{
    private String tipoCintura;
    private boolean bolso;
    private float comprimento;

    public ParteInferior(String material, String cor, String marca, String preco, String forma, String genero,
                 String tipoRoupa, String estampa, String tipoComprimento,
                  String tipoCintura, boolean bolso, float comprimento){
        super(material, cor, marca, preco, forma, genero, tipoRoupa, estampa, tipoComprimento);
        this.tipoCintura = tipoCintura;
        this.bolso = bolso;
        this.comprimento = comprimento;
    }
}

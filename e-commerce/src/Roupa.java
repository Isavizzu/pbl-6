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

    public String setTipoRoupa(){
        return  tipoRoupa;
    }

}

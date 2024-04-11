import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vestuario> vestuario = new ArrayList<>();
        boolean i = true;
        while(i == true){
            String espaco = "-------------------------";
            System.out.println(espaco);
            System.out.println("           Menu          ");
            System.out.println("0- Sair");
            System.out.println("1- Adicionar peça");
            System.out.println("2- Listar peças");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a opção que deseja: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Obrigado por utilizar nosso sistema do e-commerce!");
                    i = false;
                    break;
                case 1:
                    adicionar(espaco, scanner, vestuario);
                    break;
                case 2:
                    listar(vestuario);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }

        }
    }

    public static void listar(ArrayList<Vestuario> vestuario){
        for (Vestuario peca:vestuario){
            peca.descricao();
        }
    }
    public static void adicionar(String espaco, Scanner scanner, ArrayList<Vestuario> vestuario){
        while (true) {
            System.out.println(espaco);
            System.out.println("Você deseja:\n1- Adicionar uma roupa genérica" +
                    "\n2- Adicionar uma roupa para parte inferior" +
                    "\n3- Adicionar uma roupa para parte superior" +
                    "\n4- Adicionar uma peça de vestuário genérico" +
                    "\n5- Voltar para o menu");
            System.out.println("Digite a opção que deseja: ");
            int opcao = scanner.nextInt();
            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
                adicionarRoupa(scanner, espaco, opcao, vestuario);
            } else if (opcao == 5) {
                return;
            }
            else {
                System.out.println("Digite uma opçaõ válida!");
            }
        }
    }
    public static void adicionarRoupa(Scanner scanner, String espaco, int opcao, ArrayList<Vestuario> vestuario){
        Vestuario roupa;
        System.out.println(espaco);
        System.out.println("Digite o material da peça: ");
        String material = scanner.nextLine();
        System.out.println("Digite a cor da peça: ");
        String cor = scanner.nextLine();
        System.out.println("Digite a marca da peça: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o preço da peça: ");
        String preco = scanner.nextLine();
        System.out.println("Digite a forma (infantil/juvenil/adulto) da peça: ");
        String forma = scanner.nextLine();
        System.out.println("Digite o gênero da peça: ");
        String genero = scanner.nextLine();
        System.out.println("Digite a quantidade de unidades da peça: ");
        int estoque = scanner.nextInt();
        if(opcao == 1 || opcao == 2 || opcao == 3){
            System.out.println("Digite o nome da peça: ");
            String tipoRoupa = scanner.nextLine();
            System.out.println("Digite a estampa da peça: ");
            String estampa = scanner.nextLine();
            System.out.println("Digite o tipo de comprimento (longo/curto/médio) da peça: ");
            String tipoComprimento = scanner.nextLine();
            if (opcao == 1) {
                roupa = new Roupa(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento);
            }
            else if (opcao == 2) {
                System.out.println("Digite o tipo de cintura (alta/baixa/média) da peça: ");
                String tipoCintura = scanner.nextLine();
                System.out.println("Digite (1 para sim e 0 para não) se peça tem bolso: ");
                boolean bolso = scanner.nextBoolean();
                System.out.println("Digite o comprimento em cm da peça: ");
                float comprimento = scanner.nextFloat();
                roupa = new ParteInferior(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento, tipoCintura, bolso, comprimento);
            }
            else{
                System.out.println("Digite o tipo de decote da peça: ");
                String decote = scanner.nextLine();
                System.out.println("Digite (1 para sim e 0 para não) se peça tem gola: ");
                boolean gola = scanner.nextBoolean();
                System.out.println("Digite (1 para sim e 0 para não) se peça tem manga: ");
                boolean manga = scanner.nextBoolean();
                roupa = new ParteSuperior(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento, decote, gola, manga);
            }
        }
        else{
            roupa = new Vestuario(material, cor, marca, preco, forma, genero, estoque);
        }
        vestuario.add(roupa);
        System.out.println("Peça adicionada com sucesso!");
    }

}
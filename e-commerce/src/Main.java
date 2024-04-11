import java.util.ArrayList;
import java.util.Scanner;

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
                    "\n5- Adicionar um acessório" +
                    "\n6- Adicionar um calçado génerico" +
                    "\n7- Adicionar um tênis" +
                    "\n8- Adicionar uma bota" +
                    "\n9- Voltar para o menu");
            System.out.println("Digite a opção que deseja: ");
            int opcao = scanner.nextInt();
            if (opcao >= 1 && opcao <= 5){
                adicionarRoupa(scanner, espaco, opcao, vestuario);
            } else if (opcao == 9) {
                return;
            }
            else if (opcao >= 6 && opcao <= 8){
                adicionarCalcado(scanner, espaco, opcao, vestuario);
            }
            else {
                System.out.println("Digite uma opção válida!");
            }
        }
    }

    public static void adicionarCalcado(Scanner scanner, String espaco, int opcao, ArrayList<Vestuario> Vestuario){
        Vestuario calcado;
        System.out.println(espaco);
        System.out.println("Digite o material do calçado: ");
        scanner.nextLine(); 
        String material = scanner.nextLine();
        System.out.println("Digite a cor do calçado: ");
        String cor = scanner.nextLine();
        System.out.println("Digite a marca do calçado: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o preço do calçado: ");
        String preco = scanner.nextLine();
        System.out.println("Digite a forma (infantil/juvenil/adulto) do calçado: ");
        String forma = scanner.nextLine();
        System.out.println("Digite o gênero do calçado: ");
        String genero = scanner.nextLine();
        System.out.println("Digite a quantidade de pares: ");
        int estoque = scanner.nextInt();

         if(opcao >= 6 && opcao <= 8){
            System.out.println("Digite o nome da peça: ");
            scanner.nextLine(); // Limpa o buffer
            String tipoCalcado = scanner.nextLine();
            System.out.println("Digite o número do calçado: ");
            int numero = scanner.nextLine();
            if (opcao == 6) {
                calcado = new Calcado(material, cor, marca, preco, forma, genero, estoque, tipoCalcado, numero);
            }
            else if (opcao == 7) {
                System.out.println("Digite (true para sim e false para não) se o calçado tem cadarço: ");
                boolean cadarco = scanner.nextBoolean();
                System.out.println("Digite o tamanho da plataforma em cm do calçado: ");
                float tamanhoPlataforma = scanner.nextFloat();
                calcado = new Tenis(material, cor, marca, preco, forma, genero, estoque, tipoCalcado, numero, cadarco, tamanhoPlataforma);
            }
            else{
                System.out.println("Digite (true para sim e false para não) se o calçado tem salto: ");
                scanner.nextLine(); // Limpa o buffer
                boolean salto = scanner.nextBoolean();
                System.out.println("Digite o tamanho do cano da bota: ");
                int tamanhoCano = scanner.nextBoolean();
                calcado = new Bota(material, cor, marca, preco, forma, genero, estoque, tipoCalcado, numero, salto, tamanhoCano);
            }
        }
        vestuario.add(calcado);
        System.out.println("Calçado adicionada com sucesso!");
        
    }
    
    public static void adicionarRoupa(Scanner scanner, String espaco, int opcao, ArrayList<Vestuario> vestuario){
        Vestuario roupa;
        System.out.println(espaco);
        System.out.println("Digite o material da peça: ");
        scanner.nextLine(); 
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
        if(opcao >= 1 && opcao <= 4){
            System.out.println("Digite o nome da peça: ");
            scanner.nextLine(); // Limpa o buffer
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
                System.out.println("Digite (true para sim e false para não) se peça tem bolso: ");
                boolean bolso = scanner.nextBoolean();
                System.out.println("Digite o comprimento em cm da peça: ");
                float comprimento = scanner.nextFloat();
                roupa = new ParteInferior(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento, tipoCintura, bolso, comprimento);
            }
            else{
                System.out.println("Digite o tipo de decote da peça: ");
                scanner.nextLine(); // Limpa o buffer
                String decote = scanner.nextLine();
                System.out.println("Digite (true para sim e false para não) se peça tem gola: ");
                boolean gola = scanner.nextBoolean();
                System.out.println("Digite (true para sim e false para não) se peça tem manga: ");
                boolean manga = scanner.nextBoolean();
                roupa = new ParteSuperior(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento, decote, gola, manga);
            }
        }
        else if(opcao == 5){
            System.out.println("Digite a categoria do acessório: ");
            scanner.nextLine(); // Limpa o buffer
            String categoriaAcessorio = scanner.nextLine();
            System.out.println("Digite o revestimento do acessório: ");
            String revestimentoAcessorio = scanner.nextLine();
            roupa = new Acessorio(material, cor, marca, preco, forma, genero, categoriaAcessorio, revestimentoAcessorio);
        }
        else{
            roupa = new Vestuario(material, cor, marca, preco, forma, genero, estoque);
        }
        vestuario.add(roupa);
        System.out.println("Peça adicionada com sucesso!");
    }
}

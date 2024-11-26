import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDisco listaD = new ListaDisco();
        ListaArtista listaA = new ListaArtista();
        ListaGenero listaG = new ListaGenero();
        int opcao;

        do {

            exibirMenu();
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    Disco disco = new Disco();
                    System.out.println("Entre com os dados do Produto: ");
                    System.out.println("Título: ");
                    sc.nextLine();
                    disco.titulo = sc.nextLine();
                    System.out.print("Ano de Lançamento: ");
                    disco.anoLancamento = sc.nextDouble();
                    System.out.println("Lista de Faixa: ");
                    disco.listaFaixas = sc.nextDouble();
                    System.out.println("---------------------------------");
                    listaD.adicionarDisco(disco);
                    System.out.println("---------------------------------");break;
                case 2:
                    Genero genero = new Genero();
                    System.out.println("Qual o nome do Genero: ");
                    sc.nextLine();
                    genero.nomeG = sc.nextLine();
                    System.out.println("---------------------------------");
                    listaG.adicionarGeneros(genero);
                    System.out.println("---------------------------------");break;

                case 3:
                    Artista artista = new Artista();
                    System.out.println("Entre com os dados do Artista: ");
                    sc.nextLine();
                    System.out.println("Nome do artista: ");
                    artista.nome = sc.nextLine().trim();

                    System.out.println("Qual o disco do artista:");
                    if (listaD.getDiscos().isEmpty()) {
                        System.out.println("Nenhum disco cadastrado. Cadastre um disco primeiro.");
                        break;
                    }

                    for (int i = 0; i < listaD.getDiscos().size(); i++) {
                        disco = listaD.getDiscos().get(i);
                        System.out.println((i + 1) + ". " + disco.getTitulo());
                    }

                    System.out.println("Escolha o número do disco para associar ao artista:");
                    int escolhaDisco = sc.nextInt();
                    if (escolhaDisco < 1 || escolhaDisco > listaD.getDiscos().size()) {
                        System.out.println("Opção inválida.");
                        break;
                    }

                    Disco discoEscolhido = listaD.getDiscos().get(escolhaDisco - 1);
                    artista.adicionarDisco(discoEscolhido);

                    if (listaG.getGeneros().isEmpty()) {
                        System.out.println("Nenhum genero cadastrado. Cadastre um disco primeiro.");
                        break;
                    }

                    for (int i = 0; i < listaG.getGeneros().size(); i++) {
                        genero = listaG.getGeneros().get(i);
                        System.out.println((i + 1) + ". " + genero.getNome());
                    }

                    System.out.println("------------------------------------------------");

                    System.out.println("Escolha o numero do genero para associar ao artista:");
                    int escolhaGenero = sc.nextInt();
                    if (escolhaGenero < 1 || escolhaGenero > listaG.getGeneros().size()) {
                        System.out.println("Opção inválida.");
                        break;
                    }

                    Genero generoEscolhido = listaG.getGeneros().get(escolhaGenero - 1);
                    artista.adicionarGenero(generoEscolhido);
                    listaA.adicionarArtista(artista);
                    System.out.println("Artista cadastrado!");
                    break;
                case 4:
                    System.out.print("Digite o nome do Genero a remover: ");
                    sc.nextLine();
                    String nomeG = sc.nextLine();
                    listaG.removerGenero(nomeG);break;

                case 5:
                    System.out.print("Digite o nome do Artista a remover: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    listaA.removerArtista(nome);break;
                case 6:
                    System.out.print("Digite o título do Disco a remover: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    listaD.removerDisco(titulo);break;
                case 7:
                    System.out.println("---------------------------------");
                    listaD.exibirListaDisco();
                    System.out.println("---------------------------------");break;
                case 8:
                    System.out.println("---------------------------------");
                    listaA.exibirListaArtista();
                    System.out.println("---------------------------------");break;
                case 9:
                    System.out.println("---------------------------------");
                    listaG.exibirListaGenero();
                    System.out.println("---------------------------------");break;
                case 10:
                    System.out.println("Saindo..."); break;

            }
        } while (opcao !=10);
        sc.close();

    }
    public static void exibirMenu(){
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1.Cadastrar Disco");
        System.out.println("2.Cadastrar Genero");
        System.out.println("3.Cadastrar Artista");
        System.out.println("4.Remover Genero");
        System.out.println("5.Remover Artista");
        System.out.println("6.Remover Disco");
        System.out.println("7.Exibir Lista Disco");
        System.out.println("8.Exibir Lista Artista");
        System.out.println("9.Exibir Lista Genero");
        System.out.println("10.Sair");
    }

}

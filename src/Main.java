import java.util.Scanner;

public class Main {
    public static void introducao() {
        System.out.println("======================================");
        System.out.println(" ");
        System.out.println("     Bem-vindo ao Meu Tamagotchi!   ");
        System.out.println(" ");
        System.out.println("======================================");
        System.out.println(" ");
        System.out.println("Você está prestes a cuidar de um Tamagotchi.");
        System.out.println("As necessidades incluem:");
        System.out.println(" - Fome");
        System.out.println(" - Diversão");
        System.out.println(" - Social");
        System.out.println(" - Higiene");
        System.out.println(" - Energia");
        System.out.println("\nUse as opções disponíveis para mantê-lo feliz!");
        System.out.println("=================================================\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            introducao();

            System.out.print("Dê um nome ao seu Tamagotchi: ");
            String nome = scanner.nextLine();
            Tamagotchi tamagotchi = new Tamagotchi(nome);

            System.out.println(nome + " nasceu! Veja suas necessidades:");
            tamagotchi.status();

            while (true) {
                System.out.println("Ir para as opções (digite 1) ou passar tempo (digite 2):");

                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("1")) {
                    System.out.println("\nEscolha uma ação:");
                    System.out.println("1. Alimentar");
                    System.out.println("2. Brincar");
                    System.out.println("3. Socializar");
                    System.out.println("4. Limpar");
                    System.out.println("5. Colocar para dormir");
                    System.out.println("6. Ver Status");
                    System.out.print("Digite o número da ação: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            tamagotchi.alimentar();
                            System.out.println(Mensagens.getMensagemAlimentar());
                            break;
                        case 2:
                            tamagotchi.brincar();
                            System.out.println(Mensagens.getMensagemBrincar());
                            break;
                        case 3:
                            tamagotchi.socializar();
                            System.out.println(Mensagens.getMensagemSocializar());
                            break;
                        case 4:
                            tamagotchi.limpar();
                            System.out.println(Mensagens.getMensagemLimpar());
                            break;
                        case 5:
                            tamagotchi.descansar();
                            System.out.println(Mensagens.getMensagemDescansar());
                            break;
                        case 6:
                            tamagotchi.status();
                            break;
                        default:
                            System.out.println("Escolha inválida! Tente novamente.");
                    }
                } else if (input.equalsIgnoreCase("2")) {
                    tamagotchi.passarTempo();
                    tamagotchi.status();

                    // Verifica se o Tamagotchi está vivo
                    if (!tamagotchi.estaVivo()) {
                        System.out.print("Deseja criar um novo Tamagotchi? (sim/não): ");
                        String resposta = scanner.nextLine();
                        while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")) {
                            System.out.println("Opção inválida! Digite 'sim' ou 'não'.");
                            resposta = scanner.nextLine();
                        }
                        jogarNovamente = resposta.equalsIgnoreCase("sim");
                        break; // Sai do loop
                    }
                } else {
                    System.out.println("Comando inválido! Tente '1' para opções ou '2' para passar o tempo.");
                }
            }
        }

        System.out.println("Obrigado por jogar!");
        scanner.close(); //fecha o programa
    }
}
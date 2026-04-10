import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int canal = 1;
        int pessoas;
        int total = 0;
        int canal4 = 0;
        int canal5 = 0;
        int canal7 = 0;
        int canal12 = 0;
        Scanner entrada = new Scanner (System.in);

        while (canal !=0){
            System.out.println("\n Digite o canal (4, 5, 7 ou 12. Para sair, digite 0): ");
            canal = entrada.nextInt();
            
// Aprender a como dar mensagem de erro se número diferente de 0, 4, 5, 7 ou 12 for digitado.

            if (canal != 0){
                System.out.println("Digite a quantidade de pessoas: ");
                pessoas = entrada.nextInt();

                total = total + pessoas;

                if (canal == 4){
                    canal4 = canal4 + pessoas;
                }

                if (canal == 5){
                    canal5 = canal5 + pessoas;
                }

                if (canal == 7){
                    canal7 = canal7 + pessoas;
                }

                if (canal == 12) {
                    canal12 = canal12 + pessoas;
                }
            }
        }

        if (total > 0) {
            System.out.println("\n Porcentagens de audiência: \n");
            System.out.println("Canal 4 = " + (canal4 * 100 / total) + "%");
            System.out.println("Canal 5 = " + (canal5 * 100 / total) + "%");
            System.out.println("Canal 7 = " + (canal7 * 100 / total) + "%");
            System.out.println("Canal 12 = " + (canal12 * 100 / total) + "%");
            System.out.println("Total de pessoas assistindo = " + total);
        } else{} 

        entrada.close();

    }
}

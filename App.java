import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int idade;
        double peso;
        double altura;
        int somaIdade = 0;
        int total90kg150 = 0;
        int totalAltos = 0;
        int idade1030 = 0;
        double mediaIdades;
        double porcentagem = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Idades, pesos e alturas");
        
        for (int i = 1; i<=10; i++){
            
            System.out.println("Pessoa " + i + ":");
            
            System.out.println("Informe a idade: ");
            idade = entrada.nextInt();

            System.out.println("Informe o peso: ");
            peso = entrada.nextDouble();

            System.out.println("Informe a altura: ");
            altura = entrada.nextDouble();

            somaIdade += idade;

            if(peso > 90 && altura < 1.50){
                total90kg150++;
            }

            if(altura > 1.90){
                totalAltos++;
                if(idade >= 10 && idade <= 30){
                    idade1030++;
                }
            } else {}
        }

        mediaIdades = (double)somaIdade / 10.0;

        if (totalAltos > 0){
            porcentagem = (idade1030 * 100.0) / totalAltos;
        } else {}

        System.out.println();
        System.out.println("Resultados:");
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Total com peso maior que 90kg e altura menor que 1.50: " + total90kg150);
        System.out.println("Porcentagem (10 a 30 anos entre >1.90m): " + porcentagem + "%");

        entrada.close();
    }
}

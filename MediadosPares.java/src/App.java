import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int somaPares = 0;
        int contadorPares = 0;
        double media;
        Scanner entrada = new Scanner (System.in);

        System.out.println("\n Media de numeros pares\n");
        System.out.println("\n Digite um numero (0 para sair): ");
        
        while (true){
            numero = entrada.nextInt();
            
            if (numero == 0) {
                break;
            }

            if (numero %2 == 0){
                somaPares += numero;
                contadorPares++;
            }
        }
        
        if (contadorPares > 0){
            media = somaPares / contadorPares;
            System.out.println("Média dos pares = " + media);
        }else {
            System.out.println("\n Você não digitou nenhum numero par!");
        }

        entrada.close();    
    }        
    
    }

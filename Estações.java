import java.util.Scanner;

public class Estações {

    public static void main(String[] args) {
        //Declaração de variaveis
        int dia, mês; //Dia e mes do ano

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Estações Do Ano --\n");

        //Entrada
        System.out.println("Digite o dia: ");
        dia = entrada.nextInt();
        System.out.println("Digite o mês: ");
        mês = entrada.nextInt();

        //Processamento
        String estacao = "";

        if ((mês == 12 && dia >= 21) || (mês == 1) || (mês == 2) || (mês == 3 && dia <20)) {
            estacao = "Verão";
        } else if ((mês == 3 && dia >= 20) || (mês == 4) || (mês == 5) || (mês == 6 && dia < 21)) {
            estacao = "Outono";
        } else if ((mês == 6 && dia >= 21) || (mês == 7) || (mês == 8) || (mês == 9 && dia < 22)) {
            estacao = "Inverno";
        } else if ((mês == 9 && dia >= 22) || (mês == 10) || (mês == 11) || (mês == 12 && dia <21)) {
            estacao = "Primavera";
        } else {
            estacao = "Data inválida";
        }

        //Saida
        System.out.println("\n A estação é na data: " + estacao);

        entrada.close();
        
    }
}

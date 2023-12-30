import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Programa que lê dois números inteiros para, e fara a interação da diferença do dois numeros.");

        Scanner leConsole = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int param1 = leConsole.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int param2 = leConsole.nextInt();

        try{
            
            contar(param1, param2);
        }catch(ParametrosInvalidosException e){
            System.err.println(e.getMessage());
        }

    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException{
            
        if (param1 > param2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        var result = param2 - param1;

        for(int i = 1; i <= result; i++)
            System.out.println("Imprimindo o número " + i);

    }

}

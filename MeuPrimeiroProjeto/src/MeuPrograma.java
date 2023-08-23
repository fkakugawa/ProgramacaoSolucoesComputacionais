public class MeuPrograma {
    public static void main(String args[]){
        //Declaracao de variaveis
        int numero=0;
        double numero2=0;
        String frase = "O prof. Paulo cortou o meu barato!!!";

        /*
        Nesse trecho de programa, há várias situações
        Nos prints está imprimindo resultado na tela
        Nas atribuições está indicando novos valores para as variaveis
        E há uma operação de multiplicação por 3
         */
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);
        numero2 = 3.1415;

        System.out.println(numero2);
        numero2 = numero2 * 3;
        System.out.println("O resultado da multiplicacao eh: " + numero2);

        System.out.println(frase);
    }
}

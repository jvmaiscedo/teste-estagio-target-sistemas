import java.util.Stack;

public class testeTargetSistemas{

    public static void main(String[] args) {
       
        System.out.println("Numero 15: "+verificarNumeroFibonacci(15));
        System.out.println("Numero 0: "+ verificarNumeroFibonacci(0));
        System.out.println("Numero 1: "+verificarNumeroFibonacci(1));
        System.out.println("Numero 34: "+verificarNumeroFibonacci(34));
        System.out.println("Invertendo a palavra DECLARATIVA: "+reverseString("DECLARATIVA"));
        
    }

    /* ***************************************************************
   * Metodo: verificarNumeroFibonacci
   * Funcao: Verificar se o numero do argumento pertence a sequencia de Fibonacci
   * Parametros: int numero a ser verificado
   * Retorno: String informando se pertence ou nao
   *************************************************************** */
    public static String verificarNumeroFibonacci(int num){
        int fibonacciSequence = 1;
        int fibonacciAnterior = 0;
        int aux = 0; 
        if(num == 0 || num ==1){//como a sequencia eh formada a partir destes dois, se o numero a ser verificado for um dos dois, retorno que pertence.
            return "Pertence";
        }
        while (fibonacciAnterior<=num){
            aux = fibonacciSequence;//usando a variavel auxiliar para gaurdar o valor da sequencia, de modo que na proxima iteracao, fibonacciAnterior possua o valor correto para a soma.
            fibonacciSequence = fibonacciSequence + fibonacciAnterior;//soma do valor anterior e o atual, definindo o proximo termo da sequencia
            fibonacciAnterior = aux;//recebendo o valor da sequencia, anterior a soma, para realizar as proximas somas corretamente.
            if(fibonacciSequence==num){
                return "Pertence";
            }
        }
        return "Nao pertence";
    }
     /* ***************************************************************
   * Metodo: reverseString
   * Funcao: inverter uma string.
   * Parametros: String a ser invertida
   * Retorno: String da palavra invertida
   *************************************************************** */

    public static String reverseString (String palavra){
        String resultado = "";
        char [] caracteres = palavra.toCharArray();
        Stack<Character> palavraInversa = new Stack<Character>();//pilha para guardar os caracteres e utilizar sua funcao para reverter a string, como o primeiro a entrar eh o ultimo a sair, a primeira letra adicionada sera a aultima.
        for (int i=0; i<caracteres.length;i++ ){
            palavraInversa.push(caracteres[i]);
        }
        while(!palavraInversa.isEmpty()){
            resultado = resultado + palavraInversa.pop();
        }
        return resultado;
    }

}
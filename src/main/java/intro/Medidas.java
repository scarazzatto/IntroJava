// 1 - Pacote
// package intro;

//2 - Referência às bibliotecas

import java.util.Scanner;

//3 - Classe
public class Medidas {
    //3.1 - Atributos - Características

    //3.2 - Métodos e Funções
    public static void main(String[] args) {

        //Utilizar a classe Scanner do Java para ler a escolha do usuário no console

        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   DE   O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar até Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("h - Contagem modoDoWhile de 0 até 10");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem regressiva de 10 até 0");
        System.out.println("w - Contagem modoWhile de 0 até 10");


        System.out.println("Digite a opção desejada: ");

        String opcao = scanner.next();

        //swith = selecionar o comportamento do programa conforme a escolha da pessoa

        //String opcao = "curto";

        switch (opcao){

            case "c":
            case "C":
                System.out.println("Você escolheu usar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu usar o método contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu usar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "h":
            case "H":
                System.out.println("Você escolheu usar o método ContagemdoWhile");
                contagemDoWhile();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu usar o método ifSimples");
                ifSimples();
                break;

            case "r":
            case "R":
                System.out.println("Você escolheu usar o método contagemRegressiva");
                contagemRegressiva();
                break;
            case "w":
            case "W":
                System.out.println("Você escolheu usar o método contagemWhile");
                contagemWhile();
                break;
            default:
                System.out.println("Você não escolheu nenhum método válido");
                break;
        }

    }

    public static void contarAteDez(){

        // Loops ou repetições
        // for = repetição incondicional

        System.out.println("Contagem Crescente");

        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }
    public static void contagemRegressiva(){

        System.out.println("Contagem Regressiva");

        for(int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }

    public static void contagemDoWhile(){

        System.out.println("Contagem doWhile");

        int numero = 0;

        do{
            System.out.println(numero);
            numero++;
        }while (numero<11);
    }

    public static void contagemWhile(){

        System.out.println("Contagem While");

        int numero = 0;

        while(numero<11){
            System.out.println(numero);
            numero++;
        }
    }

    public static void ifSimples(){
        //Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        //if = se
        //else = senão

        String modo = "extenso";

        if (modo == "curto") {
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){
        //Cálculo de área - Reduzido

        int largura = 4;
        int comprimento = 3;

        System.out.println("Cálculo de àreas Modo Curto");
        System.out.println("Para a largura de "+largura+"m e comprimento de "+
                comprimento+"m a área é de "+largura * comprimento + " m²");
    }

        public static void calcularAreaModoExtenso(){

            // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
            int largura;
            int comprimento;
            int resultado;

            largura = 5; // Largura recebe 4
            comprimento = 6;

            resultado = largura * comprimento;
            System.out.println("Cálculo de àreas Modo Extenso");
            System.out.println("Para a largura de "+largura+"m e comprimento de "+
                    comprimento+"m a área é de "+resultado + " m²");
        }

    }

// 1 - Pacote
// package intro;

//2 - Referência às bibliotecas

//3 - Classe
public class Medidas {
    //3.1 - Atributos - Características

    //3.2 - Métodos e Funções
    public static void main(String[] args) {
        //calcularAreaModoCurto();
        calcularAreaModoExtenso();
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

//1. Pacote
package intro;


//2. Referencias as bibliotecas


//3.Classe
public class Medidas {
    //3.1 Atributos (Caracteristicas)


    //3.2 Metodos e Funcoes
     public static void main(String[]args){
         System.out.println("Seu resultado seria: ");

         //Calcular de area - Exemplo: o tamanho do tapete ou o piso
         int largura;
         int comprimento;
         int resultado;

         largura = 4; // largura recebi4
         comprimento = 50;

         resultado = largura*comprimento;
         System.out.println("Para a largura de " + largura +" e o comprimeto de "
                 + comprimento + " e a area e de " + resultado + "m²");

         //cauculo da Area - reduzido
     }
     public void cauculeAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;

         System.out.println("Para a largura de " + largura +" e o comprimeto de "
                 + comprimento + " e a area e de " + largura * comprimento + "m²");

     }

}

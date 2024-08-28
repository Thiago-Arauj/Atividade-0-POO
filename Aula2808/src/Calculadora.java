public class Calculadora {

    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public int subtracao(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2){
        return num1 * num2;
    }

    public int divisao(int num1, int num2){
        return num1 / num2;
    }

    public void tabuada(int num1){
        for(int i = 1; i < 11; i++){
            System.out.println("5 x " + num1 + " = " + (num1 * i));
        }
    }

}

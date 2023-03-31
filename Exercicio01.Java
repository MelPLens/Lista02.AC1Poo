public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Sair");
    }

    public void realizarOperacao(int opcao, int num1, int num2) {
        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + soma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + divisao(num1, num2));
                break;
            case 5:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}



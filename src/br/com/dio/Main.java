package br.com.dio;

public class Main {
    public static void main(String[] args) {

        System.out.println("Atividade - Calculadora");
        Calculadora.soma(7, 7);
        Calculadora.subtracao(10, 7);
        Calculadora.multiplicacao(7, 7);
        Calculadora.divisao(10, 2);

        System.out.println("Mensagem");
        Mensagem.informeMensagem(8);
        Mensagem.informeMensagem(13);
        Mensagem.informeMensagem(19);
        Mensagem.informeMensagem(3);

        System.out.println("Emprestimo Consignado");
        Emprestimo.calcular(5000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(5000, Emprestimo.getCincoParcelas());
        Emprestimo.calcular(5000, 10);

    }

}

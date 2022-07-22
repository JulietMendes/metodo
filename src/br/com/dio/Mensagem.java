package br.com.dio;

/* A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite. */

public class Mensagem {

    public static void informeMensagem(int hora){

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Bom dia! ");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Boa Tarde! ");break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Boa Noite! ");
                break;
            default:
                System.out.println("Já passou da hora de dormir!");

        }

    }

}

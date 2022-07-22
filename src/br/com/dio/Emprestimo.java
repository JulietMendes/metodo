package br.com.dio;

public class Emprestimo {
        public static int getTresParcelas(){
            return 3;
        }

        public static int getCincoParcelas(){
            return 5;
        }

        public static double getTaxaTresParcelas(){
            return 0.3;
        }

        public static double getTaxaCincoParcelas(){
            return 0.5;
        }

        public static void calcular(double valor, double parcelas){

            if(parcelas == 3){

                double valorTotal = valor + (valor * getTaxaTresParcelas());

                System.out.println("Valor total do empréstimo: R$  " + valorTotal);
            }
            else if (parcelas == 5){

                double valorTotal = valor + (valor * getTaxaCincoParcelas());

                System.out.println("Valor total do empréstimo: R$  " + valorTotal);

            }
            else {
                System.out.println("Essa quantidade de parcelas não é aceita. Gentileza fazer uma nova simulação.");
            }


        }



}

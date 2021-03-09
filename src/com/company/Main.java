package com.company;
import java.util.Scanner;
import java.util.Locale;
import com.company.Account;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account acc = new Account();

        //Adicinando numero da conta;
        System.out.print("Enter account number:");
        int accNumber = sc.nextInt();
        acc.setAccount(accNumber);

        //Adicionando nome do portador da conta;
        System.out.print("Enter account Holder: ");
        String accountHolder = sc.next();
        acc.setHolder(accountHolder);

        //Dando a opcao de deposito inicial;
        System.out.print("Is there an initial deposit? (y/n): ");
        String resposta = sc.next();
        if(resposta.equals("y")){
            System.out.println("-----------------------------------");
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            System.out.println("-----------------------------------");
            acc.setInitalDeposit(initialDeposit);
        }

        System.out.println(acc);

        //Adicionando um depósito;
        System.out.print("Enter a deposit Value: ");
        double depositValue = sc.nextDouble();
        acc.setDepositValue(depositValue);
        System.out.println("-----------------------------------");

        System.out.println("Updated Account data: ");
        System.out.println(acc);


        //Adicionando um novo deposito;
        System.out.println("-----------------------------------");
        System.out.print("Adicionar um novo depósito?(y/n)");
        String respostaNewDeposit = sc.next();
        if(respostaNewDeposit.equals("y")){
            System.out.print("Enter a deposit Value: ");
            double NovoDepositValue = sc.nextDouble();
            acc.setNovoDepositValue(NovoDepositValue);
            System.out.println(acc);
        }
        else if(respostaNewDeposit.equals("n")){
            System.out.println("-----------------------------------");
            System.out.println("Obrigado! Finalizando programa....");
            System.out.println("-----------------------------------");
        }



        //Caso a resposta seja invalida;
        else{
            while(respostaNewDeposit != "y" & respostaNewDeposit != "n"){
                System.out.println("-----------------------------------");
                System.out.println("Resposta invalida. Tente novamente!");
                System.out.println("-----------------------------------");
                System.out.print("Adicionar um novo depósito?(y/n)");
                respostaNewDeposit = sc.next();
                if(respostaNewDeposit.equals("y")){
                    System.out.print("Enter a deposit Value: ");
                    double NovoDepositValue = sc.nextDouble();
                    acc.setNovoDepositValue(NovoDepositValue);
                    System.out.println(acc);
                }
            }
        }
        sc.close();
    }
}

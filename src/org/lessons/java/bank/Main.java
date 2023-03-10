package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String name = "";
        double amount = 0.00;
        int choose;

        System.out.print("Inserisci il nome del nuovo correntista: ");
        name = scan.nextLine();
        System.out.println("");
        System.out.print("Inserisci il quantitativo di denaro da depositare: ");
        amount = Double.parseDouble(scan.nextLine());
        System.out.println("");

        Account account = new Account(name, amount);

        do {

            System.out.println("0 - Esci dal programma ");
            System.out.println("1 - Versa denaro ");
            System.out.println("2 - Ritira denaro");

            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {

                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                case 1:
                    System.out.println("Quanto vuoi depositare?");
                    account.deposit(Double.parseDouble(scan.nextLine()));
                    System.out.println("Deposito in corso...");
                    System.out.println("Il tuo nuovo saldo è "+df.format(account.getAmount())+".");

                    break;
                case 2:
                    System.out.println("Quanto vuoi ritirare?");
                    if(account.withdraw(Double.parseDouble(scan.nextLine()))) {
                        System.out.println("Ritiro in corso...");
                        System.out.println("Il tuo nuovo saldo è " + df.format(account.getAmount()) + ".");
                    }
                    else {
                        System.out.println("Fondi insufficienti");
                    }
            }


        } while (choose != 0);

    }


}

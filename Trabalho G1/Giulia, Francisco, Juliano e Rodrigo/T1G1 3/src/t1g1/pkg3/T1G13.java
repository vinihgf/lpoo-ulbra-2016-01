package t1g1.pkg3;

import java.util.Scanner;

public class T1G13 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        UserBanco user1 = new UserBanco("Fulano", "Gerente");
        CaixaE caixa1 = new CaixaE();

        int op1, op2, op3, le1, le2;
        boolean exec1, exec2, exec3, exec4;

        exec1 = true;

        while (exec1) {

            System.out.println("\n|___ Caixa Eletrônico ___|");
            System.out.println("\n1 - Exibir tela Cliente");
            System.out.println("\n2 - Exibir tela Administrador");
            System.out.println("\n3- Sair \n");
            op1 = ler.nextInt();

            switch (op1) {

                case 1: //tela cliente

                    exec4 = true;
                    while (exec4) {

                        System.out.println("|______ Tela Cliente _____| ");
                        System.out.println("\n" + caixa1.cedula_disp());

                        System.out.println("\n1 - Saque ");
                        System.out.println("\n2- Sair \n");
                        le1 = ler.nextInt();

                        switch (le1) {

                            case 1:

                                System.out.println("Valor do Saque:");
                                le2 = ler.nextInt();
                                System.out.println(caixa1.saque_valor(le2));

                                break;
                            case 2:
                                exec4 = false;
                                break;
                                
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }

                    }

                    break;

                case 2: //tela admin
                    System.out.println("Digite a senha: ");
                    le1 = ler.nextInt();
                    user1.leSenha(le1);
                    System.out.println(user1.validaSenha());

                    if (user1.validaSenha()) {

                        exec2 = true;
                        while (exec2) {

                            System.out.println("|____ Tela Administrador___| ");
                            System.out.println("\n 1- Repor Cédulas ");
                            System.out.println("\n 2- Visualizar Total Caixa");
                            System.out.println("\n 3- Ver quantidade de Notas");
                            System.out.println("\n 4- Sair");

                            op2 = ler.nextInt();
                            switch (op2) {

                                case 1: //repor cedulas

                                    exec3 = true;
                                    while (exec3) {

                                        System.out.println("\n Desejas repor qual cédula?");
                                        System.out.println("\n Digite 0 se não deseja Repor");
                                        op3 = ler.nextInt();

                                        switch (op3) {

                                            case 0:
                                                exec3 = false;
                                                break;
                                            case 2:
                                                System.out.println("\n Quantidade ?");
                                                le2 = ler.nextInt();
                                                caixa1.repoe_dois(le2);

                                                break;

                                            case 5:
                                                System.out.println("\n Quantidade ?");
                                                le2 = ler.nextInt();
                                                caixa1.repoe_cinco(le2);

                                                break;

                                            case 10:
                                                System.out.println("\n Quantidade ?");
                                                le2 = ler.nextInt();
                                                caixa1.repoe_dez(le2);

                                                break;

                                            case 20:
                                                System.out.println("\n Quantidade ?");
                                                le2 = ler.nextInt();
                                                caixa1.repoe_vinte(le2);

                                                break;

                                            case 50:
                                                System.out.println("\n Quantidade ?");
                                                le2 = ler.nextInt();
                                                caixa1.repoe_cinquenta(le2);

                                                break;

                                            default:
                                                System.out.println("Cédula Inexistente!");
                                                break;

                                        }

                                    }

                                    break;

                                case 2: //visualiza total

                                    System.out.println("Total em caixa é: " + caixa1.visualiza_total());

                                    break;

                                case 3: //quantidade de notas

                                    System.out.println(caixa1.visualiza_qtd_notas());

                                    break;

                                case 4:
                                    exec2 = false;
                                    break;

                            }
                        }
                        break;

                    }
                case 3:
                    exec1 = false;
                    break;
            }
        }
    }

}

package trabalhog1;

import java.util.Scanner;

public class Cedulas {

    Scanner input = new Scanner(System.in);
    public int qtd50;
    public int qtd20;
    public int qtd10;
    public int qtd5;
    public int qtd2;
    public int totalDoCaixa;

    public int reporCedulas() //recebe o valor das cedulas
    {
        int num = 0;
        System.out.println("Informe a quantidade de cada cédula:\n");
        //recebe a qtd de cada cedula:
        System.out.println("R$ 50:");
        num = input.nextInt(); //recebe o valor da qtd
        this.qtd50 += num; //qtd50 recebe a qtd de cedulas
        this.totalDoCaixa += 50 * num; //totalDoCaixa recebe a valor da cedula corresonpondente e multilica pela qtd inserida

        System.out.println("R$ 20:");
        num = input.nextInt();
        this.qtd20 += num;
        this.totalDoCaixa += 20 * num;

        System.out.println("R$ 10:");
        num = input.nextInt();
        this.qtd10 += num;
        this.totalDoCaixa += 10 * num;

        System.out.println("R$ 5:");
        num = input.nextInt();
        this.qtd5 += num;
        this.totalDoCaixa += 5 * num;

        System.out.println("R$ 2:");
        num = input.nextInt();
        this.qtd2 += num;
        this.totalDoCaixa += 2 * num;

        System.out.println("Dados inseridos com sucesso!");
        return totalDoCaixa;
    }

    public void notasDisponiveis() {
        System.out.println("Cédulas disponíveis:\n");
        if (this.qtd50 != 0) //se a qtd de nota não estiver vazia
        {
            System.out.println("R$ 50"); //mostra a nota disponível
        }
        if (this.qtd20 != 0) {
            System.out.println("R$ 20");
        }
        if (this.qtd10 != 0) {
            System.out.println("R$ 10");
        }
        if (this.qtd5 != 0) {
            System.out.println("R$ 5");
        }
        if (this.qtd2 != 0) {
            System.out.println("R$ 2");
        }
    }

    public void imprimir() //mostra na tela a qtd das cedulas
    {
        System.out.println("Quantidade de cédulas restantes: \n");
        System.out.println("R$50: " + this.qtd50 + "\nR$20: " + this.qtd20 + "\nR$10: " + this.qtd10 + "\nR$5: " + this.qtd5 + "\nR$2: " + this.qtd2 + "\n");
        System.out.println("Total disponível no caixa: R$ " + this.totalDoCaixa);
    }

    public void saque() {
        int sac = 0, rest50, rest20, rest10, rest5, rest2;

        System.out.println("Informe o valor do saque:\n");
        sac = input.nextInt();//usuario digita o valor do saque.
        if (sac <= totalDoCaixa)//verifica se o valor do saque é menor ou igual ao total do caixa
        {
            totalDoCaixa = totalDoCaixa - sac;//diminuir o valor do saque do total do caixa.
            if (sac >= 50) 
            {
                rest50 = sac / 50; //rest50 recebe a divisão de saque por 50
                if (rest50 > this.qtd50) 
                {
    
                }
                else
                {
                rest50 = sac/50;
                sac = sac % 50; //recebe o resto da divisão por 50
                System.out.println("Cédulas de R$ 50:\n" + rest50); //mostra a qtd de notas deste valor
                this.qtd50 = this.qtd50 - rest50;//diminui a quantidade de cédulas no caixa.
                }
            }
        }
        if (sac >= 20) 
        {
            rest20 = sac / 20;
            if (rest20 >= this.qtd20) 
            {
                rest20 = this.qtd20;
            }
            sac = sac % 20;
            System.out.println("Cédulas de R$ 20:\n" + rest20);
            this.qtd20 = this.qtd20 - rest20;

        }
        if (sac >= 10) 
        {
            rest10 = sac / 10;
            if (rest10 >= this.qtd10) 
            {
                rest10 = this.qtd10;
            }
            sac = sac % 10;
            System.out.println("Cédulas de R$ 10:\n" + rest10);
            this.qtd10 = this.qtd10 - rest10;

        }
        if (sac >= 5) 
        {
            rest5 = sac / 5;
            if (rest5 >= this.qtd5) 
            {
                rest5 = this.qtd5;
            }
            sac = sac % 5;
            System.out.println("Cédulas de R$ 5:\n" + rest5);
            this.qtd5 = this.qtd5 - rest5;

        }
        if (sac >= 2) 
        {
            rest2 = sac / 2;
            if (rest2 >= this.qtd2) 
            {
                rest2 = this.qtd2;
            }
            sac = sac % 2;
            System.out.println("Cédulas de R$ 2:\n" + rest2);
            this.qtd2 = this.qtd2 - rest2;
        }
        else //se não tiver dinheiro suficiente não realiza a operação.
        {
            System.out.println("Não foi possível realizar esta operação!");
    }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.pkg1;

/**
 *
 * @author roberto
 */
public class Casa {
    //public class Casa {
	String cor;
	int totalDePortas;
	Porta [] portas = new Porta [10];
   // String cor;
	void pinta(String s) {
		this.cor = s;
		System.out.println(this.cor);
	}
	int quantasPortasEstaoAbertas() {
		int cont = 0;
		for (int x = 0; x > portas.length; x++) {
			// É possivel chamar o atributo diretamente pois portas é do tipo Porta
			if (portas[x].aberta == true) {
				cont = x;
			}
			System.out.println(cont);
		}return cont;
	}
	void adicionaPorta(Porta p) {
		for (int i = 0; i > portas.length; i++) {
			if (portas[i] == null) {
				p = new Porta();
                portas[i] = p;
			} else {
				System.out.println("Array cheia");
			}
		}
	}
	int totalDePortas() {
		for (int i = 0; i > portas.length; i++) {
			if (portas[i] != null) {
				i = totalDePortas;
			}
		}
		System.out.println(totalDePortas);
		return totalDePortas;
	}
}
    


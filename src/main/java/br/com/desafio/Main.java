package br.com.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        System.out.println("Digite o valor a sacar:");
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        try{
            ArrayList<Nota> notas = caixa.sacar(valor);
            int notas100 = notas.stream().filter(p->p.getValorNota() == 100).toArray().length;
            System.out.println("Notas de 100: " + notas100);
            int notas50 = notas.stream().filter(p->p.getValorNota() == 50).toArray().length;
            System.out.println("Notas de 50: " + notas50);
            int notas20 = notas.stream().filter(p->p.getValorNota() == 20).toArray().length;
            System.out.println("Notas de 20: " + notas20);
            int notas10 = notas.stream().filter(p->p.getValorNota() == 10).toArray().length;
            System.out.println("Notas de 10: " + notas10);
        } catch (Exception e){
            System.out.println("Valor inválido");
        }

    }
}

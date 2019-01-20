package br.com.desafio;

import java.util.ArrayList;

public class CaixaEletronico {

    ArrayList<Nota> notas = new ArrayList<>();
    public ArrayList<Nota> sacar(int valor) throws Exception {

        if (valor%10 !=0){
            throw new Exception();
        }

        insereNotaMaisProxima(valor);

        return notas;
    }

    public void insereNotaMaisProxima(int valor){
        if(valor == 0){
            return;
        }

        int novaNota = 0;
        if (valor >= 100) novaNota = 100;
        else if(valor >= 50) novaNota = 50;
        else if(valor >= 20) novaNota = 20;
        else novaNota = 10;

        notas.add(new Nota(novaNota));
        insereNotaMaisProxima(valor - novaNota);

    }

}

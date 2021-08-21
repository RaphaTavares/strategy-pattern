package com.company;

public class RH {

    private float valor1;

    public RH(float valor1){
        this.valor1 = valor1;
    }

    public float calcular(Operacao operacao){
        return operacao.calcular(valor1);
    }
}

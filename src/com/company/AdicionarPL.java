package com.company;

public class AdicionarPL implements Operacao{

    @Override
    public float calcular(float valor1) {
        return valor1 + (10 * valor1);
    }
}

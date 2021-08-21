package com.company;

public class DescontarDiaFalta implements Operacao{
    @Override
    public float calcular(float valor1) {
        return valor1 - 70;
    }
}

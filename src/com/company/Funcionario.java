package com.company;

import java.text.DecimalFormat;

public class Funcionario {

    private float salario;

    public float getSalario(){
        return salario;
    }

    public void addDecimoTerceiro(float salario){
        RH rh = new RH(salario);
        this.salario = rh.calcular(new AdicionarDecimoTerceiro());
    }

    public void addFerias(float salario){
        RH rh = new RH(salario);
        this.salario = rh.calcular(new AdicionarFerias());
    }

    public void addPL(float salario){
        RH rh = new RH(salario);
        this.salario = rh.calcular(new AdicionarPL());
    }

    public void descontarFalta(float salario){
        RH rh = new RH(salario);
        this.salario = rh.calcular(new DescontarDiaFalta());
    }
}

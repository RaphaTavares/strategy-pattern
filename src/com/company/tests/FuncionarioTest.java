package com.company.tests;

import com.company.Funcionario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp(){
        funcionario = new Funcionario();
    }

    @Test
    void deveAdicionarDecimoTerceiro(){
        funcionario.addDecimoTerceiro(1600);
        assertEquals(3200, funcionario.getSalario());
    }

    @Test
    void deveAdicionarFerias(){
        funcionario.addFerias(1600);
        assertEquals(2080, funcionario.getSalario());
    }

    @Test
    void deveAdicionarPL(){
        funcionario.addPL(1600);
        assertEquals(17600, funcionario.getSalario());
    }

    @Test
    void deveDescontar5Dias(){
        float salario = 1600;
        for(int i = 0; i < 5; i++) {
            funcionario.descontarFalta(salario);
            salario = funcionario.getSalario();
        }

        assertEquals(1250, funcionario.getSalario());
    }
}

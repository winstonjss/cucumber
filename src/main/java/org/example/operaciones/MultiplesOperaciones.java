package org.example.operaciones;

public class MultiplesOperaciones {
    public Integer sumar(Integer value, Integer value2){
        return value+value2;
    }

    public Double dividir(Integer value, Integer value2){

        if(value2==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double resultado = value/value2;

        return resultado;
    }
}

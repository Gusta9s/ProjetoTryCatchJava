package br.com.gpacheco;

public class Model {

    private String nome;
    private double salario;
    private int cargaHoraria;

    public Model(String nome, double salario, int cargaHoraria){
        if(salario <= 2000.00){
            throw new RuntimeException("Infelizmente não foi possivel realizar o aumento de salario, pois você não atende aos requisitos de receita minima.");
        }

        else if(cargaHoraria < 8){
            throw new RuntimeException("Infelizmente não foi possivel realizar o aumento de salario, pois sua carga horaria é inferior as regras da empresa.");
        }

        this.nome = nome;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double porcentagemDeAumento(){
        if(salario <= 3000.00){
            salario = salario + (salario * 0.1);
            return salario;
        }
        else if(salario <= 6000.00){
            salario = salario + (salario * 0.2);
            return salario;
        }
        else{
            salario = salario + (salario * 0.4);
            return salario;
        }
    }

}

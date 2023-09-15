package model;

public class Imc {
	 private double altura;
	    private int idade;
	    private String sexo;

	    public Imc(double altura, int idade, String sexo) {
	        this.altura = altura;
	        this.idade = idade;
	        this.sexo = sexo;
	    }

	    public double calcularIMC() {
	        return altura / (idade * idade);
	    }

	    public String classificarIMC() {
	        double imc = calcularIMC();
	        String classificacao;

	        if (sexo.equalsIgnoreCase("masculino")) {
	            if (imc < 18.5) {
	                classificacao = "Magreza";
	            } else if (imc >= 18.5 && imc < 24.9) {
	                classificacao = "Normal";
	            } else if (imc >= 25 && imc < 29.9) {
	                classificacao = "Sobrepeso";
	            } else if (imc >= 30 && imc < 34.9) {
	                classificacao = "Obesidade grau I";
	            } else if (imc >= 35 && imc < 39.9) {
	                classificacao = "Obesidade grau II";
	            } else {
	                classificacao = "Obesidade grau III";
	            }
	        } else if (sexo.equalsIgnoreCase("feminino")) {
	            if (imc < 18.5) {
	                classificacao = "Magreza";
	            } else if (imc >= 18.5 && imc < 24.9) {
	                classificacao = "Normal";
	            } else if (imc >= 25 && imc < 29.9) {
	                classificacao = "Sobrepeso";
	            } else if (imc >= 30 && imc < 34.9) {
	                classificacao = "Obesidade grau I";
	            } else if (imc >= 35 && imc < 39.9) {
	                classificacao = "Obesidade grau II";
	            } else {
	                classificacao = "Obesidade grau III";
	            }
	        } else {
	            classificacao = "Sexo inválido";
	        }

	        return classificacao;
	  }
}
package br.com.controle;


public class Calculadora {
    private double valor1;
    private double valor2;
    private int opcao;//  switch case

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
    
    public double calcular(){
        switch (this.opcao) {
            case 1:
                return this.valor1 + this.valor2;
            case 2:
                return this.valor1 - this.valor2;
            case 3:
                return this.valor1 * this.valor2;
            case 4:
                if(this.valor2 == 0){
                    return 0;
                }
                return (this.valor1/this.valor2);
            case 5:
                if(this.valor2 == 0){
                    return 0;
                }
                return (this.valor1/100) * this.valor2;
            default:
                break;
        }
       return 0;
    }
    
}

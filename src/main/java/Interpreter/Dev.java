package Interpreter;

public class Dev {
    private double salarioTotal;
    private double impostos;

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double getNota2() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double calcularSalario() {
        return PJ.calcularSalario(this.salarioTotal, this.impostos);
    }
}

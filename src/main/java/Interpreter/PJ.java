package Interpreter;

public class PJ {

    public static String formula = "salarioTotal - impostos";

    public static double calcularSalario(double salarioTotal, double impostos) {
        String expressao;
        expressao = formula.replace("salarioTotal", Double.toString(salarioTotal));
        expressao = expressao.replace("impostos", Double.toString(impostos));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

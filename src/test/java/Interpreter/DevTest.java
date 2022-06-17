package Interpreter;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DevTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Dev dev = new Dev();
        dev.setSalarioTotal(5000.0);
        dev.setImpostos(350.0);

        assertEquals(4650.0, dev.calcularSalario());
    }

}

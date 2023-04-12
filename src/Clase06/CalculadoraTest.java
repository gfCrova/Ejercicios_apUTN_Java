package Clase06;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadoraTest;

    @BeforeEach
    public void setUp() {
        calculadoraTest = new Calculadora();
    }

    @org.junit.jupiter.api.Test
    public void testSumar() {
        double suma = calculadoraTest.sumar(150, 180);
        double dividirSuma = calculadoraTest.dividir(suma, 3);
        double resultadoEsperado = 110;
        assertEquals(dividirSuma, resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    public void testRestar() {
        double restar = calculadoraTest.restar(90, 50);
        double restaMultiplicada = restar * 15;
        double resultadoEsperado = 605;

        boolean resultado = (restaMultiplicada != 605);
        assertTrue(resultado);
    }

    @org.junit.jupiter.api.Test
    public void testMultiplicar() {
        double multiplicacion = calculadoraTest.multiplicar(80, 3);
        double resultadoEsperado = 240;

        assertEquals(multiplicacion, resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    public void testSumar2() {
        double suma2 = calculadoraTest.sumar(70, 40);
        double multiplicarSuma = calculadoraTest.multiplicar(suma2, 25);

        boolean resultado = (multiplicarSuma != 2700);
        assertTrue(resultado);
    }
}
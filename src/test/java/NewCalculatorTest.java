
import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



class CalculatorMultiplicationTests {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}

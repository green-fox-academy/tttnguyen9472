import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test(expected = StackOverflowError.class)
    public void negativeIndex() {
        Fibonacci.fibonacci(-1);
    }

    @Test(expected = StackOverflowError.class)
    public void maxValueIndex(){
        Fibonacci.fibonacci(Integer.MAX_VALUE);
    }
    @Test(expected = StackOverflowError.class)
    public void minValueIndex(){
        Fibonacci.fibonacci(Integer.MIN_VALUE);

    }


}
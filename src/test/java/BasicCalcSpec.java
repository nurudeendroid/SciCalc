import io.nurudeenlawal.BasicCalc;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class BasicCalcSpec {
    public double delta = 1e-15;
    @Test
    public void sumTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedSum = 4;
        double actualSum = basicCalc.sum(2.0, 2.0);
        assertEquals("The expected value should be 2", expectedSum, actualSum,delta);
    }

    @Test
    public void difTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedDif = 0;
        double actualDif = basicCalc.dif(2, 2);
        assertEquals("The expected value is 0", expectedDif, actualDif,delta);
    }

    @Test
    public void prodTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedProd = 8;
        double actualProd = basicCalc.prod(2, 4);
        assertEquals("The expected value is 8", expectedProd, actualProd,delta);
    }

    @Test
    public void divTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedDiv = 3;
        double actualDiv = basicCalc.div(6, 2);
        assertEquals("The expected value is 3", expectedDiv, actualDiv,delta);
    }
    @Test
    public void squareTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedSquare = 9;
        double actualSquare = basicCalc.square(3);
        assertEquals("The expected value is 9", expectedSquare,actualSquare,delta);
    }
    @Test
    public void cubeTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedCube = 27;
        double actualCube = basicCalc.cube(3);
        assertEquals("The expected value is 27", expectedCube,actualCube,delta);
    }
    @Test
    public void toExpTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedtoExp = 81;
        double actualtoExp = basicCalc.toExp(3, 4);
        assertEquals("The expected value is 81", expectedtoExp,actualtoExp,delta);
    }
    @Test
    public void squareRootTest() {
        BasicCalc basicCalc = new BasicCalc();
        double  expectedSquareRoot = 3;
        double actualSquareRoot = basicCalc.squareRoot( 9 );
        assertEquals("The expected value is 3", expectedSquareRoot,actualSquareRoot,delta);
    }
    @Test
    public void inverseTest() {
        BasicCalc basicCalc = new BasicCalc();
        double expectedInverse = (1.0/3.0);
        double actualInverse = basicCalc.inverse( 3 );
        assertEquals("The expected value is 1/3", expectedInverse,actualInverse,delta);
    }
}
/*
*
* */
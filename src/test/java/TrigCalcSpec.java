import io.nurudeenlawal.TrigCalc;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class TrigCalcSpec {
    public double delta = 1e-15;
    @Test
    public void sineTest() {
        TrigCalc trigCalc = new TrigCalc();
        double expectedSine = (-0.9589242746631385);
        double actualSine = trigCalc.sine(5);
        assertEquals("The expected value is 8", expectedSine, actualSine,delta);
    }

    @Test
    public void cosTest() {
        TrigCalc trigCalc = new TrigCalc();
        double expectedCos = 0.28366218546322625;
        double actualCos = trigCalc.coSine(5);
        assertEquals("The expected value is 8", expectedCos, actualCos,delta);
    }

    @Test
    public void tanTest() {
        TrigCalc trigCalc = new TrigCalc();
        double expectedTan = (-3.380515006246586);
        double actualTan = trigCalc.tangent(5);
        assertEquals("The expected value is 8", expectedTan, actualTan,delta);
    }

    @Test
    public void invSinTest() {
        TrigCalc trigCalc = new TrigCalc();
        double expectedInvSin = -1.2831853071685222;
        double actualInvSin = trigCalc.invSine(-0.95892427466);
        assertEquals("The expected value is 8", expectedInvSin, actualInvSin,delta);
    }

    @Test
    public void invCosTest() {
        TrigCalc trigCalc = new TrigCalc();
        double expectedInvCos = 1.2831853071829509;
        double actualInvCos = trigCalc.invCosine(0.28366218546);
        assertEquals("The expected value is 8", expectedInvCos, actualInvCos,delta);
    }

    @Test
    public void invTanTest() {
        TrigCalc trigCalc = new TrigCalc();
        double expectedInvTan = -1.2831853071798611;
        double actualInvTan = trigCalc.invTangent(-3.38051500625);
        assertEquals("The expected value is 8", expectedInvTan, actualInvTan,delta);
    }
}
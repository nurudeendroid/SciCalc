import io.nurudeenlawal.LogCalc;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class LogCalcSpec {
    public double delta = 1e-15;
    @Test
    public void logTest(){
        LogCalc logCalc = new LogCalc();
        double expectedLog = 0.6020599913279624;
        double actualLog = logCalc.log(4) ;
        assertEquals("The expected value is 0.60206", expectedLog,actualLog,delta);
    }
    @Test
    public void invLogTest(){
        LogCalc logCalc = new LogCalc();
        double expectedInvLog = 4;
        double actualInvLog = logCalc.invLog(0.6020599913279624);
        assertEquals("The expected value is 4 ", expectedInvLog,actualInvLog,delta);
    }
    @Test
    public void natLogTest(){
        LogCalc logCalc = new LogCalc();
        double expectedNatLog =1.6094379124341003;
        double actualNatLog = logCalc.natLog(5);
        assertEquals("The expected value is 1.6094379124341003", expectedNatLog,actualNatLog,delta);
    }
    @Test
    public void invNatLogTest(){
        LogCalc logCalc = new LogCalc();
        double expectedInvNatLog = 5;
        double actualInvNatLog = logCalc.invNatLog(1.6094379124341003);
        assertEquals("The expected value is 5", expectedInvNatLog,actualInvNatLog,delta);
    }
}

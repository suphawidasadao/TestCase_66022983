import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HealthEvaluationTest {

    @Test
    void testEvaluateBloodPressure() {
        assertEquals("กลุ่มปกติ", HealthEvaluation.evaluateBloodPressure(110, 70));
        assertEquals("กลุ่มเสี่ยง", HealthEvaluation.evaluateBloodPressure(125, 85));
        assertEquals("กลุ่มป่วย ระดับ 1", HealthEvaluation.evaluateBloodPressure(150, 95));
        assertEquals("กลุ่มป่วย ระดับ 2", HealthEvaluation.evaluateBloodPressure(170, 105));
        assertEquals("กลุ่มป่วย ระดับ 3", HealthEvaluation.evaluateBloodPressure(185, 120));
    }

    @Test
    void testEvaluateFBS() {
        assertEquals("กลุ่มปกติ", HealthEvaluation.evaluateFBS(90));
        assertEquals("กลุ่มเสี่ยง", HealthEvaluation.evaluateFBS(110));
        assertEquals("กลุ่มป่วย ระดับ 1", HealthEvaluation.evaluateFBS(130));
        assertEquals("กลุ่มป่วย ระดับ 2", HealthEvaluation.evaluateFBS(170));
        assertEquals("กลุ่มป่วย ระดับ 3", HealthEvaluation.evaluateFBS(200));
    }
}

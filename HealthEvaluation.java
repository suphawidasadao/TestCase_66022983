public class HealthEvaluation {

    //ความดันโลหิต
    public static String evaluateBloodPressure(int systolic, int diastolic) {
        if (systolic < 120 && diastolic < 80) {
            return "กลุ่มปกติ";
        } else if (systolic >= 120 && systolic <= 139 || diastolic >= 80 && diastolic <= 89) {
            return "กลุ่มเสี่ยง";
        } else if (systolic >= 140 && systolic <= 159 || diastolic >= 90 && diastolic <= 99) {
            return "กลุ่มป่วย ระดับ 1";
        } else if (systolic >= 160 && systolic <= 179 || diastolic >= 100 && diastolic <= 109) {
            return "กลุ่มป่วย ระดับ 2";
        } else if (systolic >= 180 || diastolic >= 110) {
            return "กลุ่มป่วย ระดับ 3";
        } else {
            return "ข้อมูลไม่ถูกต้อง";
        }
    }

    //น้ำตาลในเลือด 
    public static String evaluateFBS(int fbs) {
        if (fbs <= 100) {
            return "กลุ่มปกติ";
        } else if (fbs >= 101 && fbs <= 125) {
            return "กลุ่มเสี่ยง";
        } else if (fbs >= 126 && fbs <= 154) {
            return "กลุ่มป่วย ระดับ 1";
        } else if (fbs >= 155 && fbs <= 182) {
            return "กลุ่มป่วย ระดับ 2";
        } else if (fbs >= 183) {
            return "กลุ่มป่วย ระดับ 3";
        } else {
            return "ข้อมูลไม่ถูกต้อง";
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateBloodPressure(135, 85));
        System.out.println(evaluateFBS(160));
    }
}

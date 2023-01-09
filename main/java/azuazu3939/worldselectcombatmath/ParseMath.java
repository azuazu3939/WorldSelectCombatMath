package azuazu3939.worldselectcombatmath;

public class ParseMath {

    static double parseMath(String stringMath) {
        char[] opes = { '+', '-', '*', '/'};
        char ope = ' ';
        int opeIdx = 0;
        for (char o : opes) {
            opeIdx = stringMath.indexOf(o);
            if (opeIdx != -1) {
                ope = stringMath.charAt(opeIdx);
                break;
            }
        }

        double x = Double.parseDouble(stringMath.substring(0, opeIdx));
        double y = Double.parseDouble(stringMath.substring(opeIdx + 1));

        double answer;
        if (ope == '+') {
            answer = x + y;
        } else if (ope == '-') {
            answer = x - y;
        } else if (ope == '*') {
            answer = x * y;
        } else {
            answer = x / y;
        }
        return answer;
    }
}

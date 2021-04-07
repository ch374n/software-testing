import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

            List<String> employees = Arrays.asList(
                    "tony",
                    "steve",
                    "wanda",
                    "vision",
                    "thanos",
                    "clint",
                    "nick");

            /*  Problem statement 1: print message only if no employee name has length greater
            *   than or equal to 5
            * */

            boolean hasLengthGreaterOrEqual = true;
            for(String employee: employees) {
                if(employee.length() >= 5) {
                    hasLengthGreaterOrEqual = false;
                    break;
                }
            }

            if(hasLengthGreaterOrEqual) {
                System.out.println("There are employee names having length greater than or equal to 5");
            } else {
                System.out.println("No employee name has a length greater than or equal to 5");
            }

            hasLengthGreaterOrEqual = employees.stream().noneMatch(employee -> employee.length() >= 5);

            if(hasLengthGreaterOrEqual) {
                System.out.println("There are employee names having length greater than or equal to 5");
            } else {
                System.out.println("No employee name has a length greater than or equal to 5");
            }
    }
}

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class BusinessReport {

    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {
        // Get employees and map them on the type of disability they possess

        return business.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDisability));
    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        // Get employees, filter by gender, get their projects without duplicates, count

        return business.getEmployees().stream()
                .filter(x -> x.getGender() == Gender.FEMALE)
                .flatMap(x -> x.getProjects().stream())
                .distinct().count();
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {
        /* Map the employees by religion (Map<Religion, List<Employee>>) then map each of the lists by gender
           Map -> key (Religion)
               -> value (Map -> key -> (Gender)
                               -> value -> List<Employee>)
           Hint: use Collectors.groupingBy(Function, Collector) */

        return business.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getReligion,
                        Collectors.groupingBy(Employee::getGender)));
    }
}

package companies.forgotten;

import java.util.HashSet;
import java.util.Set;

public class GetAllSubsetsOfArray {

    public Set<Set<Integer>> calculate(Set<Integer> array) {
        Set<Set<Integer>> result = new HashSet<>();

        result.add(new HashSet<>()); //Add empty set.

        for (Integer number : array) {
            // Copy result
            Set<Set<Integer>> resultCopy = new HashSet<>(result);

            for (Set<Integer> subset : resultCopy) {
                Set<Integer> extended = new HashSet<>(subset);
                extended.add(number);
                result.add(extended);
                System.out.println(result);
            }
        }

        return result;
    }
}

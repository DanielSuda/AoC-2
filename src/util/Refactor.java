package util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Nikolay Sinitsin
 */
public class Refactor {

    private final List<Integer> defaultIntData;
    private final List<Integer> modifiedIntData;

    public Refactor(String inputData) {
        this.defaultIntData = Stream.of(inputData.split(",")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        this.modifiedIntData = Stream.of(inputData.split(",")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

    }

    public List<Integer> ReturnUncorruptedData(){
        int counter = 0,operator = 0, firstPosition = 0, secondPosition = 0;
        loop : for (int x : modifiedIntData) {
            counter++;
            switch (counter) {
                case 1 -> {
                    if (x == 99)
                        break loop;
                    operator = x;
                }
                case 2 -> firstPosition = x;
                case 3 -> secondPosition = x;
                case 4 -> {
                    if (operator == 1) {
                        modifiedIntData.set(x, modifiedIntData.get(firstPosition) + modifiedIntData.get(secondPosition));
                    } else if (operator == 2) {
                        modifiedIntData.set(x, modifiedIntData.get(firstPosition) * modifiedIntData.get(secondPosition));
                    } else System.out.println("something went wrong");
                    counter = 0;
                }
            }
        }
        return modifiedIntData;
    }

    @Override
    public String toString() {
        return "default input data : " + defaultIntData  + "\nmodified data : " + modifiedIntData;
    }
}

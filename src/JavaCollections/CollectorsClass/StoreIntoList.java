package JavaCollections.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StoreIntoList {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,6);
        integers.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(integers);
    }
}

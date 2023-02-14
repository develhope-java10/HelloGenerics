import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Converter <T extends Number>{

    public List<Double> toDouble(List<T> list) {
        List<Double> doubleList = new ArrayList<>(list.size());
        for(Number number : list) {
            doubleList.add(number.doubleValue());
        }
        return doubleList;
    }

}


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Converter<S extends Number, T extends Number> {

	public List<T> toDouble(List<S> list) {
		List<T> convertedList = new ArrayList<>(list.size());
		for (S number : list) {
			convertedList.add((T) number);
		}
		System.out.println(convertedList);
		return convertedList;
	}
}


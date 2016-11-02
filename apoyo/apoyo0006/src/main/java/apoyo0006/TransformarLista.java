package apoyo0006;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformarLista {
	public List<Integer> transformar(List<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			l.set(i, l.get(i) * 10 + 1);
		}
		return l;
	}

	public List<Integer> transformar2(List<Integer> l) {
		List<Integer> r = new ArrayList<>();
		for (int i = 0; i < l.size(); i++) {
			r.add(l.get(i) * 10 + 1);
		}
		return r;
	}

	public List<Integer> transformar3(List<Integer> l) {
		return l.stream().map(i -> i * 10).map(i -> i + 1)
				.collect(Collectors.toList());
	}
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		House[] properties = { new House("102 Chicago, IL", 3, 1300, 240000, 1985),
				new House("32 Morton, IL", 2, 1200, 200000, 1990), new House("467 D1, CA", 3, 1700, 400000, 1991) };

		Arrays.sort(properties);
		for (House h : properties) {
			System.out.println(h.getAddress() + " ");
		}
		System.out.println();
		List<Dog> dogs = Arrays.asList(new Dog("fido"), new Dog("snoopy"), new Dog("alphie"), new Dog("charlie"));

		Collections.sort(dogs, new CompareDogs());
		for (Dog d : dogs) {
			System.out.println(d + " ");
		}
	}

	public static class CompareDogs implements Comparator<Dog>{

		@Override
		public int compare(Dog o1, Dog o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
			
	}
}

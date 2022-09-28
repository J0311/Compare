import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		
		House [] properties = {
				new House("102 Chicago, IL", 3, 1300, 240000, 1985),
				new House("32 Morton, IL", 2, 1200, 200000, 1990),
				new House("467 D1, CA", 3, 1700, 400000, 1991)
				};
		
		Arrays.sort(properties);
		for (House h : properties) {
			System.out.println(h.getAddress() + " ");
		}
		//System.out.println(Arrays.toString(properties) + " ");
		
	}
	


}

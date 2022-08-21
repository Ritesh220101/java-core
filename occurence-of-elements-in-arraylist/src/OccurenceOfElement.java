import java.util.*;

public class OccurenceOfElement {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(20, 30, 40, 60, 30, 50, 40, 40, 30, 20, 20));
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i : number) {
			for (int j : number) {
				if (i == j)
					count++;
			}
			map.put(i, count);
			count = 0;
		}
		System.out.println(map);
	}

	@Override
	public String toString() {
		return "OccurenceOfElement [toString()=" + super.toString() + "]";
	}
	

}

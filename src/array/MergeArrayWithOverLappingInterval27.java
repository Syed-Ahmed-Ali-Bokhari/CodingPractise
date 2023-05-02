package array;

import java.util.ArrayList;

public class MergeArrayWithOverLappingInterval27 {
//merge an array with overlapping intervals
// (1,5)  (3,7)  (4,6)  (6,8)  == > (1,8)
// (10,12)  (12,15) == > (10,15)



	static public class Pair {
		int first;
		int second;

		Pair(int x, int y) {
			this.first = x;
			this.second = y;
		}
	}

	public static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) { // TODO Auto-generated method stub
		ArrayList<Pair> result = new ArrayList<Pair>();
		result.add(new Pair(v.get(0).first, v.get(0).second));
		for (int i = 1; i < v.size(); i++) {
			int x1 = v.get(i).first;
			int x2 = v.get(i).second;
			int y1 = result.get(result.size() - 1).first;
			int y2 = result.get(result.size() - 1).second;

			if (y2 >= x1) {
				result.get(result.size() - 1).second = Math.max(x2, y2);
			} else
				result.add(new Pair(x1, x2));

		}

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Pair> v = new ArrayList<Pair>();
		v.add(new Pair(1, 5));
		v.add(new Pair(3, 7));
		v.add(new Pair(4, 6));
		v.add(new Pair(6, 8));

		ArrayList<Pair> result = MergeArrayWithOverLappingInterval27.mergeIntervals(v);

		for (Pair p : result) {
			System.out.println(p.first);
			System.out.println(p.second);
		}

	}

}

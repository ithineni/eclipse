package runner;

import java.util.ArrayList;
import java.util.List;

public class LowestPopulationYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// list storing all birth and death years
			List<String> year = new ArrayList<>();
			year.add("1902:1991");
			year.add("1941:1978");
			year.add("2004:");
			year.add("1957:");
			year.add("1989:2008");
			year.add("1909:2005");
			year.add("1918:");
			year.add("1913:2010");
			year.add("1979:");
			year.add("1961:2002");
			year.add("1977:2003");
			year.add("1909:1991");
			LowestPopulationYears yearsPrint = new LowestPopulationYears("1902:1991");
			System.out.println("Years with lowest population are: "+ "\n" );
			System.out.println(yearsPrint.lowerPopulation(year));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Integer born;
	Integer died;

//Constructor separating born and dead years and converting into integers
	public LowestPopulationYears(String input) throws Exception {
		String[] values = input.split(":");
		if (values.length == 2) {
			born = Integer.parseInt(values[0]);
			died = Integer.parseInt(values[1]);
		} else if (values.length == 1) {
			born = Integer.parseInt(values[0]);
		} else {
			throw new Exception("bad input");
		}
	}

	// function storing birth and death years in form of integers
	public List<Integer> lowerPopulation(List<String> in) {
		List<Integer> result = new ArrayList<>();
		List<LowestPopulationYears> entries = new ArrayList<>();
		for (String ins : in) {
			try {
				entries.add(new LowestPopulationYears(ins));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int birthCount = 0;
		int deathCount = 0;
		int liveCount = birthCount - deathCount;
		// for loop for finding lowest population year
		for (int y = 1900; y < 2021; y++) {
			int preAlive = liveCount;
			for (LowestPopulationYears count : entries) {
				if (y == count.born) {
					birthCount++;
				} else if (count.died != null && y == count.died) {
					deathCount++;
				}
			}
			liveCount = birthCount - deathCount;
			if (preAlive > liveCount) {
				result.add(y + 1);

			}
		}
		return result;
	}

}

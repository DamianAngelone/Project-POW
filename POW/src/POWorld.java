import java.util.ArrayList;

public class POWorld implements Comparable<POWorld> {

	private static ArrayList<POWorld> powArray = new ArrayList<POWorld>();
	private String name;
	private double rating;
	
	public POWorld(String n, double POW){
		
		this.name = n;
		this.rating = POW;
		
	}
	
	public double getRating(){
		
		return this.rating;
	}
	
	public static void SortPOW(ArrayList<Deadbird> db){
		
		String name = "";
		double rating = 0;
		
		 for (Deadbird d : db) {
			 
			 rating = searchDeadbird.searchBird(d.getName(), db);
			 name = d.getName();
			 POWorld powAndName = new POWorld(name, rating);
			 powArray.add(powAndName);
			 
			
		}
		
		 MergeSort.sortGivenArray(powArray);
		 powArray = MergeSort.getSortedArray();
		 
		 for(int i = 0; i > 10; i++){
			 
			 System.out.println(powArray.get(i));
		 }
		
	}
	
	@Override
	public int compareTo(POWorld arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

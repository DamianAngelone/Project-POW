import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static String[][] graphData;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Deadbird> db = new ArrayList<Deadbird>();
		ReadExcel.Read(db);
		powRating[] p = topWorst10.SortPOW(db);
//		for (powRating pR : p) {
//			System.out.println(pR.getName() + " " + pR.getRating());
//		}
//		System.out.println(searchDeadbird.searchBird("American Black Duck", db));
//		System.out.println(searchArea.searchLocation("Yukon", db));

		//graphData = graphDeadBirds.searchBirds("Killdeer", db);
		graphData = graphAreas.searchLocations("Taiga Shield and Hudson Plains", db);
		FileWriter r = new FileWriter("out.txt");
		BufferedWriter w = new BufferedWriter(r);
		
		for(int i = 0; i < graphData[0].length; i++){
			for(int j = 0; j < graphData.length; j++){
				w.write(graphData[j][i]+" ");
			}
			w.write("\n");
		}
		w.close();

		//javafx.application.Application.launch(BarChartSample.class);
		javafx.application.Application.launch(BarChartSampleForLocation.class);
	}
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartSample extends Application {

	@Override
	public void start(Stage stage) {

		stage.setTitle("Graph for " + main.graphData[0][main.graphData[0].length - 1]);
		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		final BarChart<String, Number> bc = new BarChart<>(xAxis, yAxis);
		
		int n = main.graphData[0].length - 1;
		bc.setTitle(main.graphData[0][n]);
		xAxis.setLabel("Location");
		yAxis.setLabel("Annual Population Percent Change");

		boolean use = true;
		String loc = "";
		double trend = 0;


		XYChart.Series series1 = new XYChart.Series();
		series1.setName(main.graphData[0][n]);
		//series1.getData().add(new XYChart.Data("location", 50));

		for (int j = 0; j < main.graphData[0].length - 2; j++) {
			for (int i = 0; i < 2; i++) {
				if (use == true) {
					loc = main.graphData[i][j];
				} else {
					trend = Double.parseDouble(main.graphData[i][j]);
					series1.getData().add(new XYChart.Data(loc, trend));
				}
				use = false;
			}
			use = true; 

		}

		Scene scene = new Scene(bc, 800, 600);
		bc.getData().addAll(series1);
		stage.setScene(scene);
		stage.show();
	}

}

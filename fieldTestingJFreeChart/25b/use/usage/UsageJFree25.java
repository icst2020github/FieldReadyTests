package usage;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.io.File;
import java.io.IOException;
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.GrayPaintScale;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;

public class UsageJFree25 {
 
	private CategoryDataset createCategoryDataset() {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(225.0, "15-20 Years", "Male");
		dataset.addValue(419.0, "20-30 Years", "Male");
		dataset.addValue(141.0, "30-40 Years", "Male");
 
		dataset.addValue(634.0, "15-20 Years", "Female");
		dataset.addValue(229.0, "20-30 Years", "Female");
		dataset.addValue(433.0, "30-40 Years", "Female");
		return dataset;
 
}
 
	private JFreeChart create3DBarChart(CategoryDataset dataset, PlotOrientation plotOrientation) {
		JFreeChart chart = ChartFactory.createBarChart3D("3D Bar Chart Demo - www.sanjaal.com/java","Gender","Avg Minutes Spent On Sanjaal.com Per Day",dataset,plotOrientation, true, false, false);
		CategoryPlot plot = chart.getCategoryPlot();
		CategoryAxis axis = plot.getDomainAxis();
		axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 16.0));
		CategoryItemRenderer renderer = plot.getRenderer();
		BarRenderer r = (BarRenderer) renderer;
		r.setMaximumBarWidth(0.1);
		chart.setBackgroundPaint(Color.WHITE);
 
		return chart;
 
	}
 
	public void saveChart(JFreeChart chart, String fileLocation) {
		try {
			ChartUtilities.saveChartAsJPEG(new File(fileLocation), chart, 800,600);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Problem occurred creating chart.");
		}
	}
	
	public static void trigger() {
		DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
		dataset.add(1.0, 2.0, "S1", "C1");
		dataset.add(null, new Double(4.0), "S1", "C2");
		CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), new StatisticalBarRenderer());
	}
 
	public static void main(String[] args) throws CloneNotSupportedException {
		UsageJFree25 chartCreator = new UsageJFree25();
 
		CategoryDataset categoryDataset = chartCreator.createCategoryDataset();
 
		JFreeChart chartHorizontal = chartCreator.create3DBarChart(categoryDataset, PlotOrientation.HORIZONTAL);
 
		String horizontalChartFileSaveLocation = "~/work/buggy/jfreechart/jfree1b/testchart/my3DCategoryChartHorizontal.jpg";
 
		chartCreator.saveChart(chartHorizontal, horizontalChartFileSaveLocation);
		System.out.println("Horizontal Category Chart Created Successfully");
		System.out.println("Chart has been saved to: "+ horizontalChartFileSaveLocation);
 
		JFreeChart chartVertical = chartCreator.create3DBarChart(categoryDataset, PlotOrientation.VERTICAL);
 
		String verticalChartFileSaveLocation = "~/work/buggy/jfreechart/jfree1b/testchart/my3DCategoryChartVertical.jpg";
 
		chartCreator.saveChart(chartVertical, verticalChartFileSaveLocation);
 
		System.out.println("nVertical Category Chart Created Successfully");
		System.out.println("Chart has been saved to: "+ verticalChartFileSaveLocation);
		
		long startTime = System.nanoTime();
		try {
			trigger();
		}catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("time spent: "+totalTime);
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory is bytes: " + memory);
	}
 
}

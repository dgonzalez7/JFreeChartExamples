import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class LineChart extends JFrame
{
	private static final long serialVersionUID = 1L;

	public LineChart(String applicationTitle, String chartTitle) {
		super(applicationTitle);

		// This will create the dataset 
		DefaultCategoryDataset dataset = createDataset();

		// based on the dataset we create the chart
		JFreeChart lineChart = ChartFactory.createLineChart(
				chartTitle,
				"Years","Number of Schools",
				dataset,
				PlotOrientation.VERTICAL,
				true,true,false);
		// we put the chart into a panel
		ChartPanel chartPanel = new ChartPanel( lineChart );
		// default size
		chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
		// add it to our application
		setContentPane( chartPanel );
	}
	  
	private DefaultCategoryDataset createDataset( )
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
		dataset.addValue( 15 , "schools" , "1970" );
		dataset.addValue( 30 , "schools" , "1980" );
		dataset.addValue( 60 , "schools" ,  "1990" );
		dataset.addValue( 120 , "schools" , "2000" );
		dataset.addValue( 240 , "schools" , "2010" );
		dataset.addValue( 300 , "schools" , "2014" );
		return dataset;
	}
}

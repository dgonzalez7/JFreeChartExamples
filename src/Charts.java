public class Charts 
{

	public static void main(String[] args) 
	{
		PieChart demo = new PieChart("Comparison", "Which operating system are you using?");
		demo.pack();
		demo.setVisible(true);
		
		LineChart lc = new LineChart("School Vs Years" , "Number of Schools vs Years");
		lc.pack();
		lc.setVisible(true);
	}
}

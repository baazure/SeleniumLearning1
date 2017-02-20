package tutorialspoint.com.learnings;

public class Xldemo {

	public static void main(String[] args) throws Exception
	{
		ParameterizingUsingExcel dd = new ParameterizingUsingExcel ("E:\\Projects\\automation\\Selenium\\Book1.xlsx", "Test1");
		System.out.println("The Row count is " + dd.excel_get_rows());
		
		dd.getCellDataasnumber(1, 1);
		dd.getCellDataasnumber(1, 2);
		dd.getCellDataasnumber(1, 3);
		dd.getCellDataasnumber(2, 1);
		dd.getCellDataasnumber(2, 2);
		dd.getCellDataasnumber(2, 3);
		dd.getCellDataasnumber(3, 1);
		dd.getCellDataasnumber(3, 2);
		dd.getCellDataasnumber(3, 3);
		
	}
}

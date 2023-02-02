package excel.utility;

import org.testng.annotations.Test;
public class Demo{
	
	
	public static void main(String[] args) {
		ExcelReader e = new ExcelReader("/home/josh/eclipse-workspace/toolsQA/Data/Data_DemoQA.xlsx");
		System.out.println(e.doesSheetExist("Table"));
		//System.out.println(e.rowCount("Table"));
		//System.out.println(e.columnCount("Table"));
		//System.out.println(e.getCellData("Table", "Values", 7));
		//System.out.println(e.getData("Table", "Values", 5));
		System.out.println(e.getCellData("Table", 4, 1));
	}
	
	/*@Test(dataProvider="excel-data" , dataProviderClass = ExcelDP.class)
	public void signIn(String label, String value) {				
		//System.out.println(label+"--"+value);
		if(label.equalsIgnoreCase("Name")) {
			System.out.println(value);
		}
		
		else if(label.equalsIgnoreCase("Email"))
		{
			System.out.println(value);
		}
	}*/

}



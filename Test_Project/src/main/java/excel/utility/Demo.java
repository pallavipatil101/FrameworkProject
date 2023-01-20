package excel.utility;



public class Demo {
	
	
	public static void main(String[] args) {
		ExcelReader e = new ExcelReader("/home/josh/eclipse-workspace/toolsQA/Data/Data_DemoQA.xlsx");
		System.out.println(e.doesSheetExist("Table"));
		System.out.println(e.rowCount("Table"));
		System.out.println(e.columnCount("Table"));
		System.out.println(e.getCellData("Table", "Values", 7));
		System.out.println(e.getNumericCellData("Table", 5, 1));
		System.out.println(e.getData("Table", "Values", 5));
		System.out.println(e.getData("Table", "Values", 1));
	}

}

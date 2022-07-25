package Testing;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wagnor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		readData();
	}
	public static void readData() throws Exception
	{
		File sandesh=new File("./DataSheet.xlsx");
		FileInputStream san= new FileInputStream(sandesh);
		XSSFWorkbook sandy=new XSSFWorkbook(san);
		XSSFSheet gowda=sandy.getSheet("gmail");
		DataFormatter venur=new DataFormatter();
		
		
		int guru=gowda.getLastRowNum();
		for(int i=0;i<=guru;i++)
		
		{
			
			System.out.println(venur.formatCellValue(gowda.getRow(i).getCell(2 )));
		}
	
}
}

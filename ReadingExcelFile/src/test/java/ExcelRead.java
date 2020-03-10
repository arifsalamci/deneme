import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelRead {




    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("arif");


      int usedRows = sheet.getPhysicalNumberOfRows();

      int last = sheet.getLastRowNum();


        for (int i = 0; i < usedRows; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Neena")) {
               sheet.getRow(i).getCell(0).setCellValue("Arif");
                break;
            }
        }

        for (int i = 0; i < usedRows ; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Adam")){
               sheet.getRow(i).getCell(1).setCellValue("Madam");
                break;
            }
        }

        for (int i = 0; i < usedRows ; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Steven")){
                sheet.getRow(i).getCell(0).setCellValue("Tom");
                break;
            }
        }

        for (int i = 0; i < usedRows ; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Arif")){
                sheet.getRow(i).getCell(2).setCellValue("Developer");
                break;
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();

    }
}


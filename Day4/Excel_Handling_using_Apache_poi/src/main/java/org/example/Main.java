package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        /*
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet =  workbook.createSheet("Employee_Data");


        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});



        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {

            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }


        try {
            FileOutputStream out = new FileOutputStream("employee_data.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("written successfully on disk.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        */

        // Code to read data from employee_data.xlsx
        try {
            FileInputStream fis = new FileInputStream("employee_data.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet

            DataFormatter formatter = new DataFormatter();

            // Iterate through each row
            for (Row row : sheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    String cellValue = formatter.formatCellValue(cell);
                    System.out.print(cellValue + "\t");
                }
                System.out.println(); // New line after each row
            }

            workbook.close();
            fis.close();
            System.out.println("Data read successfully from employee_data.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
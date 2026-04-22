package org.tranning;




import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.tranning.model.Customer;

import java.io.FileOutputStream;
import java.util.List;

public class ExcelExporter {

    public void export(List<Customer> list) throws Exception {

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Customers");

        int rowNum = 0;

        for (Customer c : list) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(c.getId());
            row.createCell(1).setCellValue(c.getName());
            row.createCell(2).setCellValue(c.getBalance());
        }

        FileOutputStream fos = new FileOutputStream("customers.xlsx");
        wb.write(fos);
        wb.close();

        System.out.println("Excel file generated!");
    }
}

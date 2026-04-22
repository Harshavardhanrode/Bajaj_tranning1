package org.tranning.ExcelinputSorter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.*;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSorter {

    public static  void main(String[] args){


        try{
            FileInputStream fileInputStream = new FileInputStream("data.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream("data.xlsx");
            Workbook wb = WorkbookFactory.create(fileInputStream);
            List<String> dataList = new ArrayList<>();

            Sheet sh = wb.getSheetAt(0);


            int rowCount = sh.getPhysicalNumberOfRows();

            DataFormatter df = new DataFormatter();
            for(int i=0;i<rowCount;i++){
                Row row = sh.getRow(i);
                dataList.add(df.formatCellValue(row.getCell(0)));
            }

            for(char ch = 65;ch<95;ch++){
                char var = ch;
                List<String> temp = dataList.stream().filter(
                        n->n.charAt(0) == var).toList();
                if(temp.isEmpty())
                    continue;



            }

            System.out.println(dataList);


        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}

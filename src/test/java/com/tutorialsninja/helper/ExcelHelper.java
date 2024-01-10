package com.tutorialsninja.helper;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHelper {
    public static Object[][] getTestData(String fileName, String sheetName) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        Object[][] testData = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];

        for (int row = sheet.getFirstRowNum() + 1; row <= sheet.getLastRowNum(); row++){
            for (int col = sheet.getRow(row).getFirstCellNum(); col < sheet.getRow(row).getLastCellNum(); col++) {
                testData[row][col] = sheet.getRow(row).getCell(col).toString();
            }
        }
        return testData;
    }
}
package tests;

import org.junit.jupiter.api.Test;

public class FileOperationsTest {

    @Test
    public void testCreateFile() {
        try {
            com.FileOperations.IO.CreateFile.main(new String[]{});
        } catch (Exception e) {
            System.out.println("CreateFile: " + e.getMessage());
        }
    }

    @Test
    public void testBufferedReader() {
        try {
            com.FileOperations.IO.Buffered_Reader.main(new String[]{});
        } catch (Exception e) {
            System.out.println("Buffered_Reader: " + e.getMessage());
        }
    }

    @Test
    public void testReadDataInFile() {
        try {
            com.FileOperations.IO.ReadDataInFile.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ReadDataInFile: " + e.getMessage());
        }
    }

    @Test
    public void testWriteToFile() {
        try {
            com.FileOperations.IO.WriteToFile.main(new String[]{});
        } catch (Exception e) {
            System.out.println("WriteToFile: " + e.getMessage());
        }
    }

    @Test
    public void testBufferedWriter() {
        try {
            com.FileOperations.IO.Buffered_Writer.main(new String[]{});
        } catch (Exception e) {
            System.out.println("Buffered_Writer: " + e.getMessage());
        }
    }

    @Test
    public void testPrintWriter() {
        try {
            com.FileOperations.IO.Print_Writer.main(new String[]{});
        } catch (Exception e) {
            System.out.println("Print_Writer: " + e.getMessage());
        }
    }

    @Test
    public void testNewApproach() {
        try {
            com.FileOperations.IO.NewApproach.main(new String[]{});
        } catch (Exception e) {
            System.out.println("NewApproach: " + e.getMessage());
        }
    }

    @Test
    public void testListOfFilesandDirectory() {
        try {
            com.FileOperations.IO.ListOfFilesandDirectory.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ListOfFilesandDirectory: " + e.getMessage());
        }
    }

    @Test
    public void testReadCSV() {
        try {
            com.FileOperations.IO.ReadCSV.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ReadCSV: " + e.getMessage());
        }
    }

    @Test
    public void testCountWords() {
        try {
            com.FileOperations.IO.CountWords.main(new String[]{});
        } catch (Exception e) {
            System.out.println("CountWords: " + e.getMessage());
        }
    }

    @Test
    public void testReadDataInXML() {
        try {
            com.FileOperations.IO.ReadDataInXML.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ReadDataInXML: " + e.getMessage());
        }
    }

    @Test
    public void testReadDatainExcel() {
        try {
            com.FileOperations.IO.ReadDatainExcel.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ReadDatainExcel: " + e.getMessage());
        }
    }

    @Test
    public void testReadDatainExcel_old() {
        try {
            com.FileOperations.IO.ReadDatainExcel_old.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ReadDatainExcel_old: " + e.getMessage());
        }
    }

    @Test
    public void testReadExcelData_onebyone() {
        try {
            com.FileOperations.IO.ReadExcelData_onebyone.main(new String[]{});
        } catch (Exception e) {
            System.out.println("ReadExcelData_onebyone: " + e.getMessage());
        }
    }

    @Test
    public void testWriteDataFromFileswithCondition() {
        try {
            com.FileOperations.IO.WriteDataFromFileswithCondition.main(new String[]{});
        } catch (Exception e) {
            System.out.println("WriteDataFromFileswithCondition: " + e.getMessage());
        }
    }

    @Test
    public void testWriteDataFromOtherFiles() {
        try {
            com.FileOperations.IO.WriteDataFromOtherFiles.main(new String[]{});
        } catch (Exception e) {
            System.out.println("WriteDataFromOtherFiles: " + e.getMessage());
        }
    }

    @Test
    public void testWriteDataInExcel() {
        try {
            com.FileOperations.IO.WriteDataInExcel.main(new String[]{});
        } catch (Exception e) {
            System.out.println("WriteDataInExcel: " + e.getMessage());
        }
    }
}

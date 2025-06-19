//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentFactory word=new WordDocumentFactory();
        Document wordDoc=word.createDocument();
        wordDoc.open();
        wordDoc.close();

        DocumentFactory pdf =new PdfDocumentfactory();
        Document pdfDoc=pdf.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        DocumentFactory excel=new ExcelDocumentFactory();
        Document excelDoc=excel.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}
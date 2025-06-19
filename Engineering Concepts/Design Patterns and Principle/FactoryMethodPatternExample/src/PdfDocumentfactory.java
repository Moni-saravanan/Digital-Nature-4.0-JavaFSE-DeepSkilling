public class PdfDocumentfactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

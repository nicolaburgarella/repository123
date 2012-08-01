package room;

/*
 * This class is part of the book "iText in Action - 2nd Edition"
 * written by Bruno Lowagie (ISBN: 9781935182610)
 * For more info, go to: http://itextpdf.com/examples/
 * This example only works with the AGPL version of iText.
 */
 
import group.Group;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * First iText example: Hello World.
 */
public class PdfExtra {
 
    /** Path to the resulting PDF file. */
    private String result="";
	private String name;
 
    /**
     * Creates a PDF file: hello.pdf
     * @param    args    no arguments needed
     */
    public PdfExtra(String name,int roomId,String msg)
    	throws DocumentException, IOException {
    	
    	String mess=msg;
    	result="pdfHotel/"+name.toUpperCase()+"CAMERA "+roomId+"-Extra.pdf";
    	createPdf(result,mess);
    	
    	/*File myFile = new File(result);
        Desktop.getDesktop().open(myFile);
    	*/
    	
    	
    	
    }
 
    /**
     * Creates a PDF document.
     * @param filename the path to the new PDF document
     * @param mess 
     * @throws    DocumentException 
     * @throws    IOException 
     */
    public void createPdf(String filename, String mess)
	throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(mess));
        // step 5
        document.close();
    }
}
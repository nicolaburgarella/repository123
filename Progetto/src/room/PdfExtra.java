package room;

 
import group.Group;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
// TODO: Auto-generated Javadoc
/**
 * First iText example: Hello World.
 */
public class PdfExtra {
 
    /** Path to the resulting PDF file. */
    private String result="";
	
	/** The name. */
	private String name;
 
    /**
     * Creates a PDF file: hello.pdf
     *
     * @param name the group name
     * @param roomId the room id
     * @param msg the content of the pdf
     * @throws DocumentException the document exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public PdfExtra(String name,int roomId,String msg)
    	throws DocumentException, IOException {
    	
    	String mess=msg;
    	result="pdfHotel/"+name.toUpperCase()+"CAMERA "+roomId+"-Extra.pdf";
    	createPdf(result,mess);
    	
    	File myFile = new File(result);
        Desktop.getDesktop().open(myFile);
    	
    	
    	
    	
    }
 
    /**
     * Creates a PDF document.
     *
     * @param filename the path to the new PDF document
     * @param mess the mess
     * @throws DocumentException the document exception
     * @throws IOException Signals that an I/O exception has occurred.
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
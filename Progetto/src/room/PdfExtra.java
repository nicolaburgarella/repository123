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
 * PDFExtra prints all the extras of the rooms assigned to a certain group into a pdf file;
 * it creates the folder pdfHotel if it doesn't exists and it is called within the checkout procedure
 */
public class PdfExtra {
 
    /** Path to the resulting PDF file. */
    private String result="";
	
	/** The name. */
	private String name;

	private String pathDir;

	private String resultFile;
 
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
    	
    	File dir = new File("pdfHotel");
    	boolean exists = dir.exists();
    	
    	if (!exists) {
    		dir.mkdir();
    		pathDir = "pdfHotel";
    		resultFile= name.toUpperCase()+"CAMERA "+roomId+"-Extra.pdf";
    		createPdf2(pathDir, resultFile, mess);
    		File myFile = new File(pathDir,resultFile);
            Desktop.getDesktop().open(myFile);
    	  }
    	  
    	else{
    	result="pdfHotel/"+name.toUpperCase()+"CAMERA "+roomId+"-Extra.pdf";
    	createPdf(result,mess);
    	File myFile = new File(result);
        Desktop.getDesktop().open(myFile);
    	}
    	
    	
    	
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
    
    public void createPdf2(String dir,String filename, String mess)
	throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(new File(dir,filename)));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(mess));
        // step 5
        document.close();
    }
    
    
    
}
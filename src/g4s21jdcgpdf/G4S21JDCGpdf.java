/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21jdcgpdf;

import com.itextpdf.io.IOException;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;

/**
 *
 * @author Asus
 */
public class G4S21JDCGpdf {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws java.io.IOException {
        PdfWriter pdfwriter = null;
        try {
            // TODO code application logic here
            String nombrearch = "Demian.pdf";
            File file = new File(nombrearch);
            pdfwriter = new PdfWriter(file);
            
            String cadena = "Acontinuacion una frase epica de Halo";
            
            PdfDocument pdfDocument = new PdfDocument(pdfwriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph("Primer parrafo que tendremos en el pdf ");
            document.add(paragraph);
            paragraph = new Paragraph(cadena);
            document.add(paragraph);
            PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
            
            cadena = "La muerte no es más que nuestra siguiente misión";
            paragraph = new Paragraph(cadena);
            paragraph.setFont(font);
            Color blue = new DeviceRgb(255, 100, 20);
            paragraph.setFontColor(blue);
            paragraph.setFirstLineIndent(100);
            paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            document.add(paragraph);
            pdfDocument.close();
            pdfwriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
    }
    
}

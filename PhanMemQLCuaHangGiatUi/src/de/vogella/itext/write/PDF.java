package de.vogella.itext.write;

import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author TuAnh
 */
public class PDF {

    private Document document;
    private String FILE = "c:/temp/FirstPdf.pdf";
//    private Font catFont = new Font(Font.FontFamily.HELVETICA, 18,
//            Font.BOLD);
    private Font catFont;
    private Font redFont = new Font(Font.FontFamily.TIMES_ROMAN);
    private Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public PDF() {
        this.document = new Document();
        try {
            StandardCharsets.UTF_8.name();
            this.catFont = new Font(BaseFont.createFont("D:/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            this.catFont.setStyle(Font.NORMAL);
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    public void addMetaData(String title, String subject) {
        this.document.addTitle(title);
        this.document.addTitle(subject);
        
    }

    public void addItem(String title, String description) {
        Paragraph preface = new Paragraph();            
        try { 
            this.addEmptyLine(preface, 1);
            preface.add(new Paragraph(title, this.catFont));
            this.addEmptyLine(preface, 1);
            preface.add(new Paragraph(description, smallBold));
            this.document.add(preface);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void closePFD() {
        this.document.close();
    }

}

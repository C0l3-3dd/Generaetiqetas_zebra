/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etiqueta_pdf;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.AreaBreakType;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author edd_g
 */
public class Etiqueta_pdf {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Interfaz ventana = new Interfaz();
        ventana.setVisible(true);

//    PdfDocument pdf = new PdfDocument(new PdfWriter("c://users/edd_g/Desktop/TEST_3x3x3.pdf"));
//    Document document = new Document(pdf,new PageSize(312f, 85.5f));
//    document.setMargins(0, 3.125f, 0, 3);
//    
//            Paragraph codigo = new Paragraph("0123");
//            Paragraph modelo = new Paragraph("cafe");
//            Paragraph tienda = new Paragraph("T - 917");
//            Paragraph caja = new Paragraph("P - 23");
//
//            Paragraph codigo2 = new Paragraph("0123");
//            Paragraph modelo2 = new Paragraph("cafe");
//            Paragraph tienda2 = new Paragraph("T - 917");
//            Paragraph caja2 = new Paragraph("P - 23");
//            
//            Paragraph codigo3 = new Paragraph("0123");
//            Paragraph modelo3 = new Paragraph("cafe");
//            Paragraph tienda3 = new Paragraph("T - 917");
//            Paragraph caja3 = new Paragraph("P - 23");
//
//            codigo.setFontSize(10).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//            modelo.setFontSize(10).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//            tienda.setFontSize(25).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(-1);
//            caja.setFontSize(25).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//
//            codigo2.setFontSize(10).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(-1);
//            modelo2.setFontSize(10).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//            tienda2.setFontSize(25).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(-1);
//            caja2.setFontSize(25).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//            
//            codigo3.setFontSize(10).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(-1);
//            modelo3.setFontSize(10).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//            tienda3.setFontSize(25).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(-1);
//            caja3.setFontSize(25).setMargins(0,0,0,0).setBorder(Border.NO_BORDER).setMultipliedLeading(1);
//
//            codigo.setRelativePosition(0, 8, 0, 0);
//            modelo.setRelativePosition(40, -3, 0, 0);
//            tienda.setRelativePosition(0, 30, 0, 0);
//            caja.setRelativePosition(0,60,0,0);
//
//            codigo2.setRelativePosition(110f, -3, 0, 0);
//            modelo2.setRelativePosition(150, -3, 0, 0);
//            tienda2.setRelativePosition(105f, 30, 0, 0);
//            caja2.setRelativePosition(105f,60,0,0);
//            
//            codigo3.setRelativePosition(220f, -3, 0, 0);
//            modelo3.setRelativePosition(250, -3, 0, 0);
//            tienda3.setRelativePosition(210f, 30, 0, 0);
//            caja3.setRelativePosition(210f,60,0,0);
//
//            document.add(codigo);
//            document.add(modelo);
//            document.add(tienda);
//            document.add(caja);
//
//            document.add(codigo2);
//            document.add(modelo2);
//            document.add(tienda2);
//            document.add(caja2);
//            
//            document.add(codigo3);
//            document.add(modelo3);
//            document.add(tienda3);
//            document.add(caja3);
//            
//            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
//    
//    
//    
//    
//    
//    
//    
//    document.close();
//    
//    
//    File arch = new File("c://users/edd_g/Desktop/TEST_3x3x3.pdf");
//    Desktop.getDesktop().open(arch);
//    String ruta ="c://users/edd_g/Desktop/formatos etiquetas/Pedidos/1/3.xlsx";
//    FileInputStream archivo = new FileInputStream(new File(ruta));
//    XSSFWorkbook archivoLectura = new XSSFWorkbook(archivo);
//    XSSFSheet hojadata = archivoLectura.getSheetAt(0);
//    System.out.println(hojadata.getLastRowNum());
//
//
//    Row fila = hojadata.getRow(0);
//    int count_cell = 3;
//    Cell v1 = fila.getCell(count_cell);
//
//
//    while(v1 != null)
//    {
//        count_cell++;
//        v1 = fila.getCell(count_cell); 
//    }
//    count_cell = count_cell -5;
//    String[] codigos = new String[count_cell];
//    String[] modelos = new String[count_cell];
//    v1 = fila.getCell(3);
//
//        for(int i = 0; i < 2 ;i++)
//        {
//            fila = hojadata.getRow(i);
//
//            for(int j = 3 ; j < count_cell+3;j++)
//            {
//                v1 = fila.getCell(j);
//                if( v1.getCellTypeEnum().toString() ==  "BLANK" )
//                {
//                  if(i == 0)
//                  {
//                      codigos[j-3] = "-";
//                  }
//                  else
//                  {
//                      modelos[j-3] = "-";
//                  }
//                }
//                if( v1.getCellTypeEnum().toString() == "STRING" )
//                {
//                  if(i == 0)
//                  {
//                      codigos[j-3] = v1.getStringCellValue();
//                  }
//                  else
//                  {
//                      modelos[j-3] = v1.getStringCellValue();
//                  }
//                }
//                if( v1.getCellTypeEnum().toString() == "NUMERIC" )
//                {
//                  if(i == 0)
//                  {
//                      codigos[j-3] = Long.toString( new Double(v1.getNumericCellValue()).longValue() );
//                  }
//                  else
//                  {
//                     modelos[j-3] = Long.toString( new Double(v1.getNumericCellValue()).longValue() );
//                  }
//                }
//            }
//        }
//        
        
        
    }
}

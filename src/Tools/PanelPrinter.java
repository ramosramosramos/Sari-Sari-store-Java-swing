/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JPanel;

public class PanelPrinter {
    public static void getPrintPanel(JPanel panel){
         PrinterJob printerJob = PrinterJob.getPrinterJob();
    printerJob.setPrintable(new Printable() {
        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE; // Only one page
            }
            
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            panel.printAll(g2d); // Print all components in the panel
            
            return Printable.PAGE_EXISTS;
        }
    });

    boolean doPrint = printerJob.printDialog(); // Display print dialog
    if (doPrint) {
        try {
            printerJob.print();
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
    }
}

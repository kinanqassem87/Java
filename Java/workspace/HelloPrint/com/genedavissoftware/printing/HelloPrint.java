package com.genedavissoftware.printing;

import java.awt.*;
import java.awt.print.*;
import javax.swing.*;


/**
 * HelloPrint
 * Copyright 2005 Gene Davis Software, support@genedavissoftware.com
 *
 * This code is free software; you can use it, redistribute it and/or
 * modify it under the terms of version 2 of the Apache License
 * found here:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * 
 * Very basic "Hello World" for printing in Java. This code
 * is from:
 * 
 * http://www.genedavis.com/library/java_printing/
 * 
 * Some information used to create this library is based off 
 * information found here:
 * 
 * http://www.developerdotstar.com/community/node/124
 * 
 * 
 */
public class HelloPrint extends JPanel implements Printable {

   public static void main(String[] args) {
      final JFrame jf = new JFrame("HelloFrame");
    	
      final HelloPrint gds = new HelloPrint();
      gds.setPreferredSize(new Dimension(200,200));
      gds.setMinimumSize(new Dimension(200,200));
        
      jf.getContentPane().add(gds);
        
      jf.setSize(400,400);
        
      //invokeLater() is used as a workaround for a java
      //gui bug.
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            try {
               jf.setVisible(true);
           			
               //get a PrintJob
               PrinterJob pjob = PrinterJob.getPrinterJob();
               //set a HelloPrint as the target to print
               pjob.setPrintable(gds, pjob.defaultPage());
               //get the print dialog, continue if canel
               //is not clicked
               if (pjob.printDialog()) {
                  //print the target (HelloPrint)
                  pjob.print();
               }
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
	        		
   }
	
   /**
    * We happen to implement a paint method, but this could be
    * ignored for components that already to something interesting
    * on their own.
    */
   public void paint(Graphics g) {
      super.paint(g);
      g.drawString("kinan", 35, 100);
   }

	
   /**
    * Printable's implementation
    */
   public int print(Graphics g, PageFormat pf, int pageIndex) {
      //assume the page exists until proven otherwise
      int retval = Printable.PAGE_EXISTS;
		
      //We only want to deal with the first page.
      //The first page is numbered '0'
      if (pageIndex > 0){
         retval = Printable.NO_SUCH_PAGE;
      } else {
         //setting up the Graphics object for printing
         g.translate((int)(pf.getImageableX()), (int)(pf.getImageableY()));
         //populate the Graphics object from HelloPrint's paint() method
         paint(g);
      }
		
      return retval;
   }
}

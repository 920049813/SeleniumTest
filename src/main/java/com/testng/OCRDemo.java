package com.testng;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.io.File;

public class OCRDemo {

    public static void main(String[] args) throws TesseractException {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("tessdata");
        tesseract.setLanguage("chi_sim");

        File imageFile = new File("C:\\Users\\ZHANG\\Downloads\\Dingtalk_20220315082453.jpg");

        ImageIO.scanForPlugins();
        String result = tesseract.doOCR(imageFile);

        System.out.println(result);


    }

}

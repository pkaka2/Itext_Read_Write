package com.example;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PdfReadApplication {

    private static final String FILE_NAME = "C://temp//itext.pdf";

    public static void main(String[] args) {

        PdfReader reader;

        try {

            reader = new PdfReader("C://temp//itext.pdf");

            // pageNumber = 1
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
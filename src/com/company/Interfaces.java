package com.company;

interface FileReader {
    String readFile();
}

class TxtReader implements FileReader{
    public String readFile() {
        return "Conteúdo do txt";
    }
}

class PDFReader implements FileReader{
    public String readFile() {
        return "Conteúdo do pdf";
    }
}

public class Interfaces {
    public static void main(String[] args) {
        String type = "txt";
        FileReader reader;

        if(type.equals("txt")) {
           reader = new TxtReader();
        } else {
           reader = new PDFReader();
        }

        System.out.println(reader.readFile());
    }
}

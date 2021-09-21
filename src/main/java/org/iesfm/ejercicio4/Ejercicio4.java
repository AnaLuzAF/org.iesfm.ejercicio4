package org.iesfm.ejercicio4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;


public class Ejercicio4 {
    private static Logger log= LoggerFactory.getLogger(Ejercicio4.class);

    private static void createTmpDir (String dir){
        File folder= new File( "/tmp" +dir);
        folder.mkdir();

    }
    private static void createTmpFile(String dir, String fileName) throws IOException{
        File file= new File("tmp"+ dir + "/" + fileName);
        file.createNewFile();

    }

    public static void main(String[] args) {
        //Crear la estructura
        //tmp
        // d1/
        // f11.txt
        // d2/
        // f21.txt
        try{
            log.info("Creando direcorio d1....");
            createTmpDir("d1");
            log.info("Creando fichero f11.txt");
            createTmpFile("d1", "f11.txt");
            log.info("Creando direcorio d2....");
            createTmpDir("d2");
            log.info("Creando fichero f21.txt");
            createTmpFile("d2", "f21.txt");

        }catch (IOException e){
           log.error("Ha habido un error",e);
        }
    }
}

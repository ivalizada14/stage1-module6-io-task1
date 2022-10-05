package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReader {
    Logger logger = Logger.getLogger(FileReader.class.getName());
    public Profile getDataFromFile(File file) {
        String fileContent = "";
        try(FileInputStream fileInputStream = new FileInputStream(file);)
        {
            int i = 0;
            while((i=fileInputStream.read())!=-1)
            {
                fileContent += (char) (i);
            }

        } catch (IOException ex)
        {
            logger.log(Level.INFO, ex.toString());

        }
        String parts[] = fileContent.split("\\s+");

        return new Profile(parts[1], Integer.parseInt(parts[3]), parts[5], Long.parseLong(parts[7]) );

    }

}

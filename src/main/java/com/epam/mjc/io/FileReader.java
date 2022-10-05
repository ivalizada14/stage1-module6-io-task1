package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        //FileInputStream fileInputStream = null;
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
            System.out.println(ex);
        }
        System.out.println(fileContent);
        String parts[] = fileContent.split("\\s+");
        System.out.println(parts[1]);
        System.out.println(parts[3]);
        System.out.println(parts[5]);
        System.out.println(parts[7]);
        return new Profile(parts[1], Integer.parseInt(parts[3]), parts[5], Long.parseLong(parts[7]) );

    }

}

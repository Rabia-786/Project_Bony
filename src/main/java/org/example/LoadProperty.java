package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    // next line was commented before
    static String filename = "config.properties";
    static String fileLocation = "src/test/resources/TestData/config.Properties";


    public LoadProperty(){

    }
    public String getProperty(String keyName){
        // if (prop==null){
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation);

            prop.load(input);
            input.close();

        }catch (FileSystemNotFoundException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return prop.getProperty(keyName);

    }}

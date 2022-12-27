package com.demo.test.hibernate.services;


import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class HandleFileService {
    public String readFile(){
        //stringbuilder dùng cho đơn luồng vì nó bất đồng bộ
        StringBuilder result =new StringBuilder("");
        //Specify the path of the file here
        File file = new File("D://myfile.txt");
        BufferedInputStream bis = null;
        FileInputStream  fis= null;

        try
        {
            //FileInputStream to read the file
            fis = new FileInputStream(file);

            /*Passed the FileInputStream to BufferedInputStream
             *For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);

            /*available() method of BufferedInputStream
             * returns 0 when there are no more bytes
             * present in the file to be read*/
            while( bis.available() > 0 ){
                result.append(bis.read());
//                System.out.print((char)bis.read());
            }

        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try{
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
        return result.toString();
    }

    public void writeFile () {
        FileOutputStream fos = null;
        File file;
        String mycontent = "This is my Data which needs" +
                " to be written into the file";
        try {
            //Specify the file path here
            file = new File("D:/myfile.txt");
            fos = new FileOutputStream(file);

            /* This logic will check whether the file
             * exists or not. If the file is not found
             * at the specified location it would create
             * a new file*/
            if (!file.exists()) {
                file.createNewFile();
            }

            /*String content cannot be directly written into
             * a file. It needs to be converted into bytes
             */
            byte[] bytesArray = mycontent.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
    }
}

package JSU;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialisation 
{

    public static void SaveFile(JSUData data, String filePath, String fileName)
    {
        try 
        {
            {
                FileOutputStream fos = new FileOutputStream(filePath+"\\"+fileName+".jsu");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        
                oos.writeObject(data);
        
                fos.close();
                oos.close();
        
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }

    public static JSUData LoadFile(String filePath, String fileName)
    { // if file dosnt exit create it first.
        try 
        {
            if(CheckFileExist(filePath,fileName) == false)
            {
                JSUData data = new JSUData();
                SaveFile(data, filePath, fileName);
                return data;
            }
            else
            {
                JSUData data = null;

                FileInputStream fis = new FileInputStream(filePath+"\\"+fileName+".jsu");
                ObjectInputStream ois = new ObjectInputStream(fis);
    
                data = (JSUData) ois.readObject();
    
                fis.close();
                ois.close();
                
                return data;
            }
        } 
        catch (Exception ioe) 
        {
            System.out.println(ioe);
            return null;
        }
    }

    private static boolean CheckFileExist(String filePath, String fileName)
    {
        File tempFile = new File(filePath+"\\"+fileName+".jsu");
        boolean exists = tempFile.exists();
        return exists;
    }
}

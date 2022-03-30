import JSU.*;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int x = JSerialisationUtility.GetInt("H",0);

        System.out.println(x);
    }

    private void ReadSaveAndLoad()
    {
        // // Enter data using BufferReader
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        // // Reading data using readLine
        // String num = reader.readLine();
        // int i = Integer.parseInt(num);

        // JSerialisationUtility.SetInt("H", i);
        // int x = JSerialisationUtility.GetInt("H",0);

        // System.out.println(x);   
    }
}

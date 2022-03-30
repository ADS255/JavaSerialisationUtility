import JSU.*;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

import javax.swing.SwingWorker.StateValue;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        SetValues();
        LoadValues();
    }

    private static void SetValues()
    {
        JSerialisationUtility.SetInt("x",9);
        JSerialisationUtility.SetString("y","y");
    }

    private static void LoadValues()
    {
        int x = JSerialisationUtility.GetInt("x",0);
        String y = JSerialisationUtility.GetString("y","y");

        System.out.println("");
        System.out.println("Loaded values:");
        System.out.println(x);
        System.out.println(y);
    }
}

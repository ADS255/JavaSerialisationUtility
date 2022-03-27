import JSU.*;

public class App 
{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JSUData jsuData = new JSUData();
        Serialisation.SaveFile(jsuData,"D:\\", "Thisworksverynice");
    }
}

package JSU;

public class JSerialisationUtility {

    private static String fileName = "ProgramData";
    private static String filePath = "c:\\";

    private static JSUData data;

    private static boolean intitialLoad;

    public static void SetInt(String key, int valueToStore)
    {
        if(intitialLoad == false)
        {
            data = Serialisation.LoadFile(filePath, fileName);
            intitialLoad= true;
        }

        data.intDict.put(key, valueToStore);
        Serialisation.SaveFile(data, filePath, fileName);
    }

    public static int GetInt(String key, int defaultReturnValue)
    {

        return 1;
    }

}

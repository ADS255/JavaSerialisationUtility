package JSU;

public class JSerialisationUtility {

    private static String fileName = JSU_Settings.fileName;
    private static String filePath = JSU_Settings.filePath;

    private static JSUData data;

    private static boolean intitialLoadComplete;

    public static void SetInt(String key, int valueToStore)
    {
        IntitialLoadCheck();

        data.intDict.put(key, valueToStore);
        Serialisation.SaveFile(data, filePath, fileName);
    }

    public static int GetInt(String key, int defaultReturnValue)
    {
        IntitialLoadCheck();

        if(data.intDict.get(key) == null)
        {
            return defaultReturnValue;
        }
        else
        {
            return data.intDict.get(key);
        }
    }

    public static void SetString(String key, String valueToStore)
    {
        IntitialLoadCheck();

        data.stringDict.put(key,valueToStore);
        Serialisation.SaveFile(data, filePath, fileName);
    }

    public static String GetString(String key, String defaultReturnValue)
    {
        IntitialLoadCheck();

        if(data.stringDict.get(key) == null)
        {
            return defaultReturnValue;
        }
        else
        {
            return data.stringDict.get(key);
        }
    }

    private static void IntitialLoadCheck()
    {
        if(intitialLoadComplete == false)
        {
            data = Serialisation.LoadFile(filePath, fileName);
            intitialLoadComplete= true;
        }
    }
}

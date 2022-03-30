package JSU;

public class JSerialisationUtility {

    private static String fileName = JSU_Settings.fileName;
    private static String filePath = JSU_Settings.filePath;

    private static JSUData data;

    private static boolean intitialLoadComplete;

    public static void SetInt(String key, int valueToStore)
    {
        if(intitialLoadComplete == false)
        {
            data = Serialisation.LoadFile(filePath, fileName);
            intitialLoadComplete= true;
        }

        data.intDict.put(key, valueToStore);
        Serialisation.SaveFile(data, filePath, fileName);
    }

    public static int GetInt(String key, int defaultReturnValue)
    {
        if(intitialLoadComplete == false)
        {
            data = Serialisation.LoadFile(filePath, fileName);
            intitialLoadComplete= true;
        }
        if(data.intDict.get(key) == null)
        {
            return defaultReturnValue;
        }
        else
        {
            return data.intDict.get(key);
        }
    }

}

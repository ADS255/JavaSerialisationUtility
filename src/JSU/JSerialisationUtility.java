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

    public static void SetBoolean(String key, boolean valueToStore)
    {
        int i = BoolToInt(valueToStore);
        data.boolDict.put(key,i);
        Serialisation.SaveFile(data, filePath, fileName);
    }

    public static boolean GetBoolean(String key, Boolean defaultReturnValue)
    {
        IntitialLoadCheck();

        if(data.boolDict.get(key) == null)
        {
            return defaultReturnValue;
        }
        else
        {
            int i = data.boolDict.get(key);
            return IntToBool(i);
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

    private static int BoolToInt(boolean bool)
    {
        int i;

        if(bool == true)
        {
            i=1;
            return i;
        }
        else
        {
            i=0;
            return i;
        }
    }

    private static boolean IntToBool(int i)
    {
        boolean bool;

        if(i==1)
        {
            bool=true;
            return bool;
        }
        else
        {
            bool=false;
            return bool;
        }
    }
}

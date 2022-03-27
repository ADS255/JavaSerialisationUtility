package JSU;

public class JSU {

    private static JSUData jData;

    private static String fileName = "ProgramData";

    private static String filePath = "c:\\";

    private static boolean intitialLoad;

    public static void SetInt(String key, int valueToStore)
    {
        if(intitialLoad == false){
        }
        jData.intDict.put(key, valueToStore);
    }

    public static int GetInt(String key, int defaultReturnValue)
    {

        return 1;
    }

}

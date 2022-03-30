package JSU;
import java.io.Serializable;
import java.util.Hashtable;

public class JSUData implements Serializable
{
    public Hashtable <String, Integer> intDict = new Hashtable<>();
    public Hashtable <String, String> stringDict = new Hashtable<>();
}
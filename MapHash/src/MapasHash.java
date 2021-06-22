import java.util.HashMap;

public class MapasHash {

    HashMap<String, String> mapa = new HashMap<String, String>();

    public void addSong(String key, String value){
        mapa.put(key,value);
    }

    public String getLyric(String key)
    {
        return mapa.get(key);
    }

}

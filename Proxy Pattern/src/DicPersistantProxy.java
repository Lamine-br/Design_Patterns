import java.util.Map;
import java.util.TreeMap;

public class DicPersistantProxy implements Dic {

    private Map<String,Object> cache = new TreeMap<>() ;
    private DicPersistant dict ;


    public Object get(String cle){
        if(this.cache.get(cle) == null){
            return this.dict.get(cle);
        }
        return this.cache.get(cle);
    }
    public void ajoute(String cle,Object o){
        this.cache.put(cle,o);
        this.dict.ajoute(cle,o);
    }
}

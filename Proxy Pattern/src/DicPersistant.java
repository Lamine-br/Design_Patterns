import java.util.Map;
import java.util.TreeMap;

public class DicPersistant implements Dic{
    Map<String,Object> memoire = new TreeMap<>() ;

    public Object get(String cle){
        return this.memoire.get(cle) ;
    }
    public void ajoute(String cle,Object o){
        this.memoire.put(cle,o) ;
    }
}

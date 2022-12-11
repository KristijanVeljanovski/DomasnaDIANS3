import java.util.ArrayList;
import java.util.List;
public class Cevka<T>{
   private List<Filter<T>> filter=new ArrayList<>();
   public void addFilter(Filter<T> filter){
       filter.add(filter);
   }
   public T runFilters(T input){
       for(Filter<T> filters:filter){
           T vnes=filters.izvrshuvaj(vnes);
       }
       return vnes;
   }
}

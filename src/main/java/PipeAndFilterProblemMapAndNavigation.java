import java.util.*;
public class PipeAndFilterProblemMapAndNavigation implements Filter{
    public static void main(String[] args){
        Scanner skener=new Scanner(System.in);
        ClassLoader loader = PipeAndFilterProblemMapAndNavigation.class.getClassLoader();
        Cevka<String> iminjaNaStudentskiDomovi=new Cevka<~>;
        Filter filter=new Filter();
        iminjaNaStudentskiDomovi.addFilter(filter);
        while(skener.hasNextLine()){
            String pateki=skener.nextLine();
            String prvaCevka=iminjaNaStudentskiDomovi.runFilters(pateki);
            String vtoraCevka=iminjaNaStudentskiDomovi.runFilters(pateki);
            String tretaCevka=iminjaNaStudentskiDomovi.runFilters(pateki);
            String cetvrtaCevka=iminjaNaStudentskiDomovi.runFilters(pateki);
            System.out.println(prvaCevka);
            System.out.println(vtoraCevka);
            System.out.println(tretaCevka);
            System.out.println(cetvrtaCevka);
        }
    }
}

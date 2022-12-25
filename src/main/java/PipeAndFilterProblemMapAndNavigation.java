import java.util.*;
public class PipeAndFilterProblemMapAndNavigation implements Filter{
    public static void main(String[] args){
        Scanner skener=new Scanner(System.in);
        ClassLoader loader = PipeAndFilterProblemMapAndNavigation.class.getClassLoader();
        Cevka<String> iminjaNaStudentskiDomovi=new Cevka<>();
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
        Cevka<String> iminjaNaFakulteti=new Cevka<>();
        iminjaNaFakulteti.addFilter(filter);
        while(skener.hasNextLine()){
            String pateki=skener.nextLine();
            String prvaCevka=iminjaNaFakulteti.runFilters(pateki);
            String vtoraCevka=iminjaNaFakulteti.runFilters(pateki);
            String tretaCevka=iminjaNaFakulteti.runFilters(pateki);
            String cetvrtaCevka=iminjaNaFakulteti.runFilters(pateki);
            System.out.println(prvaCevka);
            System.out.println(vtoraCevka);
            System.out.println(tretaCevka);
            System.out.println(cetvrtaCevka);
        }
        Cevka<String> iminjaNaKancelarii=new Cevka<>();
        iminjaNaKancelarii.addFilter(filter);
        while(skener.hasNextLine()){
            String pateki=skener.nextLine();
            String prvaCevka=iminjaNaKancelarii.runFilters(pateki);
            String vtoraCevka=iminjaNaKancelarii.runFilters(pateki);
            String tretaCevka=iminjaNaKancelarii.runFilters(pateki);
            String cetvrtaCevka=iminjaNaKancelarii.runFilters(pateki);
            System.out.println(prvaCevka);
            System.out.println(vtoraCevka);
            System.out.println(tretaCevka);
            System.out.println(cetvrtaCevka);
        }
        Cevka<String> iminjaNaMoteli=new Cevka<>();
        iminjaNaMoteli.addFilter(filter);
        while(skener.hasNextLine()){
            String pateki=skener.nextLine();
            String prvaCevka=iminjaNaMoteli.runFilters(pateki);
            String vtoraCevka=iminjaNaMoteli.runFilters(pateki);
            String tretaCevka=iminjaNaMoteli.runFilters(pateki);
            String cetvrtaCevka=iminjaNaMoteli.runFilters(pateki);
            System.out.println(prvaCevka);
            System.out.println(vtoraCevka);
            System.out.println(tretaCevka);
            System.out.println(cetvrtaCevka);
        }
    }
}

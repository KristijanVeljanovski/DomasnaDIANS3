import java.util.Arrays;
public class BibliotekiIKnizarnici {
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private int rabotnoVreme;
    private String dejnosti;
    private String [] knigi;
    private String [] bibliotekari;
    private int cenaZaKniga;
    private String [] knigiNaPoracka;
    private int [] rejting;
    private String ime;
    public BibliotekiIKnizarnici(String adresa,String mesto,int oddalecenost,int rabotnoVreme,String dejnosti,String [] knigi,String [] bibliotekari,int cenaZaKniga,String [] knigiNaPoracka,int [] rejting,String ime){
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.rabotnoVreme=rabotnoVreme;
        this.dejnosti=dejnosti;
        for(int brojac=0;brojac<knigi.length;brojac++){
            this.knigi[brojac]=knigi[brojac];
        }
        for(int brojac=0;brojac<bibliotekari.length;brojac++){
            this.bibliotekari[brojac]=bibliotekari[brojac];
        }
        this.cenaZaKniga=cenaZaKniga;
        for(int brojac=0;brojac<knigiNaPoracka.length;brojac++){
            this.knigiNaPoracka[brojac]=knigiNaPoracka[brojac];
        }
        for(int brojac=0;brojac<rejting.length;brojac++){
            this.rejting[brojac]=rejting[brojac];
        }
        this.ime=ime;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
    }
    public void setRejting(int [] r){
        for(int brojac=0;brojac<rejting.length;brojac++){
            this.rejting[brojac]=r[brojac];
        }
    }
    public int getRejting(int brojac){
        return rejting[brojac];
    }
    public void setKnigiNaPoracka(String [] materijali){
        for(int brojac=0;brojac<materijali.length;brojac++){
            this.knigiNaPoracka[brojac]=materijali[brojac];
        }
    }
    public String getKnigiNaPoracka(int brojac){
        return knigiNaPoracka[brojac];
    }
    public String rangirajKnigiZaPoracka(String [] materijali,int [] rating){
        String [] nizaOdKnigi;
        String temp;
        for(int brojac=0;brojac<knigiNaPoracka.length;brojac++){
            nizaOdKnigi[brojac].setKnigiNaPoracka(materijali[brojac]);
            nizaOdKnigi[brojac].setRejting(rating[brojac]);
            if(nizaOdKnigi[brojac].setRejting(rating[brojac])>nizaOdKnigi[brojac+1].setRejting(rating[brojac])){
                temp=nizaOdKnigi[brojac];
                nizaOdKnigi[brojac]=nizaOdKnigi[brojac+1];
                nizaOdKnigi[brojac+1]=temp;
                System.out.print(" , ",+temp);
            }
        }
    }
    public void setCenaZaKniga(int cena){
        this.cenaZaKniga=cena;
    }
    public int getCenaZaKniga(){
        return cenaZaKniga;
    }
    public int presmetajCena(int cenaZaKniga,String [] knigi){
        int celaCena=0;
        for(int brojac=0;brojac<knigi.length;brojac++){
            if(knigi[brojac].getKnigi(brojac)!=0){
                celaCena+=getKnigi(brojac)*15;
            }
        }
        return celaCena;
    }
    public void setKnigi(String [] k){
        for(int brojac=0;brojac<knigi.length;brojac++){
            this.knigi[brojac]=k[brojac];
        }
    }
    public String getKnigi(int brojac){
        return knigi[brojac];
    }
    public void setBibliotekari(String [] b){
        for(int brojac=0;brojac<bibliotekari.length;brojac++){
            this.bibliotekari[brojac]=b[brojac];
        }
    }
    public String getBibliotekari(int brojac){
        return bibliotekari[brojac];
    }
    public int zemiKnigi(String [] knigi){
        boolean daliJaImaatVoBiblioteka=false;
        int brojNaZemeniKnigi=0;
        for(int brojac=0;brojac<knigi.length;brojac++){
            knigi[brojac].getKnigi(brojac);
            if(getKnigi(brojac)!=0){
                daliJaImaatVoBiblioteka=true;
                brojNaZemeniKnigi++;
                System.out.println(knigi[brojac]);
            }
        }
        return brojNaZemeniKnigi++;
    }
    public int prijaviSeNaShalter(String [] bibliotekari){
        boolean daliSeCekiral=false;
        for(int brojac=0;brojac<bibliotekari.length;brojac++){
            if(bibliotekari[brojac].getBibliotekari(brojac)!=0){
                daliSeCekiral=true;
            }
        }
        return presmetajCena();
    }
    public void setAdresa(String a){
        this.adresa=a;
    }
    public String getAdresa(){
        return adresa;
    }
    public void setMesto(String m){
        this.mesto=m;
    }
    public String getMesto(){
        return mesto;
    }
    public void setOddalecenost(int o){
        this.oddalecenost=o;
    }
    public int getOddalecenost(){
        return oddalecenost;
    }
    public void setRabotnoVreme(int vreme){
        this.rabotnoVreme=vreme;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
    public void setDejnosti(String d){
        this.dejnosti=d;
    }
    public String getDejnosti(){
        return dejnosti;
    }
}

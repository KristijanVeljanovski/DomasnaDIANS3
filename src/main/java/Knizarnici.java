public class Knizarnici {
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private String dejnosti;
    private int rabotnoVreme;
    private String ime;
    private String [] pobaraniMaterijaliOdKnizarnicata;
    private int brojNaMaterijaliVoKnizarnicata;
    private int cenaZaMaterijali;
    private int goleminaNaMaterijali;
    private String tematika;
    public Knizarnici(String adresa,String mesto,int oddalecenost,String dejnosti,int rabotnoVreme,String ime,String [] pobaraniMaterijaliOdKnizarnicata,int brojNaMaterijaliVoKnizarnicata,int cenaZaMaterijali,int goleminaNaMaterijali,String tematika){
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.dejnosti=dejnosti;
        this.rabotnoVreme=rabotnoVreme;
        this.ime=ime;
        for(int brojac=0;brojac<pobaraniMaterijaliOdKnizarnicata.length;brojac++){
            this.pobaraniMaterijaliOdKnizarnicata[brojac]=pobaraniMaterijaliOdKnizarnicata[brojac];
        }
        this.brojNaMaterijaliVoKnizarnicata=brojNaMaterijaliVoKnizarnicata;
        this.cenaZaMaterijali=cenaZaMaterijali;
        this.goleminaNaMaterijali=goleminaNaMaterijali;
        this.tematika=tematika;
    }
    public void setTematika(String t){
        this.tematika=t;
    }
    public String getTematika(){
        return tematika;
    }
      //
     //
    //
    public void setGoleminaNaMaterijali(int golemina){
        this.goleminaNaMaterijali=golemina;
    }
    public int getGoleminaNaMaterijali(){
        return goleminaNaMaterijali;
    }
    public int alteracijaNaCenite(int cena,int goleminaNaMaterijali){
        if(goleminaNaMaterijali>=100 && goleminaNaMaterijali<=400){
            cenaZaMaterijali=250;
        }
        else if(goleminaNaMaterijali>=500 && goleminaNaMaterijali<=1000){
            cenaZaMaterijali=500;
        }
        else if(goleminaNaMaterijali>=1100 && goleminaNaMaterijali<=1500){
            cenaZaMaterijali=1000;
        }
        return cenaZaMaterijali;
    }
    public void setCenaZaMaterijali(int cena){
        this.cenaZaMaterijali=cena;
    }
    public int getCenaZaMaterijali(){
        return cenaZaMaterijali;
    }
    public int presmetajCenaZaMaterijalite(String [] materijali){
        int suma=0;
        for(int brojac=0;brojac<materijali.length;brojac++){
            suma+=materijali[brojac].getCenaZaMaterijali();
        }
        return suma;
    }
    public void setBrojNaMaterijaliVoKnizarnicata(int broj){
        this.brojNaMaterijaliVoKnizarnicata=broj;
    }
    public int getBrojNaMaterijaliVoKnizarnicata(){
        return brojNaMaterijaliVoKnizarnicata;
    }
    public void setPobaraniMaterijaliOdKnizarnicata(String [] materijali){
        for(int brojac=0;brojac<pobaraniMaterijaliOdKnizarnicata.length;brojac++){
            this.pobaraniMaterijaliOdKnizarnicata[brojac]=materijali[brojac];
        }
    }
    public String getPobaraniMaterijaliOdKnizarnicata(int brojac){
        return pobaraniMaterijaliOdKnizarnicata[brojac];
    }
    public int brojNaZemeniMaterijaliOdKnizarnicata(String [] materijali){
        int brojka=0;
        for(int brojac=0;brojac<materijali.length;brojac++){
            materijali[brojac].getPobaraniMaterijaliOdKnizarnicata(brojac);
            brojka++;
        }
        return getBrojNaMaterijaliVoKnizarnicata()-brojka;
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
    public void setDejnosti(String d){
        this.dejnosti=d;
    }
    public String getDejnosti(){
        return dejnosti;
    }
    public void setRabotnoVreme(int vreme){
        this.rabotnoVreme=vreme;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
    }
}

public class Fakulteti {
    private String ime;
    private String adresa;
    private String mesto;
    private float oddalecenost;
    private int rabotnoVreme;
    private String dejnosti;
    private String [] smerovi;
    private int [] indeksi;
    private float [] proseci;
    private boolean nagradeniStudenti;
    private boolean daliPolozil;
    private String [] predmeti;
    public Fakulteti(String ime,String adresa,String mesto,float oddalecenost,int rabotnoVreme,String dejnosti,String [] smerovi,int [] indeksi,float [] proseci,boolean nagradeniStudenti,boolean daliPolozil){
        this.ime=ime;
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.rabotnoVreme=rabotnoVreme;
        this.dejnosti=dejnosti;
        for(int brojac=0;brojac<smerovi.length;brojac++){
            this.smerovi[brojac]=smerovi[brojac];
        }
        for(int brojac=0;brojac<indeksi.length;brojac++){
            this.indeksi[brojac]=indeksi[brojac];
        }
        for(int brojac=0;brojac<proseci.length;brojac++){
            this.proseci[brojac]=proseci[brojac];
        }
        this.nagradeniStudenti=nagradeniStudenti;
        this.daliPolozil=daliPolozil;
        for(int brojac=0;brojac<predmeti.length;brojac++){
            this.predmeti[brojac]=predmeti[brojac];
        }
    }
    public void setDaliPolozil(boolean polozil){
        this.daliPolozil=polozil;
    }
    public boolean getDaliPolozil(){
        return daliPolozil;
    }
    public void setPredmeti(String [] krediti){
        for(int brojac=0;brojac<predmeti.length;brojac++){
            this.predmeti[brojac]=krediti[brojac];
        }
    }
    public String getPredmeti(int brojac){
        return predmeti[brojac];
    }
    public int brojNaKreditiOsvoeniZaStudentot(String [] predmeti){
        int krediti=0;
        for(int brojac=0;brojac<predmeti.length;brojac++){
            if(getDaliPolozil()==true){
                krediti+=6;
            }
        }
        return krediti;
    }
    public void setNagradeniStudenti(boolean nagrada){
        this.nagradeniStudenti=nagrada;
    }
    public boolean getNagradeniStudenti(){
        return nagradeniStudenti;
    }
    public void printNagradeniStudenti(int [] indeksi,boolean nagradeniStudenti){
        nagradeniStudenti=false;
        for(int brojac=0;brojac<indeksi.length;brojac++){
            if(indeksi[brojac].getProseci(brojac)>9.5){
                nagradeniStudenti=true;
                System.out.println(indeksi[brojac]);
            }
        }
    }
    public void setProseci(float [] p){
        for(int brojac=0;brojac<proseci.length;brojac++){
            this.proseci[brojac]=p[brojac];
        }
    }
    public float getProseci(int brojac){
        return proseci[brojac];
    }
    public float presmetajProseci(int [] ocenki){
        float sumaNaOcenki=0.0;
        for(int brojac=0;brojac<5;brojac++){
            sumaNaOcenki+=ocenki[brojac];
        }
        return sumaNaOcenki/5.00;
    }
    public void setIndeksi(int [] i){
        for(int brojac=0;brojac<indeksi.length;brojac++){
            this.indeksi[brojac]=i[brojac];
        }
    }
    public int getIndeksi(int brojac){
        return indeksi[brojac];
    }
    public void setSmerovi(String [] s){
        for(int brojac=0;brojac<smerovi.length;brojac++){
            this.smerovi[brojac]=s[brojac];
        }
    }
    public String getSmerovi(int brojac){
        return smerovi[brojac];
    }
    public void raspredelbaNaStudenti(String [] smerovi,int [] indeksi){
        for(int brojac=0;brojac<smerovi.length;brojac++){
            smerovi[brojac].getSmerovi(brojac);
            for(int novBrojac=0;novBrojac<indeksi.length;novBrojac++){
                indeksi[novBrojac].getIndeksi(novBrojac);
            }
        }
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
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
    public void setOddalecenost(float o){
        this.oddalecenost=o;
    }
    public float getOddalecenost(){
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

public class Kafici {
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private String dejnosti;
    private int rabotnoVreme;
    private float zadovolstvoNaMusterii;
    private int [] musterii;
    private String [] kafinja;
    private String ime;
    public Kafici(String adresa,String mesto,int oddalecenost,String dejnosti,int rabotnoVreme,int zadovolstvoNaMusterii,int [] musterii,String [] kafinja,String ime){
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.dejnosti=dejnosti;
        this.rabotnoVreme=rabotnoVreme;
        this.zadovolstvoNaMusterii=zadovolstvoNaMusterii;
        for(int brojac=0;brojac<musterii.length;brojac++){
            this.musterii[brojac]=musterii[brojac];
        }
        for(int brojac=0;brojac<kafinja.length;brojac++){
            this.kafinja[brojac]=kafinja[brojac];
        }
        this.ime=ime;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
    }
    public void setZadovolstvoNaMusterii(float znm){
        this.zadovolstvoNaMusterii=znm;
    }
    public int getZadovolstvoNaMusterii(){
        return zadovolstvoNaMusterii;
    }
    public int presmetajZadovolstvoNaMusterii(int [] musterii){
        int sumaNaReakcii=0;
        for(int brojac=0;brojac<musterii.length;brojac++){
            sumaNaReakcii+=musterii[brojac].getZadovolstvoNaMusterii();
            int limiter=musterii.length/2;
            if(musterii[brojac].getZadovolstvoNaMusterii()==4 || musterii[brojac].getZadovolstvoNaMusterii()==5){
                System.out.println("Musteriite se zadovolni");
                if(musterii[brojac].getZadovolstvoNaMusterii()>limiter){
                    System.out.println("Kazete mu na shefot za raise");
                }
            }
            else if(musterii[brojac].getZadovolstvoNaMusterii()==3){
                System.out.println("Ima prostor za podobruvanja");
                if(musterii[brojac].getZadovolstvoNaMusterii()>limiter){
                    System.out.println("Ocekuvajte da bidete izvesteni od shefot");
                }
            }
            else if(musterii[brojac].getZadovolstvoNaMusterii()==1 || musterii[brojac].getZadovolstvoNaMusterii()==2) {
                System.out.println("Mora da ima promeni");
                if(musterii[brojac].getZadovolstvoNaMusterii()>limiter){
                    System.out.println("Ke ima sostanok");
                }
            }
        }
        return sumaNaReakcii;
    }
    public int kvalitetNaMeni(String [] kafinja){
        int kvalitetNaKafinja=0;
        for(int brojac=0;brojac<kafinja.length;brojac++){
            switch(kafinja[brojac]){
                case "Colombian Andean coffee":kvalitetNaKafinja+=2; break;
                case "Ethiopian acidic coffee":kvalitetNaKafinja+=2; break;
                case "Indonesian civet coffee":kvalitetNaKafinja+=2; break;
                case "Yemeni coffee of Mocha":kvalitetNaKafinja+=2; break;
                case "Mexican café de olla": kvalitetNaKafinja+=2;  break;
                case "Jamaican Blue Mountain coffee": kvalitetNaKafinja+=2; break;
                case "Traditional Brazilian cafezinho": kvalitetNaKafinja+=2; break;
                case "Italian espresso": kvalitetNaKafinja+=2; break;
            }
        }
        return kvalitetNaKafinja;
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
    public void setRabotnoVreme(int rv){
        this.rabotnoVreme=rv;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
}

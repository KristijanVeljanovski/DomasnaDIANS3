public class StudentskiDomovi {
    private String ime;
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private int rabotnoVreme;
    public StudentiKoiTrebaDaSeNavigiraat student;
    public String opcija;
    StudentskiDomovi(String ime,String adresa,String mesto,int oddalecenost,int rabotnoVreme,String opcija){
        this.ime=ime;
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.rabotnoVreme=rabotnoVreme;
        this.opcija=opcija;
    }
    public void setOpcija(String o){
        this.opcija=o;
    }
    public String getOpcija(){
        return opcija;
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
    /************************************************************************************************************************/
    public int checkAccess(int casNaDostapnost,String lokacija,StudentiKoiTrebaDaSeNavigiraat student,Fakulteti faks){
        if((casNaDostapnost>=22 && casNaDostapnost<=7) && student.getLokacija()!=getIme()){
            return 0;
        }
        else{
            server(student,faks);
        }
    }
    public void server(StudentiKoiTrebaDaSeNavigiraat student,Fakulteti faks){
        String imep,pass;
        if(student.setImePrezime(imep).equals(student.getImePrezime()) && student.setLozinka(pass).equals(student.getLozinka())){
            if(getOpcija().equals("nasokiDoFakultet")){

                student.izvrshuvaj(ime,faks.getIme());
            }
            else if(getOpcija().equals("nasokiDoBibliotekiIKnizarnici")){
                BibliotekiIKnizarnici biblioteka;
                biblioteka.patekaOdFakultetDoBiblioteka(faks.getIme(),biblioteka.getIme());
            }
            else if(getOpcija().equals("nasokiDoKafici")){
                Kafici kafic;
                kafic.patekaOdFakultetDoKafic(faks.getIme(),kafic.getIme());
            }
        }
    }
}

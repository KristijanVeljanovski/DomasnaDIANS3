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
    private int brojNaVlez;
    private int brojNaSprat;
    private StudentskiDomovi dom;
    private StudentiKoiTrebaDaSeNavigiraat student;
    public Fakulteti(String ime,String adresa,String mesto,float oddalecenost,int rabotnoVreme,String dejnosti,String [] smerovi,int [] indeksi,float [] proseci,boolean nagradeniStudenti,boolean daliPolozil,int brojNaVlez,int brojNaSprat,StudentskiDomovi dom,StudentiKoiTrebaDaSeNavigiraat student){
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
        this.brojNaVlez=brojNaVlez;
        this.brojNaSprat=brojNaSprat;
        this.dom=dom;
        this.student=student;
    }
    public void setStudent(StudentiKoiTrebaDaSeNavigiraat s){
        this.student=s;
    }
    public StudentiKoiTrebaDaSeNavigiraat getStudent(){
        return student;
    }
    public void setDom(StudentskiDomovi d){
        this.dom=d;
    }
    public StudentskiDomovi getDom(){
        return dom;
    }
    public void setBrojNaSprat(int brojce){
        this.brojNaSprat=brojce;
    }
    public int getBrojNaSprat(){
        return brojNaSprat;
    }
    public void setBrNaVlez(int broj){
        this.brojNaVlez=broj;
    }
    public int getBrNaVlez(){
        return brojNaVlez;
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
    /***********************************************************************************************************/
    public int brojNaSprat(int broj){
        boolean daliETocnaNavigacijata=false;
        //broj==-1 || broj==0 || broj==1 || broj==2
        if(getBrojNaSprat()==-1 || getBrojNaSprat()==0 || getBrojNaSprat()==1 || getBrojNaSprat()==2){
            return broj;
            daliETocnaNavigacijata=true;
        }
    }
    public void navigacijaNaSpratovite(int brojce,String kancelarija){
        if(brojNaSprat(brojce)==-1){
            if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                System.out.println("Simnete se vo podrumot na TMF i svrtete nadesno");
            }
            else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                System.out.println("Simnete se vo podrumot na TMF i svrtete nalevo");
            }
            else if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                System.out.println("Simnete se vo podrumot na TMF,svrtete nalevo dvapati,odete na krajot na hodnikot");
            }
        }
        else if(brojNaSprat(brojce)==0){
            if(kancelarija.equals("AmfiteatarTMF")){
                System.out.println("Odete na krajot na vlezot na chelo,svrtete nadesno po skalickite");
            }
            else if(kancelarija.equals("Lab138")){
                System.out.println("Na samiot vlez svrtete nadesno,odete po hodnikot,pa svrtete na prvoto levo");
            }
            else if(kancelarija.equals("Kabinet122") || kancelarija.equals("Kabinet114") || kancelarija.equals("Kabinet115") || kancelarija.equals("Kabinet116")){
                System.out.println("Na samiot vlez svrtete nadesno,odete po hodnikot,pa svrtete na prvoto levo");
            }
            else if(kancelarija.equals("Baraka2.1") || kancelarija.equals("Baraka2.2") || kancelarija.equals("Baraka3.1") || kancelarija.equals("Baraka3.2") || kancelarija.equals("Baraka1")){
                System.out.println("Odete pozadi aneksot na FEIT,odete nachelo");
            }
        }
        else if(brojNaSprat(brojce)==1){
            if(kancelarija.equals("Lab200A") || kancelarija.equals("Lab200B")){
                System.out.println("Kacete se po skalickite na prviot sprat i svrtete nadesno");
            }
            else if(kancelarija.equals("Laab200V")){
                System.out.println("Kacete se po skalickite na prviot sprat i svrtete dvapati nadesno");
            }
            else if(kancelarija.equals("Predavalna203")){
                System.out.println("Kacete se po skalickite na prviot sprat,svrtete nadesno,pa svrtete nalevo");
            }
            else if(kancelarija.equals("Lab215") || kancelarija.equals("Predavalna216")){
                System.out.println("Kacete se po skalickite na prviot sprat,svrtete nalevo dvapati");
            }
            else if(kancelarija.equals("Kabinet222")){
                System.out.println("Kacete se po skalickite na prviot sprat,svrtete nalevo,pa svrtete nadesno");
            }
        }
        else if(brojNaSprat(brojce)==2){
            if(kancelarija.equals("Predavalna315")){
                System.out.println("Kacete se po skalickite na vtoriot sprat,svrtete nalevo dva pati");
            }
            else if(kancelarija.equals("Kabinet321") || kancelarija.equals("Kabinet322") || kancelarija.equals("Kabinet332")){
                System.out.println("Kacete se po skalickite na vtoriot sprat,svrtete nalevo,pa nadesno");
            }
            else if(kancelarija.equals("Predavalna302")){
                System.out.println("Kacete se po skalickite na vtoriot sprat,svrtete nadesno dva pati");
            }
        }
    }
    public boolean publishTimeTable(int cas,int minuti,String [] predmet){
        int brojNaObjektiVoCiklusot;
        String predmetce;
        for(int brojac=0;brojac<6;brojac++){
            if(cas>=8 && cas<=20){
                if(minuti==0 || minuti==45){
                    for(int novBrojac=0;novBrojac<2;novBrojac++){
                        if(predmet[brojac].equals(predmetce)){
                            System.out.println(predmet[brojac]);
                            return true;
                        }
                    }
                }
            }
        }
    }
    public boolean mail(String [] mail){
        boolean praten_e_mailot=false;
        int br;
        String kabinet;
        for(int brojac=0;brojac<mail.length;brojac++){
            if(brojac==mail.length){
                if(brojNaSprat(br)){
                    if(kabinet.equals()){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
    }
    public void getNoviNasokiSporedVlezot(int brojNaVlez,String ime,String kancelarija){
        if(ime.equals("TMF")){
            if(brojNaSprat(getBrojNaSprat())){
                if(getBrojNaSprat()==-1){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                            System.out.println("Odete pravo po holot");
                            System.out.println("Svrtete na prvoto desno")
                        }
                        else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                            System.out.println("Odete pravo po holot");
                            System.out.println("Svrtete na prvoto levo");
                        }
                        else if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                            System.out.println("Ne mozete da stignete do ovie laboratorii preku ovoj vlez. Ve molime izberete drug");
                        }
                    }
                    if(getBrNaVlez()==2){
                        if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                            System.out.println("Prodolzete pravo na hodnikot i odete do kraj");
                        }
                        else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete na prvoto desno");
                        }
                    }
                    if(getBrNaVlez()==3){
                        if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete na prvoto levo");
                        }
                        else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                            System.out.println("Prodolzete po hodnikot i odete do kraj");
                        }
                    }
                }
                if(getBrojNaSprat()==0){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Lab138") || kancelarija.equals("AmfiteatarTMF")){
                            System.out.println("Prodolzete pravo na hodnikot do kraj");
                        }
                        else if(kancelarija.equals("Kabinet122")){
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete pravo na hodnikot");
                            System.out.println("Svrtete na prvoto levo");
                        }
                        else if(kancelarija.equals("114") || kancelarija.equals("115") || kancelarija.equals("116") || kancelarija.equals("KabinetX") || kancelarija.equals("117")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete na desno");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete na levo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                        }
                    }
                    else if(getBrNaVlez()==2){
                        if(kancelarija.equals("Kabinet122")){
                            System.out.println("Prodolzete po hodnikot. Kabinetot e na samiot pocetok");
                        }
                        else if(kancelarija.equals("114") || kancelarija.equals("115") || kancelarija.equals("116") || kancelarija.equals("KabinetX") || kancelarija.equals("117")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Prodolzete po hodnikot i vlezete na drugiot");
                            System.out.println("Vlezete na vtoriot hodnik");
                            System.out.println("Prodolzete pravo po hodnikot");
                        }
                        else if(kancelarija.equals("Lab138") || kancelarija.equals("AmfiteatarTMF")){
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete po hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==3){
                        if(kancelarija.equals("114") || kancelarija.equals("115") || kancelarija.equals("116") || kancelarija.equals("KabinetX") || kancelarija.equals("117")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                        }
                        else if(kancelarija.equals("122")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Prodolzete po hodnikot i vlezete na drugiot");
                            System.out.println("Vlezete na vtoriot hodnik");
                            System.out.println("Prodolzete pravo po hodnikot");
                        }
                        else if(kancelarija.equals("Lab138") || kancelarija.equals("AmfiteatarTMF")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno na sledniot hodnik");
                            System.out.println("Odete do samiot kraj");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Kabinetite se na samiot vlez na hodnikot");
                        }
                    }
                }
                if(getBrojNaSprat()==1){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Lab200A") || kancelarija.equals("Lab200B")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Laboratoriite se naogaat na celo pred vas");
                        }
                        else if(kancelarija.equals("Predavalna 203")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nadesno");
                        }
                        else if(kancelarija.equals("Lab200V")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nalevo");
                        }
                        else if(kancelarija.equals("Lab215") || kancelarija.equals("Predavalna216")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet222")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==2){
                        if(kancelarija.equals("Lab215") || kancelarija.equals("Predavalna216")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Svrtete na prvot levo");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet222")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Koga ke izlezete od hodnikot prodolzete pravo");
                            System.out.println("Vlezete na sledniot hodnik");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Lab200A") || kancelarija.equals("Lab200B")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Laboratoriite se na vidik");
                        }
                        else if(kancelarija.equals("Predavalna203")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot i odete do krajot");
                            System.out.println("Svrtete nadesno");
                        }
                        else if(kancelarija.equals("Lab200V")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot i odete do krajot");
                            System.out.println("Svrtete nalevo");
                        }
                    }
                }
                if(getBrojNaSprat()==2){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nalevo po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nadesno po hodnikot");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nadesno na pocetokot na hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==2){
                        if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nalevo na sledniot hodnik");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==3){
                        if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Svrtete nalevo na hodnikot");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==4){
                        if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Kabinetite se na hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                    }
                }
            }
        }
    }
    public void proveriDaliNavigaciiteSeDostapni(StudentskiDomovi dom,StudentiKoiTrebaDaSeNavigiraat student,String kancelarija){
        String lokacijaNaFakultetot=getAdresa();
        if(!lokacijaNaFakultetot.equals(dom.getAdresa())){
            getNoviNasokiSporedVlezot(getBrNaVlez(),ime,kancelarija);
        }
    }

}

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
    private String [] avtor;
    private int goleminaNaKniga;
    private String username,
    private String password;
    private String pateka;
    private StudentiKoiTrebaDaSeNavigiraat student;
    public BibliotekiIKnizarnici(String adresa,String mesto,int oddalecenost,int rabotnoVreme,String dejnosti,String [] knigi,String [] bibliotekari,int cenaZaKniga,String [] knigiNaPoracka,int [] rejting,String ime,String [] avtor,int goleminaNaKniga.String username,String password,String pateka,StudentiKoiTrebaDaSeNavigiraat studenti){
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
        for(int brojac=0;brojac<avtor.length;brojac++){
            this.avtor[brojac]=avtor[brojac];
        }
        this.goleminaNaKniga=goleminaNaKniga;
        this.username=username;
        this.password=password;
        this.pateka=pateka;
        this.student=student;
    }
    public void setStudent(StudentiKoiTrebaDaSeNavigiraat s){
        this.student=s;
    }
    public StudentiKoiTrebaDaSeNavigiraat getStudent(){
        return student;
    }
    public void setPateka(String nasoka){
        this.pateka=nasoka;
    }
    public String getPateka(){
        return pateka;
    }
    public void setUsername(String user){
        this.username=user;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
    public String getPassword(){
        return password;
    }
    public void setGoleminaNaKniga(int golemina){
        this.goleminaNaKniga=golemina;
    }
    public int getGoleminaNaKniga(){
        return goleminaNaKniga;
    }
    public void setAvtor(String [] a){
        for(int brojac=0;brojac<a.length;brojac++){
            this.avtor[brojac]=a[brojac];
        }
    }
    public String getAvtor(int brojac){
        return avtor[brojac];
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
    public void porackaNaKnigi(String [] knigi,String [] avtor){
        for(int brojac=0,novBrojac=0;brojac<knigi.length && novBrojac<avtor.length;brojac++,novBrojac++){
            knigi[brojac].setKnigi(knigi);
            avtor[brojac].setImeNaAvtor();
        }
    }
    public void proverkaNaGoleminaNaKnigi(String [] knigi){
        int maksGoleminaNaTiraz;
        for(int brojac=0;brojac<knigi.length;brojac++){
            if(knigi[brojac].getGoleminaNaKniga()<=maksGoleminaNaTiraz){
                System.out.println(knigi[brojac]);
            }
        }
    }
    public void getLokacija(){
        if(getIme().equals("1000 Knigi")){
            System.out.println("Kej 13ti Noemvri 8,Skopje 1000");
        }
        else if(getIme().equals("Brakja Miladinovci")){
            System.out.println("Bulevar Partizanski Odredi 22");
        }
        else if(getIme().equals("Jordan Hadzi Konstantinov Dzinot")){
            System.out.println("Ivan Hadzinikolov 6-a Lokacija 6");
        }
        else if(getIme().equals("Dom Na Kultura Ilinden")){
            System.out.println("Ulica 9,Naselba Ilinden Broj 12");
        }
    }
    public void najava(String username,String password){
        if(username==getUsername() && password==getPassword()){
            return getLokacija();
        }
    }
    public void patekaOdFakultetDoBiblioteka(String imeFaks,String imeBiblioteka){
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imeBiblioteka.equals("1000 Knigi")){
            if(getPateka().equals("Bulevar Partizanski Odredi")){
                System.out.println("Odete na Shekspirova do Bulevar Partizanski Odredi");
                System.out.println("Od Bulevar Partizanski Odredi odete do Bulevar Goce Delcev pa potoa odete do Kej 13ti Noemvri");
                System.out.println("Svrtete nadesno na Kej 13ti Noemvri");
            }
            else if(getPateka().equals("Bulevar Ilinden")){
                System.out.println("Odete do Nikola Tesla");
                System.out.println("Sledno odete od Bulevar Ilinden do Kej 13ti Noemvri");
                System.out.println("Svrtete nadesno na Kej 13ti Noemvri");
            }
            else if(getPateka().equals("Orce Nikolov")){
                System.out.println("Odete do Nikola Tesla");
                System.out.println("Svrtete nalevo na prvata raskrsnica");
                System.out.println("Svrtete nadesno na Orce Nikolov");
                System.out.println("Odete po Bulevar Goce Delcev i Filip Vtori Makedonski do Kej 13ti Noemvri");
                System.out.println("Svrtete nadesno na Kej 13ti Noemvri");
            }
        }
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imeBiblioteka.equals("Gradska Biblioteka Brakja Mildainovci")){
            if(getPateka().equals("Orce Nikolov")){
                System.out.println("Upatete se zapadno na Rugjer Boskovic");
                System.out.println("Svrtete nadesno");
                System.out.println("Svrtete nadesno na Nikola Tesla");
                System.out.println("Svrtete nalevo na prvata raskrsnica");
                System.out.println("Svrtete nadesno na Orce Nikolov");
                System.out.println("Svrtete nadesno na Miroslav Krlezha");
                System.out.println("Svrtete nadesno na Antonie Grubishikj");
            }
        }
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imeBiblioteka.equals("Jordan Hadzi Konstantinov Dzinot")){
            if(getPateka().equals("Bulevar 3ta Makedonska Brigada")){
                System.out.println("Odete po Shekspirova do Bulevar Partizanski Odredi");
                System.out.println("Odete po Mitropolit Teodosij Gologanov,Jordan Mijalkov,Bulevar 3ta Makedonska Brigada,Bulevar 12ta Makedonska Brigada i Justinijan Prvi do Ivan Hadzinikolov vo Dracevo");
            }
            else if(getPateka().equals("Bulevar Partizanski Odredi i Bulevar 3ta Makedonska Brigada") || getPateka().equals("Bulevar 3ta Makedonska Brigada i 1523")){
                System.out.println("Prodolzete do Nikola Tesla");
                System.out.println("Odete po Mitropolit Teodosij Gologanov,Jordan Mijalkov,Bulevar 3ta Makedonska Brigada,Bulevar 12ta Makedonska Brigada i Justinijan Prvi do Ivan Hadzinikolov vo Dracevo");
            }
        }
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) &&imeBiblioteka.equals("Dom na Kultura - Ilinden")){
            if(getPateka().equals("Bulevar Aleksandar Makedonski")){
                System.out.println("Odete po bulevar 8-mi Septemvri do Bulevar Nikola Karev");
                System.out.println("Odete posle po bulevar Aleksandar Makedonski do Opshtina Ilinden");
                System.out.println("Izlezete od A2");
                System.out.println("Odete od ulica 2 do ulica 9");
            }
        }
    }
    public boolean vrabotuvanjeNaStudentot(StudentiKoiTrebaDaSeNavigiraat student){
        String ime;
        boolean prvTest=false;
        if(ime.equals(student.getImePrezime())){
            prvTest=true;
        }
        String prezime;
        boolean vtorTest=false;
        if(prezime.equals(student.getImePrezime())){
           vtorTest=true;
        }
        int godiniNaKandidatot;
        boolean tretTest=false;
        if(godiniNaKandidatot==student.getGodini()){
            tretTest=true;
        }
        int [] proseciOdSrednoObrazovanie=new int[4];
        boolean cetvrtTest=false;
        int inkrement=0;
        for(int brojac=0;brojac<4;brojac++){
            if(proseciOdSrednoObrazovanie[brojac]==student.getProseciOdSrednoObrazovanie(brojac)){
                inkrement++;
            }
        }
        if(inkrement==4){
            cetvrtTest=true;
        }
        String [] referenci=new String[100];
        boolean pettiTest=false;
        int counter=0;
        for(int brojac=0;brojac<referenci.length;brojac++){
            if(referenci[brojac].equals(student.getReferenci(brojac))){
                counter++;
            }
        }
        if(counter==referenci.length){
            pettiTest=true;
        }
        boolean daliJaDobilRabotata=false;
        if(prvTest==true && vtorTest==true && tretTest==true && cetvrtTest==true && pettiTest==true) {
            daliJaDobilRabotata = true;
        }
        return daliJaDobilRabotata;
    }
    public int checkSupplies(String [] knigiNaPoracka,String [] knigi){
        int brojNaKnigiNaPoracka=0;
        for(int brojac=0;brojac<knigiNaPoracka.length;brojac++){
            if(!knigiNaPoracka[brojac].equals(getKnigiNaPoracka(brojac))){
                knigi[brojac].equals(knigiNaPoracka[brojac]);
                brojNaKnigiNaPoracka++;
            }
        }
        return brojNaKnigiNaPoracka;
    }
    public void odBibliotekaDoKopirnica(String ime,Knizarnici kopirnica){
        if(ime.equals("1000 Knigi")){
            if(kopirnica.getIme().equals("Impegna")){
                if(getPateka().equals("Bulevar Partizanski Odredi")){
                    System.out.println("Upatete se jugoistocno na Kej 13ti Noemvri kon Filip Vtori Makedonski");
                    System.out.println("Svrtete levo na prvata raskrsnica na Filip Vtori Makedonski");
                    System.out.println("Svrtete nalevo na Bulevar Goce Delcev");
                    System.out.println("Blago svrtete nalevo na Bulevar Blaze Koneski");
                    System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                    System.out.println("Prodolzete pravo");
                    System.out.println("Svretet nalevo na Franklin Ruzvelt");
                }
                else if(getPateka().equals("Mitropolit Teodosij Gologanov")){
                    System.out.println("Upatete se jugoistocno na Kej 13ti Noemvri kon Filip Vtori Makedonski");
                    System.out.println("Svrtete desno na prvata raskrsnica na Filip Vtori Makedonski");
                    System.out.println("Svrtete nadesno na 11ti Oktomvri");
                    System.out.println("Blago svrtete nalevo na Dimitrie Cupovski");
                    System.out.println("Prodolzete na Mitropolit Teodosij Gologanov");
                    System.out.println("Na kruzniot tek,odete na vtoriot izlez i ostanete na mitropolitot");
                    System.out.println("Svrtete nadesno na Franklin Ruzvelt");
                }
                else if(getPateka().equals("Naroden Front")){
                    System.out.println("Upatete se jugoistocno na Kej 13ti Noemvri kon Filip Vtori Makedonski");
                    System.out.println("Prodolzete na Filip Vtori Makedonski. Odete po Dimitrie Cupovski do Naroden Front");
                    System.out.println("Sledete go Naroden Front do Franklin Ruzvelt");
                    System.out.println("Svrtete nadesno na Franklin Ruzvelt");
                }
            }
        }
        else if(ime.equals("Brakja Miladinovci")){
            if(kopirnica.getIme().equals("Ekvus")){
                if(getPateka().equals("Orce Nikolov")){
                    System.out.println("Upatete se severoistocni na Antonie Grubisik koon ulica Debarca");
                    System.out.println("Antonie Grubisikj vrti nalevo i stanuva Oton Zupancikj");
                    System.out.println("Svrtete nadesno na Zivko Cingo");
                    System.out.println("Svrtete nalevo na Orce Nikolov");
                    System.out.println("Svrtete nalevo na Nikola Tesla");
                    System.out.println("Svretete nadesno na Veselin Maslesha");
                }
                else if(getPateka().equals("Bulevar Partizanski Odredi")){
                    System.out.println("Odete po Orce Nikolov i Kosturski Heroi do Bulevar Partizanski Odredi");
                    System.out.println("Prodolzete na Bulevar Partizanski Odredi do Veselin Maslesha");
                    System.out.println("Svrtete nalevo na Veselin Maslesha");
                }
                else if(getPateka().equals("Orce Nikolov i Franklin Ruzvelt")){
                    System.out.println("Odete po Orce Nikolov do Franklin Ruzvelt");
                    System.out.println("Prodolzete po Franklin Ruzvelt di Veselin Maslesha");
                    System.out.println("Svrtete nalevo na Veselin Maslesha");
                }
            }
        }
        else if(ime.equals("Jordan Hadzi Konstantinov Dzinot")){
            if(kopirnica.getIme("Libro")){
                if(getPateka().equals("Boris Trajkovski")){
                    System.out.println("Odete po Boris Trajkovski do Drezdenska");
                    System.out.println("Svrtete nalevo na Drezdenska");
                }
                else if(getPateka().equals("Boris Trajkovski i Bulevar Srbija")){
                    System.out.println("Odete po Boris Trajkovski i Bulevar Srbija do 808");
                    System.out.println("Prodolzete po 808 do Bulevar Goce Delcev");
                    System.out.println("Prodolzete na Bulevar Goce Delcev.Odete po Bulevar Partizanski Odredi do Drezdenska");
                    System.out.println("Svrete nadesno na Drezdenska");
                }
            }
        }
        else if(ime.equals("Dom na Kultura Ilinden")){
            if(kopirnica.getIme("Sterna")){
                if(getPateka().equals("Bulevar Aleksandar Makedonski")){
                    System.out.println("Odete po ulica 2 i ulica 32 do a2");
                    System.out.println("Odete po Bulevar Aleksandar Makedonski i Bulevar Nikola Karev do Bulevar 8mi Septemvri");
                    System.out.println("Prodolzete na Bulevar 8mi Septemvri. Odete do Shekspirova");
                }
                else if(getPateka().equals("Bulevar Aleksandar Makedonski i Bulevar Partizanski Odredi")){
                    System.out.println("Odete po Ulica 2 i Ulica 32 do A2");
                    System.out.println("Odete po Bulevar Aleksandar Makedonski do Bulevar Krste Petkov Misirkov. Odete na izlezot kon centar od Bulevar Nikola Karev");
                    System.out.println("Prodolzete po Bulevar Krste Petkov Misirkov.Odete po Bulevar Goce Delcev i Bulevar Partizanski Odredi do Shekspirova");
                }
                else if(getPateka().equals("Bulevar Goce Delcev")){
                    System.out.println("Upatete se zapadno na Ulica 9 kon Ulica 8");
                    System.out.println("Svrtete nalevo na Ulica 2");
                    System.out.println("Odete po Ulica 34 do 102/Blagoja Stefkovski");
                    System.out.println("Blago svrtete nadesno na 102/Blagoja Stefkovski");
                    System.out.println("Odete po Pero Nakov do Kiro Gligorov");
                    System.out.println("Svrtete nadesno na Kiro Gligorov");
                    System.out.println("Prodolzete na 808 do Bulevar Goce Delcev");
                    System.out.println("Sledete po Bulevar Goce Delcev i Bulevar Partizanski Odredi do Shekspirova");
                    System.out.println("Blago svrtete nadesno na Shekspirova");
                }
            }
        }
    }
}

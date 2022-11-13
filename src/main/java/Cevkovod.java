public class Cevkovod<I,O>{
    private Filter<I,O> segashen;
    public Cevkovod(Filter<I,O> segashen){
        this.segashen=segashen;
    }
    <P> Cevkovod<I,P> cevka(Filter<O,P> nareden){
        return new Cevkovod<>(new Cevka<>(segashen,nareden));
    }
    <P> Cevkovod<I,P> vtoraCevka(Filter<O,P> nareden){
        return new Cevkovod<>(input->next.izvrshuvaj(segashen.izvrshuvaj(input)));
    }
    O procedura(I input){
        return segashen.izvrshuvaj(input);
    }
}

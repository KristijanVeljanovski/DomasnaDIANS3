public interface Filter<T>{
    T izvrshuvaj(T vnes);
    T izvrshuvajStudentskiDomKafic(T vnes);
    T izvrshuvajFakultetKopirnica(T vnes);
    T izvrshuvajFakultetBiblioteki(T vnes);
}

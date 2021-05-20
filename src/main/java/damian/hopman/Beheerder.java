package damian.hopman;

public class Beheerder {
    private String beheerdersnaam;
    private String wachtwoordbeheer;
    private String rechten;

    public Beheerder(String bbr, String wwb, String rtn){
        this.beheerdersnaam = bbr;
        this.wachtwoordbeheer = wwb;
        this.rechten = rtn;
    }
}

package staticmember;

public class StaticMember {

    public static void main(String[] args) throws Exception{

        AppLog al1 = new AppLog();
        al1.write(4202,"Napravljena je greska u kodu");
        
        AppLog al2 = new AppLog();
        
        al2.write(5241, "Napravljena je greska u interfejsu");
    }

}

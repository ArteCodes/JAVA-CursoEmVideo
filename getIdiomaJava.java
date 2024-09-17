import java.util.Locale;

public class Main {
    public static void main(String[] arg){
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma deste sistema é: " + idioma.getDisplayLanguage());
    }
    
}

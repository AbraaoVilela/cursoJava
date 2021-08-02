package fundamentos;

import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhor");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Abraao".toUpperCase();
        System.out.println(x);

        String y = "Bom dia Y"
                .replace("Y","Abraao")
                .toUpperCase()
                .concat(" Vilela").toUpperCase();
        System.out.println(y);
    }
}

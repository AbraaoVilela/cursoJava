package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // String é o valor imutavel
        System.out.println("Olá Galera".charAt(5));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Abraao";
        var sobrenome = "Vilela";
        var idade = 26;
        var salario = 1000.00;

        System.out.printf("Nome: %s %s", nome, sobrenome + "\n\n" );

        System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f por mês.", nome, sobrenome,idade,salario);

        String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f por mês.", nome, sobrenome,idade,salario);
        System.out.println(frase);
    }
}

package fundamentos;

public class TiposPrimitivos {

    //porta de entrada
    public static void main(String[] args) {
        //informações de funcionario

        //tipos numericos inteiros
        byte anosDeEmpresa = 24;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_233L;

        //tipos numericos reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false; // true

        // tipo caractere
        char status = 'A'; //ativo

        // dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status: " + status);
    }
}

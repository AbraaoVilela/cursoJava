package BancoCurso;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        primeiraConta.titular = "Rafael";
        System.out.println(primeiraConta.titular);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        System.out.println(primeiraConta.agencia);




        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        segundaConta.titular = "Bruno";

        System.out.println("O Nome do Titular é: " + segundaConta.titular + ", e o valor do seu saldo é: " + segundaConta.saldo);




    }

}

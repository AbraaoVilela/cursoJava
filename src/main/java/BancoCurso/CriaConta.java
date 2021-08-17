package BancoCurso;

public class CriaConta {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Rafael Junio","42590038879", 30, "12345789");

        Cliente cliente2 = new Cliente("Talita Linda","44857167832", 23, "12457896");

        Cliente cliente3 = new Cliente("Angel Correa","47857154789", 35, "99999999");

        System.out.println(" O Nome do Cliente é: " + cliente1.getNome());
        System.out.println(" O Nome do Cliente é: " + cliente2.getNome());
        System.out.println(" O Nome do Cliente é: " + cliente3.getNome());








    }
}
package BancoCurso;

public class Metodos {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        conta1.deposita(50);
        System.out.println(conta1.getSaldo());

        boolean conseguiuRetirar = conta1.saca(75);
        System.out.println(conta1.saldo);
        System.out.println(conseguiuRetirar);

        Conta conta2 = new Conta();
        conta2.deposita(1000);

        boolean transferenciaComSucesso = conta2.transfere(500,conta1);
        if(transferenciaComSucesso){
            System.out.println("Transferencia realizada com sucesso");
        }else {
            System.out.println("Faltou grana");
        }

        System.out.println("O Saldo da Conta1 : " + conta1.saldo);

        Cliente cliente1 = new Cliente("Rafael", "123456789", 35, "12457895");
        conta1.titular = cliente1;
        System.out.println(conta1.getTitular().getNome());

    }
}

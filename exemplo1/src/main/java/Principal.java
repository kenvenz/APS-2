public class Principal {

    public static void main(String[] args) {
        Banco b1 = new Banco("Raul", "0000", 15);
        Banco b2 = new Banco();
        Banco b3 = new Banco();

        System.out.println(b2.saldo);
        b2.saldo = 1000;
        System.out.println(b2.saldo);

        System.out.println(b3.getNome());
        b3.setNome("carlos");
        System.out.println(b3.getNome());
    }
}
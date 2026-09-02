public class Main1 {
    public static void main(String[] args) {
        Banco brasil = new Banco();
        brasil.setCodigo(1);
        brasil.setConta(1010);
        brasil.setAgencia(1520);
        brasil.setSaldo(100);
        brasil.setTipo("Corrente");

        System.out.println("Saldo após depósito: " + brasil.depositar(1000));
        System.out.println("Saldo após saque: " + brasil.sacar(500));

        pessoa p1 = new pessoa();
        p1.codigo = 1;
        p1.nome = "Caioba";
        p1.idade = 20;
        p1.cpf = "123";
        p1.getDados();

        pessoa p2 = new pessoa();
        p2.codigo = 2;
        p2.nome = "Karoline";
        p2.idade = 43;
        p2.cpf = "456";
        p2.getDados();
    }
}

public class bankTest {

    public static void main(String[] args) {

        BankAccount cliente = new BankAccount(1000.0 ,4333.0,100.0);
        BankAccount cliente2 = new BankAccount(4300.0,33.0,100.0);
        BankAccount cliente3 = new BankAccount(8400.0,20033.0,100.0);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);

        System.out.println(cliente.totalBalance());
        cliente.getCash(1,100000.0);

        System.out.println(BankAccount.getAccountsCounter());

    }

}

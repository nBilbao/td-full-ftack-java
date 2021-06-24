public class BankAccount {

    private final String numberAccount;
    private Double balanceCurrentAccount;
    private Double balanceSavingsAccount;
    private static Integer accountsCounter=0;
    private static Double money;

    public BankAccount( Double balanceCurrentAccount,Double balanceSavingsAccount ,Double money) {

        this.balanceCurrentAccount = balanceCurrentAccount;
        this.balanceSavingsAccount = balanceSavingsAccount;
        this.numberAccount = randomNumberAccount();
        accountsCounter++;
        setMoney(money);

    }

    public String randomNumberAccount(){
        String number="";

        for (int i = 0; i < 10; i++) {
            number+=(int)(Math.random()*9);

        }

        return number;
    }

    public void getCash(int account,Double monto){

        if(account==1 && getBalanceCurrentAccount()>0 && getBalanceCurrentAccount()>=monto){

            addBalanceCurrentAccount(getBalanceCurrentAccount()-monto);

        }
        else if(account==2 && getBalanceSavingsAccount()>0 && getBalanceSavingsAccount()>=monto){

            addBalanceSavingsAccount(getBalanceSavingsAccount()-monto);
        }
        else{
            System.out.println("saldo insuficiente");
        }

    }
    public double totalBalance(){
        return getBalanceCurrentAccount()+getBalanceSavingsAccount();
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public Double getBalanceCurrentAccount() {
        return balanceCurrentAccount;
    }

    public void addBalanceCurrentAccount(Double cash) {
        balanceCurrentAccount = getBalanceCurrentAccount()+cash;
    }

    public Double getBalanceSavingsAccount() {
        return balanceSavingsAccount;
    }

    public void addBalanceSavingsAccount(Double cash) {
        balanceSavingsAccount = getBalanceSavingsAccount() + cash;
    }

    public static Integer getAccountsCounter() {
        return accountsCounter;
    }

    public static Double getMoney() {
        return money;
    }

    public static void setMoney(Double money) {
        BankAccount.money = money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "numberAccount='" + numberAccount + '\'' +
                ", balanceCurrentAccount=" + balanceCurrentAccount +
                ", balanceSavingsAccount=" + balanceSavingsAccount +
                '}';
    }
}

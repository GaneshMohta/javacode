package placement;
class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
    public void close() {
        System.out.println("Account closed.");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}

public class inheritance_challenge1 {
    public static void main(String args[]) {
        Account m = new Account("d111", "loppw", "kjeo202ss", "9290003030", "12-01-2004");

        // SavingsAccount savingsAccount = new SavingsAccount("s111", "John", "Address1", "1234567890", "01-01-2000");
        // LoanAccount loanAccount = new LoanAccount("l111", "Jane", "Address2", "9876543210", "02-02-1995");
        m.close();

    }
}

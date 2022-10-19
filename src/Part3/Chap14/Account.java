package Part3.Chap14;

public class Account {
    String accountNumber;
    int balance;
    public String toString() {
        return "￥" + balance + "(口座番号：" + accountNumber + ")";
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Account) {
            Account a = (Account) o;
            String an1 = this.accountNumber.trim();
            String an2 = this.accountNumber.trim();
            if (an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }
}

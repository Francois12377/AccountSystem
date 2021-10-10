package za.ac.nwu.ac.main.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "account-transaction", schema = "accounttype")
public class AccountTransaction implements Serializable{
    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ" , sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private int transactionid;

    private AccountType Accountid;

    private int Memberid;

    private int Amount;

    private LocalDate transactionDate;

    public AccountTransaction(int transactionid, AccountType accountid, int memberid, int amount, LocalDate transactionDate) {
        this.transactionid = transactionid;
        this.Accountid = accountid;
        this.Memberid = memberid;
        this.Amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTransaction() {}
    @Column(name = "TRANSID")
    public int getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNTID")
    public AccountType getAccountid() {
        return Accountid;
    }

    public void setAccountid(AccountType accountid) {
        Accountid = accountid;
    }
    @Column(name = "MEMBERID")
    public int getMemberid() {
        return Memberid;
    }

    public void setMemberid(int memberid) {
        Memberid = memberid;
    }
    @Column(name = "AMOUNT")
    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
    @Column(name = "TRANSDATE")
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionid, that.transactionid) && Objects.equals(Accountid, that.Accountid) && Objects.equals(Memberid, that.Memberid) && Objects.equals(Amount, that.Amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionid, Accountid, Memberid, Amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionid=" + transactionid +
                ", Accountid=" + Accountid +
                ", Memberid=" + Memberid +
                ", Amount=" + Amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}

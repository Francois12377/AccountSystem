package za.ac.nwu.ac.main.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "DEMO-ACCOUNT", schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable{
    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ" , sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private Long transactionid;

    private Long Accountid;

    private Long Memberid;

    private Long Amount;

    private LocalDate transactionDate;

    public AccountTransaction(Long transactionid, Long accountid, Long memberid, Long amount, LocalDate transactionDate) {
        this.transactionid = transactionid;
        this.Accountid = accountid;
        this.Memberid = memberid;
        this.Amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTransaction() {
    }
    @Column(name = "TRANSID")
    public Long getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Long transactionid) {
        this.transactionid = transactionid;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNTID")
    public Long getAccountid() {
        return Accountid;
    }

    public void setAccountid(Long accountid) {
        Accountid = accountid;
    }
    @Column(name = "MEMBERID")
    public Long getMemberid() {
        return Memberid;
    }

    public void setMemberid(Long memberid) {
        Memberid = memberid;
    }
    @Column(name = "AMOUNT")
    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long amount) {
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

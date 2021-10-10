package za.ac.nwu.ac.main.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "demo-account", schema = "accounttype")
public class AccountType implements Serializable{

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ" , sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")


    private AccountType accountTypeID;
    private String mnemonic;
    private String AccountTypeName;
    private LocalDate CreationDate;

    private Set<AccountTransaction> accountTransactions;

    public AccountType(AccountType accountTypeID, String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.accountTypeID = accountTypeID;
        this.mnemonic = mnemonic;
        AccountTypeName = accountTypeName;
        CreationDate = creationDate;
    }

    public AccountType() {
    }

    @Column(name = "ACCOUNTTYPEID")
    public AccountType getAccountTypeID() {
        return accountTypeID;
    }

    public void setAccountTypeID(AccountType accountTypeID) {
        this.accountTypeID = accountTypeID;
    }
    @Column(name = "MNEMONIC")
    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }
    @Column(name = "ACCOUNT_TYPE_NAME")
    public String getAccountTypeName() {
        return AccountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        AccountTypeName = accountTypeName;
    }
    @Column(name = "CREATIONDATE")
    public LocalDate getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        CreationDate = creationDate;
    }

    @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "Accountid", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<AccountTransaction> getAccountTransactions(){
        return accountTransactions;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountTypeID, that.accountTypeID) && Objects.equals(mnemonic, that.mnemonic) && Objects.equals(AccountTypeName, that.AccountTypeName) && Objects.equals(CreationDate, that.CreationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeID, mnemonic, AccountTypeName, CreationDate);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeID=" + accountTypeID +
                ", mnemonic='" + mnemonic + '\'' +
                ", AccountTypeName='" + AccountTypeName + '\'' +
                ", CreationDate=" + CreationDate +
                '}';
    }
}

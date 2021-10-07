package za.ac.nwu.ac.main.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "DEMO-ACCOUNT", schema = "VITRSA_SANDBOX")
public class AccountType implements Serializable{

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ" , sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "ACCOUNTTYPEID")
    private Long accountTypeID;

    @Column(name = "MNEMONIC")
    private String mnemonic;

    @Column(name = "ACCOUNT_TYPE_NAME")
    private String AccountTypeName;

    @Column(name = "CREATIONDATE")
    private LocalDate CreationDate;

}

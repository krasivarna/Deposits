package _05;

import javax.persistence.*;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    public User(String userName, AccountType type) {
        this.userName = userName;
        this.type = type;
    }

    public User(){

    }
}

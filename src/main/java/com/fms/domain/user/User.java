package com.fms.domain.user;

import com.fms.domain.BaseEntity;
import com.fms.domain.faxnumberuser.FaxnumberUser;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @NoArgsConstructor
@Entity
public class User extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 60, unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<FaxnumberUser> faxnumberUserList = new ArrayList<>();

    @Builder
    public User(String name, String email, Role role){
        this.name = name;
        this.email = email;
        this.role = role;
    }
}

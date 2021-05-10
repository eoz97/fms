package com.fms.domain.faxnumber;

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
public class Faxnumber extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="faxnumber_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String number;

    @Column(length = 100)
    private String description;

    @OneToMany(mappedBy = "faxnumber")
    private List<FaxnumberUser> faxnumberUserList = new ArrayList<>();

    @Builder
    public Faxnumber(String number, String description){
        this.number = number;
        this.description = description;
    }

    public void update(String number, String description){
        this.number = number;
        this.description = description;
    }
}

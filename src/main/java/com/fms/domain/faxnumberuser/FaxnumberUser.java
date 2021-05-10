package com.fms.domain.faxnumberuser;

import com.fms.domain.BaseEntity;
import com.fms.domain.faxnumber.Faxnumber;
import com.fms.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter @NoArgsConstructor
@Entity
public class FaxnumberUser extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="faxnumber_id")
    private Faxnumber faxnumber;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    @Builder
    public FaxnumberUser(Faxnumber faxnumber, User user){
        this.faxnumber = faxnumber;
        this.user = user;
    }

}

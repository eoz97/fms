package com.fms.domain.faxnumber;

import com.fms.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

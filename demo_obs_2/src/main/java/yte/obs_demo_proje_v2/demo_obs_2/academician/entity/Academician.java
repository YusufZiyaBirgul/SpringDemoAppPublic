package yte.obs_demo_proje_v2.demo_obs_2.academician.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import yte.obs_demo_proje_v2.demo_obs_2.common.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
public class Academician extends BaseEntity {


    private String name;
    private String surname;
    private String username;
    private String password;

    public Academician(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public void update(Academician updateAcademician) {
        this.name = updateAcademician.name;
        this.surname = updateAcademician.surname;
        this.password = updateAcademician.password;
    }
}

package yte.obs_demo_proje_v2.demo_obs_2.assistant.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import yte.obs_demo_proje_v2.demo_obs_2.common.entity.BaseEntity;
import yte.obs_demo_proje_v2.demo_obs_2.student.entity.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@Getter
public class Assistant extends BaseEntity {


    private String name;
    private String surname;
    private String username;
    private String password;


    //@ManyToMany
    //@JoinColumn(name = "student_id")
    //private Set<Book> books = new HashSet<>();


    public Assistant() {
    }

    public Assistant(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public void update(Assistant updateAssistant) {
        this.name = updateAssistant.name;
        this.surname = updateAssistant.surname;
        this.password = updateAssistant.password;
    }
}


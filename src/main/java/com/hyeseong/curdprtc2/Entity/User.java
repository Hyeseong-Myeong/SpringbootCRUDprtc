package com.hyeseong.curdprtc2.Entity;

import com.hyeseong.curdprtc2.Entity.enums.Session;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @Column(nullable = false)
    private String name;

    @Column
    private Session sessionType;

    @Builder
    public User (String name, Session sessionType){
        this.name = name;
        this.sessionType = sessionType;
    }
}

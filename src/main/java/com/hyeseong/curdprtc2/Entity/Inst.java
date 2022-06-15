package com.hyeseong.curdprtc2.Entity;

import com.hyeseong.curdprtc2.Entity.enums.Session;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Inst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long InstId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private User user;

    @Column
    private Session session;

    @Column
    private Boolean isUsing;

    @Builder
    public Inst(String name, User user, Session session, Boolean isUsing){
        this.name = name;
        this.user = user;
        this.session = session;
        this.isUsing = isUsing;
    }
}

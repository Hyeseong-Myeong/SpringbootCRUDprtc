package com.hyeseong.curdprtc2.DTO;

import com.hyeseong.curdprtc2.Entity.User;
import com.hyeseong.curdprtc2.Entity.enums.Session;
import lombok.Data;

@Data
public class UserCreationDTO {
    private String name;
    private Session session;


    public User toEntity(){
        return User.builder().name(name).sessionType(session).build();
    }

}

package com.hyeseong.curdprtc2.DTO;

import com.hyeseong.curdprtc2.Entity.Inst;
import com.hyeseong.curdprtc2.Entity.User;
import com.hyeseong.curdprtc2.Entity.enums.Session;
import lombok.Data;

@Data
public class InstCreationDTO {
    private String instName;
    private Session session;
    private User user;
    private Boolean isUsing;

    public Inst toEntity(){
        return Inst.builder().name(instName).session(session).user(user).isUsing(isUsing).build();
    }
}

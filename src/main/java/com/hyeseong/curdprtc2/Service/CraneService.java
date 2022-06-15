package com.hyeseong.curdprtc2.Service;

import com.hyeseong.curdprtc2.DTO.InstCreationDTO;
import com.hyeseong.curdprtc2.DTO.UserCreationDTO;
import com.hyeseong.curdprtc2.Entity.Inst;
import com.hyeseong.curdprtc2.Entity.User;
import com.hyeseong.curdprtc2.Repository.InstRepository;
import com.hyeseong.curdprtc2.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CraneService {

    private final UserRepository userRepository;
    private final InstRepository instRepository;

    @Transactional
    public Long CreateUser(UserCreationDTO dto){
        return userRepository.save(dto.toEntity()).getUserId();
    }

    @Transactional(readOnly = true)
    public List<User> findAllUser(){
        return userRepository.findAll().stream().toList();
    }

    @Transactional
    public User findUser(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser != null){
            return optionalUser.get();
        }

        throw new EntityExistsException("User no exist on DB");
    }

    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @Transactional
    public Long CreateInst(InstCreationDTO dto){
        return instRepository.save(dto.toEntity()).getInstId();
    }

    @Transactional(readOnly = true)
    public List<Inst> findAllInst(){
        return instRepository.findAll().stream().toList();
    }

    @Transactional
    public Inst findInst(Long id){
        Optional<Inst> optionalInst = instRepository.findById(id);
        if(optionalInst.isPresent()){
            return optionalInst.get();
        }

        throw new EntityExistsException("Inst is not Exist on DB");
    }


    @Transactional
    public void deleteInst(Long id){
        instRepository.deleteById(id);
    }

}

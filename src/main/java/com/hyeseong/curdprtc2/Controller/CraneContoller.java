package com.hyeseong.curdprtc2.Controller;

import com.hyeseong.curdprtc2.DTO.InstCreationDTO;
import com.hyeseong.curdprtc2.DTO.UserCreationDTO;
import com.hyeseong.curdprtc2.Entity.User;
import com.hyeseong.curdprtc2.Service.CraneService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor

public class CraneContoller {

    private final CraneService craneService;

    @GetMapping("/Hello")
    public String hello(){
        return "Hello, Welcome to CRANE";
    }

    @GetMapping("/user")
    public ResponseEntity userList(){
        return ResponseEntity.ok(craneService.findAllUser());
    }

    @GetMapping("/Inst")
    public ResponseEntity InstList(){
        return ResponseEntity.ok(craneService.findAllInst());
    }

    @PostMapping("/user")
    public void createUser(@RequestBody UserCreationDTO dto){
        craneService.CreateUser(dto);
    }

    @PostMapping("/inst")
    public void createInst(@RequestBody InstCreationDTO dto){
        craneService.CreateInst(dto);
    }

    @GetMapping("/user/{id}")
    public void readUser(@PathVariable Long id){
        craneService.findUser(id);
    }

    @GetMapping("/inst/{id}")
    public void readInst(@PathVariable Long id){
        craneService.findInst(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        craneService.deleteUser(id);
    }

    @DeleteMapping("/inst/{id}")
    public void deleteInst(@PathVariable Long id){
        craneService.deleteInst(id);
    }
}

package com.lijing.linuxgit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: GitController
 * Package: com.lijing.linuxgit.controller
 * Author: LiJing
 * CreateTime: 2018年06月13日 16:11
 * Description:
 */
@RestController
public class GitController {


    @GetMapping("/get-data")
    public ResponseEntity<String> getData(){
        return ResponseEntity.ok("Success");
    }
}




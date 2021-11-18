package com.ff.controller;

import com.ff.domain.Result;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:52
 */

@RestController
@RequestMapping("/bank")
public class BankController {

    @DeleteMapping("/account")
    Result cutPat(){
return null;
    }
}

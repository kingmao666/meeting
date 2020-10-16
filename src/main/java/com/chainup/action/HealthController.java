package com.chainup.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QX
 * @date 2020/10/16
 */
@Slf4j
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health(){
        log.info("OOOOOOOOOOOKKKKKKKKKKKKKKKKKKK");
        return "你瞅啥？？？？？？？？？？？？";
    }
}

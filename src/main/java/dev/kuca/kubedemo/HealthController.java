package dev.kuca.kubedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String health(){
        int unhealth = 0;
        String rate = System.getenv("UNHEALTH_RATE");
        if (rate!=null)
            unhealth = Integer.parseInt(rate);

        int rnd = new Random().nextInt(100);
        if (unhealth < rnd)
            return "healthy " + rnd + " unhealth.rate: " + unhealth;
        else {
            throw new RuntimeException("unheath up " + rnd + " unhealth.rate: " + unhealth);
        }
    }


}

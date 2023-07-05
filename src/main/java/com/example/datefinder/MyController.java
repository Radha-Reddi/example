package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String getHunDays(){
        LocalDate dt=LocalDate.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        dt=dt.plusDays(100);
        String res=dt.format(f);
        return res;


    }
}

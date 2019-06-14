package dev.kuca.kubedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo/**")
public class DemoController {

    @Value("${demo.var}")
    String demoVar;

    @GetMapping
    public String demo(HttpServletRequest request){
        StringBuilder sb = new StringBuilder();
        sb.append("calling: ");
        sb.append("Method:").append(request.getMethod()).append("\n");
        sb.append("Path:").append(request.getServletPath()).append("\n");
        sb.append("Param UNHEALTH_RATE:").append(System.getenv("UNHEALTH_RATE")).append("\n");
        sb.append("demo.var :").append(demoVar).append("\n");
        return sb.toString();
    }


}

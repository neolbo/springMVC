package hello.typeconverter.controller;


import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam Integer data) {
        log.info("data = {}", data);
        System.out.println("data : " + data);
        return "ok";
    }

    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        System.out.println(ipPort.getIp());
        System.out.println(ipPort.getPort());
        return "ok";
    }
}

package io.javabytes.transfers.me2metransfers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfers")
public class TransfersResource {

@GetMapping("/hello")
 public String getMessage(){
    return "hello transfers";
 }

}

package com.csi.controller;

import com.csi.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class CustomerController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return  ResponseEntity.ok("WELCOME TO FINTECH CSI");
    }
    @GetMapping("/service")
    public ResponseEntity<String> sayService(){
        return  ResponseEntity.ok("Software Service | Software Development");
    }
    @GetMapping("/gelalldata")
    public ResponseEntity<List<Customer>> getAllData(){
        return  ResponseEntity.ok(Stream.of(new Customer(111,"Dhanu","Pune",54000,2645588785L),
                new Customer(112,"Rahul","Nashik",84000,2855588785L),
                new Customer(113,"Suraj","Dehu",64000,2662588785L),
                new Customer(114,"Vedant","Pcmc",34000,2255588785L),
                new Customer(115,"Ram","USA",14000,6645588785L)).collect(Collectors.toList()));
    }
}

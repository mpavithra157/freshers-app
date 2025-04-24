package com.cg.freshers;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/api")
public class DerivedDataController {
 
    @GetMapping("/validate")
    public boolean validate(
            @RequestParam String attr,
            @RequestParam String value,
            @RequestParam String operator) {
 
        DerivedData derivedData = new DerivedData();
        derivedData.init();
        return derivedData.validateOperator(attr, value, operator);
    }
}
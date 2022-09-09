package com.lastesteam.portalsgie.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {
@GetMapping("/enterprises")
public String Enterprise(){
    return "Estamos Trabajando para visualizar la información en esta página.";
}
}

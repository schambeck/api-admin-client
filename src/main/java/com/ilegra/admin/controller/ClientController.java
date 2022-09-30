package com.ilegra.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clients")
class ClientController {

  @GetMapping
  ResponseEntity<?> findAll() {
    return ResponseEntity.ok().build();
  }

}

package com.puce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class indexController {


@Controller
public class IndexController {

    @GetMapping("/home")
    public String mostrarIndex(){
        return "index.html";
    }}};
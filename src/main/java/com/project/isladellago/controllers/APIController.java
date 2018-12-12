/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.isladellago.controllers;

import com.project.isladellago.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camilo
 */
@RestController
@RequestMapping(value = "/template")
public class APIController {

    @Autowired
    Services services;
    
}

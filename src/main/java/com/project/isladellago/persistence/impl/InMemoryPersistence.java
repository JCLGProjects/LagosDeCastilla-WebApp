/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.isladellago.persistence.impl;

import com.project.isladellago.model.ModelRespository;
import com.project.isladellago.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camilo
 */
@Service
public class InMemoryPersistence implements Persistence{
    
    @Autowired
    ModelRespository mRepository;
    
}

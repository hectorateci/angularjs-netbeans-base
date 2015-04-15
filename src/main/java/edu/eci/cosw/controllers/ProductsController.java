/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.controllers;

import edu.eci.cosw.samples.model.Producto;
import java.util.LinkedList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping("/products")
public class ProductsController {
    
    @RequestMapping(value="/check",method = RequestMethod.GET)        
    public String check() {
        return "REST API OK";        
    }
    
    @RequestMapping(method = RequestMethod.POST)        
    public ResponseEntity<?> addProduct(@RequestBody Producto p) {       
        dummyProductsData.add(p);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    
    @RequestMapping(method = RequestMethod.GET)        
    public List<Producto> allProducts() {       
        return dummyProductsData;
    }
    

    private static final List<Producto> dummyProductsData=new LinkedList<>();
    
    static{
        dummyProductsData.add(new Producto(1,"producto 1",100));
        dummyProductsData.add(new Producto(2,"producto 2",200));
        dummyProductsData.add(new Producto(3,"producto 3",300));
        dummyProductsData.add(new Producto(4,"producto 4",400));
    }
    
}


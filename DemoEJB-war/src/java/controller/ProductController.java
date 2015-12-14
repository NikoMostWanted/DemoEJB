/*
 * To change this license header, choose License Headers in Project Properties.
 * To cange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import demo.ProductSessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import java.util.*;
import entities.*;

/**
 *
 * @author niko
 */
@Named(value = "productController")
@SessionScoped
public class ProductController implements Serializable {

    @EJB
    private ProductSessionBean productSessionBean;

   
    public ProductController() {
    }
    
    public Product find() {
        return this.productSessionBean.find();
    }
    
    public List<Product> findAll() {
        return this.productSessionBean.findAll();
    }
}

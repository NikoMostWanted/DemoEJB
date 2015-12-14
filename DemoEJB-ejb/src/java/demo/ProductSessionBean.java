/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import java.util.*;
import entities.*;

/**
 *
 * @author niko
 */
@Stateless
@LocalBean
public class ProductSessionBean {

    public Product find() {
        return new Product("1","Niko",1000);
    }
    
    public List<Product> findAll() {
        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(new Product("1","Niko",1000));
        listProduct.add(new Product("2","Sam",2000));
        listProduct.add(new Product("3","Joe",3000));
        listProduct.add(new Product("4","Carl",4000));
        return listProduct;
    }
}

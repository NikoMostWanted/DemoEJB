/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author niko
 */
@Stateless
@LocalBean
public class HelloSessionBean {

    public String hello(String name) {
        return "Hello "+name;
    }
    
    public Integer calculate(int a, String sign, int b) {
        if(sign.equals("+")){
            return a+b;
        }
        else if(sign.equals("-")) {
            return a-b;
        }
        else if(sign.equals("*")) {
            return a*b;
        }
        else if(sign.equals("/")) {
            return a/b;
        }
        return null;
    }
}

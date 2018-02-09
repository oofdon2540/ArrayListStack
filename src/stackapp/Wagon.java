/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

/**
 *
 * @author yo
 */
public class Wagon {
    private String product;
    
    public Wagon(String product){
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
    @Override
    public String toString(){
        return product + " ";
    }
}

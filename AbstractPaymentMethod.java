/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Asus X452C
 */

public abstract class AbstractPaymentMethod implements PaymentMethod {
    protected String userId;
    
    public void authenticateUser(String userId) {
        this.userId = userId;
        System.out.println("User " + userId + " authenticated.");
    }
    
    public abstract void processPayment(double amount);
    
    public void completeTransaction() {
        System.out.println("Transaction completed.");
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Asus X452C
 */
interface PaymentMethod {

    public void authenticateUser(String user123);

    public void processPayment(double d);

    public void completeTransaction();
    
}

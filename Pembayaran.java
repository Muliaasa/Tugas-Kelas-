/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Asus X452C
 */
public class Pembayaran {
    // Interface untuk metode pembayaran
public interface PaymentMethod {
    void authenticateUser(String userId);
    void processPayment(double amount);
    void completeTransaction();
}

}

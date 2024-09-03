/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Asus X452C
 */
public class PaypalPayment {
    // Kelas untuk metode pembayaran Kartu Kredit
public class CreditCardPayment extends AbstractPaymentMethod {
    private String creditCardNumber;
    
    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Implementasi spesifik untuk pemrosesan kartu kredit
    }
}

// Kelas untuk metode pembayaran PayPal
public class PayPalPayment extends AbstractPaymentMethod {
    private String paypalAccount;

    public PayPalPayment(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Implementasi spesifik untuk pemrosesan PayPal
    }
}

}

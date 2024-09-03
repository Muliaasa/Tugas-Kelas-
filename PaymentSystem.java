/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Asus X452C
 */
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment("1234-5678-9876-5432");
        creditCard.authenticateUser("user123");
        creditCard.processPayment(100.0);
        creditCard.completeTransaction();
        
        PaymentMethod paypal = new PaypalPayment("user123@example.com");
        paypal.authenticateUser("user123");
        paypal.processPayment(200.0);
        paypal.completeTransaction();
    }

    private static class CreditCardPayment implements PaymentMethod {

        public CreditCardPayment(String string) {
        }

        @Override
        public void authenticateUser(String user123) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void processPayment(double d) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void completeTransaction() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}



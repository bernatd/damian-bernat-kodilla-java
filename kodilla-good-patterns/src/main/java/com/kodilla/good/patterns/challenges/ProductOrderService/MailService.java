package com.kodilla.good.patterns.challenges.ProductOrderService;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Order confirmation has been sent to " + user.getName());
    }
}

package com.tts.ecommerce.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.ecommerce.model.ChargeRequest;

@Controller
public class CheckoutController {

    @Value("${pk_test_51ISSuYK06NYwlmr97azHanb9WT4I3Faxkj6Ho7WeLG89CgKYNYCaCH1K4yYt9pSoEBDRHuRdeJdcRwcSwFXvH73t00euHEMfZO}")
    private String stripePublicKey;

    @RequestMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("amount", 50 * 100); // in cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        model.addAttribute("currency", ChargeRequest.Currency.USD);
        return "checkout";
    }

}
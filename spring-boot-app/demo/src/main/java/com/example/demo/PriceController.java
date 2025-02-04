package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class PriceController {

    @GetMapping("/predict")
    public String predictPrice(
        @RequestParam int category,
        @RequestParam double demandScore) throws IOException {

        // Path to your Python script (adjust this!)
        String pythonScriptPath = "C:/Users/hp/OneDrive/Desktop/AI-Powered Price Prediction Project/AI model/price_model.py";

        // Execute Python script
        ProcessBuilder pb = new ProcessBuilder(
            "python", 
            pythonScriptPath, 
            String.valueOf(category), 
            String.valueOf(demandScore)
        );
        Process process = pb.start();

        // Read output
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(process.getInputStream())
        );
        String predictedPrice = reader.readLine();

        return "Predicted Price: $" + predictedPrice;
    }
}
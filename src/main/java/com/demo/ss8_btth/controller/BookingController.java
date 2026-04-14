package com.demo.ss8_btth.controller;

import com.demo.ss8_btth.model.dto.BookingDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Scanner;
@Controller
public class BookingController {
    @GetMapping("/booking")
    public String showForm(Model model) {
        model.addAttribute("bookingDto", new BookingDto());
        return "booking-form";
    }

    @PostMapping("/booking")
    public String submitForm(@Valid @ModelAttribute("bookingDto") BookingDto bookingDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "booking-form";
        }
        return "redirect:/success";
    }
}

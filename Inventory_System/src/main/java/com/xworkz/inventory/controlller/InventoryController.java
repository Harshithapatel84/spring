package com.xworkz.inventory.controlller;

import com.xworkz.inventory.dto.InventoryDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

    public InventoryController() {
        System.out.println("InventoryController object is created");}

    @PostMapping
    public String display(@Valid InventoryDTO inventoryDTO, BindingResult bindingResult, Model model) {
        System.out.println("Running display in InventoryController");
        System.out.println("inventoryDTO: " + inventoryDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("There are validation errors, fix them");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("inventoryDTO", inventoryDTO);
        } else {
            System.out.println("No validation errors, continue");
            model.addAttribute("inventoryDTO", new InventoryDTO());
            model.addAttribute("message", "Inventory details saved");
        }

        return "inventory";
    }
}

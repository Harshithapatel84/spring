package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.ProductDTO;
import com.xworkz.monitor.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductComponent {

    public ProductComponent() {
        System.out.println("product component is created");
    }

    @Autowired
    private ProductService productService;

    @RequestMapping("/product")
    public String product(ProductDTO productDTO, Model model) {

        System.out.println("running product in product component");
        System.out.println("productDTO: " + productDTO);
        model.addAttribute("message", "Product details saved");
        this.productService.validateAndSave(productDTO);
        return "/product.jsp";
    }
}
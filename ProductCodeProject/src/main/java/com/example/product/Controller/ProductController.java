package com.example.product.Controller;

import com.example.product.Entities.Product;
import com.example.product.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
     private IProductService productService;

        // display list of employees
        @GetMapping("/")
        public String viewHomePage(Model model) {
            List<Product> listproduct = new ArrayList<>();

            listproduct = productService.getAll();
            model.addAttribute("listproducts",listproduct);
            return "Index";
        }

    @GetMapping("/add_product")
        public String showNewEmployeeForm(Model model) {
            // create model attribute to bind form data
            Product product = new Product();
            model.addAttribute("product", product);

        List<Product> listproduct = new ArrayList<>();

        listproduct = productService.getAll();
        model.addAttribute("listproducts",listproduct);

            return "add_product";
        }

        @PostMapping("/saveProduct")
        public String saveProduct(@ModelAttribute("product") Product product) {
            // save Product to database
            productService.Save(product);
            return "redirect:/";
        }

         @GetMapping("/deleteProduct/{id}")
        public String deleteProduct(@PathVariable(value = "id") long id) {

        // call delete employee method
        this.productService.deleteProductById(id);
        return "redirect:/";
        }

}

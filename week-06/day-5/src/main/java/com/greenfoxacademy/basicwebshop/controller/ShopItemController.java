package com.greenfoxacademy.basicwebshop.controller;

import com.greenfoxacademy.basicwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {

    List<ShopItem> shopItems = new ArrayList<>();

    public ShopItemController() {
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice with WOKIN sauce", 119.0, 100));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));

    }

    @GetMapping("/webshop")
    public String helloWorld() {
        return "index";
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "webshop";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("shopItems", getQuantityOfStock());
        return "webshop";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("shopItems", getCheapestFirst());
        return "webshop";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("shopItems", getNike());
        return "webshop";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        OptionalDouble asd = getAverage();
        if (asd.isPresent()) {
            model.addAttribute("text", "Average Stock: ");
            model.addAttribute("value", asd.getAsDouble());
            return "filtered";
        } else {
            model.addAttribute("text", "Average Stock: ");
            model.addAttribute("value", "Out of stock!");
            return "filtered";
        }
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        Optional<ShopItem> mostExpensiveItem = getMostExpensive();
        if (mostExpensiveItem.isPresent()) {
            model.addAttribute("text", "Most expensive: ");
            model.addAttribute("value", mostExpensiveItem.get().getName());
            return "filtered";
        } else {
            model.addAttribute("text", "Most expensive: ");
            model.addAttribute("value", "Out of stock!");
            return "filtered";
        }
    }

    @PostMapping("/search")
    public String search(@RequestParam String search, Model model){
        model.addAttribute("shopItems", getSearch(search));
        return "/webshop";
    }

    private List<ShopItem> getQuantityOfStock() {
        return shopItems
                .stream()
                .filter(f -> f.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
    }

    private List<ShopItem> getCheapestFirst() {
        return shopItems
                .stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    private List<ShopItem> getNike() {
        return shopItems
                .stream()
                .filter(f -> f.getName().toLowerCase().contains("nike") || f.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }


    private OptionalDouble getAverage() {
        return shopItems
                .stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average();
    }

    private Optional<ShopItem> getMostExpensive() {
        return shopItems
                .stream()
                .max(Comparator.comparingDouble(ShopItem::getPrice));

    }

    private List<ShopItem> getSearch(String input) {
        return shopItems
                .stream()
                .filter(f -> f.getName().toLowerCase().contains(input) || f.getDescription().toLowerCase().contains(input))
                .collect(Collectors.toList());
    }

}

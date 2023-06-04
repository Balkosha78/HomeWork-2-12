package ru.skypro.springhomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.springhomework.service.StoreService;

import java.util.Set;
import java.util.List;
@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> ids){
        return storeService.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer> get(){
        return storeService.get();
    }
}

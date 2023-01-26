package com.example;

import java.util.List;

public class Alex extends Lion {

    public Alex (Feline feline) throws Exception {
        super(feline, "Самец" );
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends(){
        return List.of("Балу", "Умка", "Кинг");
    }

    public String getPlaceOfLiving(){
        return "Московский зоопарк";
    }

}
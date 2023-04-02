package com.gmail.vladimirprocean;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private Set<Dish> dishes = new HashSet<>();

    public Menu() {
    }

    public Menu(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }
}

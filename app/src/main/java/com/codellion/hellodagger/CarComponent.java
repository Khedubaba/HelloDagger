package com.codellion.hellodagger;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}

package com.shukevich.expresscourse;

public abstract class SphericalHorse {
    // абстрактный метод ржать()
    abstract void neigh();

    // абстрактный класс может содержать и обычный метод
    void gallop() {
        System.out.println("Куда прёшь?");
    }
}

class SphericalHorseInVacuum extends SphericalHorse {

    @Override
    void neigh() {
        System.out.println("Чё ты ржёшь?");
    }
}

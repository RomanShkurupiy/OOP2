class Cow extends GrassFeeding{


    @Override
    void sound() {
        System.out.println("Cows say 'moo'");
    }
    // При использовании "супер" вначале выводится метод из вышестоящего/родительского класса,
    //а потом уже выводится метод из текущего класса
    void sounding(){
        super.sound();
        sound();
    }
// Поскольку лапы и хвост в данном класе не определялись, при обращении из main по иерархии были взяты параметры
// из вышестоящего класса. Поскольку в "GrassFeeding" их нет, программа обратилась к "Animal" и оттуда взятт вывод toString
}

class Lion extends Cat implements wildable, dangerous {
    public Lion(int paws, int tail) {
        super(paws, tail);
    }

    @Override
    void sound() {
        super.sound();
    }

    void food(){
        System.out.println("Lions eat meat");
    }

    @Override
    public void free() {
        System.out.println("Lion is a wild cat");
    }

    public void bite(){
        System.out.println("Lion can bite");
    }
}

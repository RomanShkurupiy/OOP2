class Cat extends Predator {
    private int paws;
    private int tail;

    public Cat(int paws, int tail) {
        this.paws = paws;
        this.tail = tail;
    }


    void sound () {
    System.out.println("Cats say 'miy'");
}


//    @Override
//    void food() {
//        System.out.println("Cats also eat meat");
//    }


    @Override
    public String toString() {
        return "Cat{" +
                "paws=" + paws +
                ", tail=" + tail +
                '}';
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
}

class Dog extends Predator implements dangerous {
    private int paws;
    private int tail;


    public Dog(int paws,int tail) {
        this.paws = paws;
        this.tail = tail;
    }

    void sound() {
       System.out.println("Dogs say 'gav'");
   }

    @Override
    void food() {
        super.food();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "paws=" + paws +
                ", tail=" + tail +
                '}';
    }
    public void bite(){
        System.out.println("Dog can bite");
    }
}

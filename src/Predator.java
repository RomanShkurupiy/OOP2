class Predator extends Animal {
    private int paws = 3;
    private int tail = 2;
    void food () {
        System.out.println("Predators eat meat");
    }
   void paws(){
       System.out.println("Predators have 4 paws");
   }
    void tail(){
        System.out.println("Predators have 1 tail");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "paws=" + paws +
                ", tail=" + tail +
                '}';
    }
}

abstract class Animal {
    abstract void paws();
    private int paws = 4;
    abstract void tail();
    private int tail = 1;
    abstract void food();

    @Override
    public String toString() {
        return "Animal{" +
                "paws=" + paws +
                ", tail=" + tail +
                '}';
    }
}

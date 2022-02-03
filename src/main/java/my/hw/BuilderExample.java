package my.hw;

public class BuilderExample {

    private String name;
    private int age;
    private boolean adult;
    private double price;

    private BuilderExample() {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getAdult() {
        return adult;
    }

    public double getPrice() {
        return price;
    }

    public static Builder getBuilder() {
        return new BuilderExample().new Builder();
    }

    public class Builder{
        private Builder(){}

        public Builder setName(String namE) {
            name  = namE;
            return this;
        }

        public Builder setAge(int agE) {
            age  = agE;
            return this;
        }

        public Builder setAdult(boolean adulT) {
            adult  = adulT;
            return this;
        }

        public Builder setPrice(double pricE) {
            price  = pricE;
            return this;
        }

        public BuilderExample build() {
            return BuilderExample.this;
        }

    }

}

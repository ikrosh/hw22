package my.hw;

public class Main {

    public static void main(String[] args) {
        BuilderExample builderExample = BuilderExample
            .getBuilder()
            .setName("Doggi")
            .setAdult(false)
            .setAge(2)
            .setPrice(399.99)
            .build();
        System.out.println(builderExample.getName() + " " + builderExample.getAge()
                + " adult: " + builderExample.getAdult() + " " + builderExample.getPrice());

        BuilderExample builderExample1 = BuilderExample
                .getBuilder()
                .setName("Teddy")
                .setPrice(99.99)
                .build();
        System.out.println(builderExample1.getName() + " " + builderExample1.getPrice());
    }
}

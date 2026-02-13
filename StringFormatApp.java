class StringFormatApp{
    public static void main(String[] args){
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        float height=Float.parseFloat(args[2]);
        System.out.printf("Name: %-20s Age:%3d Height: %4.2fm%n", name, age, height);
        double newHeight=height*1.023;
        System.out.printf("My space height would be: %.2fm%n", newHeight);
        double newAge=age/1.88;
        System.out.printf("On Mars, I would be approximately %.2f years old", newAge);
    }
}

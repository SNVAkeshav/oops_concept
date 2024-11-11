class animals {
    void sound(){
        System.out.println("Animal makes a sound.");
    }
}
class dogs extends animals{
    @Override
    void sound() {
            System.out.println("Dogs bark");
        }
    }

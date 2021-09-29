class Hello{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("How are you");
        System.out.println("Good bye!");
        
        java.time.LocalDate ld = java.time.LocalDate.now();
        System.out.println(ld);
        
        System.out.println(System.getProperty("file.encoding"));

        System.out.println(1_000);

    }
}


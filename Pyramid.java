class Pyramid {
    public static void main(String[] args){
        

        for(int a=0; a<5; a++){

            for(int b=0; b<5-(a+1); b++){
                System.out.print(" ");
            }
            
            for(int ast=0; ast<(a+1)*2-1; ast++){
                    System.out.print("x");     
                }
                System.out.print("\n");
        }
            
    }

}

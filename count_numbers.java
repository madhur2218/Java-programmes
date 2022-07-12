class count_numbers{

    public static void main(String[] args) {
        int x=234;
        int count=0;

        while(x!=0){

            x=x/10;
            count++;
        }

        System.out.println("Number of digits is " + count);
    }
}
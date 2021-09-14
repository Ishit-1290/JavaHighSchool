class temp
{
    public static void main(String[] args)
    {
        int spaces = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < spaces; j++){
                System.out.print("  ");
            }
            for(int j = 4; j >= i+1; j-- ){
                System.out.print((j+1) + " ");
            }
            System.out.println();
            spaces++;
        }
    }
}

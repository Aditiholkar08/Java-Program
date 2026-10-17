public class eight8 {
    public static void main(String[] args) {
        int num;
        int row=3;
        for(int i=1;i<=row;i++){
            num=row+1-i;
            for(int j=1;j<=row;j++){
                System.out.print(num+"   ");
                num+=row;
            }
            System.out.println();
        }
    }
    
}

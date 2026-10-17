public class seventh7 {
    public static void main(String[] args) {
        int row=3;
        for(int i=0;i<=3;i++){
            int num=i;
            for(int j=0;j<=3;j++){
                System.out.print(num+"    ");
                num+=i;
            }
            System.out.println();
        }
    }
    
}

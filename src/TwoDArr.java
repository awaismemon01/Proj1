public class TwoDArr {
    public static void main(String[] args) {
        int TwoD[][] = new int[4][4];
        int i,j,k=0;

        for (i=0;i<4;i++){
            for (j=0;j<4;j++){
                TwoD[i][j]= k;
                k++;
            }
        }

        for (i=0;i<4;i++){
            for (j=0;j<4;j++){
                System.out.print(TwoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}

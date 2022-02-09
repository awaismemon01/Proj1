package HandsOnPractice;

import java.util.Scanner;

public class Matrix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[][] m1;
        int[][] m2;

        System.out.println("Enter values of first matrix :");
        m1 = getMatrix();

        System.out.println("Enter values of second matrix :");
        m2 = getMatrix();

        System.out.println("The addition of the matrices is :");
        int[][] addition = add(m1,m2);
        Matrix.display(addition);


        System.out.println("Multiplication using function: ");
        int[][] multiplication = multiply(m1,m2);
        Matrix.display(multiplication);


        System.out.println("Transpose of first matrix is :");
        transpose(m1);
        System.out.println("Transpose of second matrix is :");
        transpose(m2);
    }


    static int[][] multiply(int[][] m1, int[][] m2){
        int[][] result = new int[3][3];
        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){

                for (int k=0; k<3; k++){

                    result[i][j] += m1[i][k] * m2[k][j];
                }

            }
        }

        return result;
    }

    static int[][] getMatrix(){
        int[][] result = new int[3][3];
        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){

                result[i][j] = scanner.nextInt();

            }
        }
        return result;
    }

    static int[][] add(int[][] m1,int[][] m2){
        int[][] result = new int[3][3];
        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){

                result[i][j] = m1[i][j] + m2[i][j];

            }
        }
        return result;
    }

    static void display(int[][] m1){
        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){

                System.out.print(m1[i][j]+" ");

            }
            System.out.println();
        }
    }

    static void transpose(int[][] m){
        int[][] result = new int[3][3];
        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){

                result[j][i] = m[i][j];

            }
        }
        display(result);
    }
}

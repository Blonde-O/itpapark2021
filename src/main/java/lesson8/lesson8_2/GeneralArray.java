package lesson8.lesson8_2;

public class GeneralArray {

    private int n;
    private int m;
    private int [][] matrix;

    public GeneralArray(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int [n][m];
    }

    public GeneralArray() {
        this.n = 2;
        this.m = 2;
        this.matrix = new int [n][m];
    }

    public void printSize(){
        System.out.println("Размерность матрицы  " +this.n+ "  " + this.m);
    }

    public int[][] fillMatrix (){
        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[i].length; j++){
                int a = (int) Math.round((Math.random()-Math.random())*10);
                matrix [i][j] = a;
                System.out.print(matrix[i][j]+ " ");
            }
        }
        System.out.println("");
        return matrix;
    }

    public int [][] multiplyMatrix(){
        int y =3;
        int [][] multipliedMatrix = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[i].length; j++){
                multipliedMatrix [i][j] = matrix[i][j]*y;
                System.out.print(multipliedMatrix[i][j]+ " ");
            }
        }
        System.out.println("");
        return multipliedMatrix;
    }
    public int [][] sqrtMatrix(){
        int [][] sqrtedMatrix = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[i].length; j++){
                sqrtedMatrix [i][j] = (int) Math.pow(matrix[i][j],2);
                System.out.print(sqrtedMatrix[i][j]+ " ");
            }
        }
        System.out.println("");
        return sqrtedMatrix;
    }
    public int [][] unitMatrix(){
        int a;
        int [][] unitedMatrix = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[i].length; j++){
                if(i==j){
                    a=1;
                }
                else a=0;
                unitedMatrix [i][j]=a;
                System.out.print(unitedMatrix [i][j]+ " ");
            }
        }
        return unitedMatrix;
    }
}
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
        System.out.println("Матрица:");
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
        System.out.println("Умножение матрицы на число " +y+ " :");
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
        System.out.println("Возведение матрицы в квадрат:");
        int [][] sqrtedMatrix = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[i].length; j++){
                sqrtedMatrix [i][j] = (int) Math.pow(matrix[i][j],2);
                System.out.print(sqrtedMatrix[i][j]+ " ");
            }
        }
        System.out.println();
        return sqrtedMatrix;
    }
    public int [][] unitMatrix(){
        System.out.println("Возвращение единичной матрицы:");
        int a;
        int [][] unitedMatrix = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[i].length; j++){
                if(i==j){
                    a = 1;
                } else a = 0;
                unitedMatrix[i][j] = a;
                System.out.print(unitedMatrix[i][j] + " ");
            }
        }
        System.out.println();
        return unitedMatrix;
    }

    public int[][] summaOfMatrix(int[][] matrixx) {
        System.out.println("Сложение матриц");
        int[][] sumMatrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                sumMatrix[i][j] = matrix[i][j] + matrixx[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
        }
        System.out.println();
        return sumMatrix;
    }

    public int[][] subtractionOfMatrix(int[][] matrixx) {
        System.out.println("Вычитание матриц:");
        int[][] subMatrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                subMatrix[i][j] = matrix[i][j] - matrixx[i][j];
                System.out.print(subMatrix[i][j] + " ");
            }
        }
        System.out.println();
        return subMatrix;
    }

    public int[][] multiplicationOfMatrix(int[][] matrixx) { //http://sh2533.blogspot.com/2013/01/blog-post_7928.html
        System.out.println("Умножение матрицы на матрицу:");
        int a = matrix.length;
        int с = matrixx[0].length;
        int d = matrixx.length;
        int[][] res = new int[a][с];
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < с; j++) {
                for (int k = 0; k < d; k++) {
                    res[i][j] += matrix[i][k] * matrixx[k][j];
                }
                System.out.print(res[i][j] + " ");
            }
        }
        System.out.println();
        return res;
    }
}
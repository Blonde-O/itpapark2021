package lesson8.lesson8_2;

public class MatrixRunner {
    public static void main(String[] args) {
        GeneralArray matrix1 = new GeneralArray();
        GeneralArray matrix2 = new GeneralArray();
        //matrix1.printSize();
        matrix1.fillMatrix();
        int [][] mmatrix = matrix2.fillMatrix();
        matrix1.multiplyMatrix();
        matrix1.sqrtMatrix();
        matrix1.unitMatrix();
        matrix1.summaOfMatrix(mmatrix);
        matrix1.subtractionOfMatrix(mmatrix);
        matrix1.multiplicationOfMatrix(mmatrix);





    }


}

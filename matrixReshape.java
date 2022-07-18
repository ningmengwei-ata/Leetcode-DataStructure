public class matrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //列
        int lenx=mat.length;
        //行
        int leny=mat[0].length;
        if((leny==r&&lenx==c)||lenx*leny!=r*c){
            return mat;
        }
        int[][] result=new int[r][c];
        for(int i=0;i<r*c;i++){

        }
        return result;
    }
}

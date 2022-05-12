public class FindInSortedMatrix {

    public static void main(String[] args) {
        int[][] sorMat = {{2, 8, 9, 11},
        {3, 15, 21, 25},
        {13, 16, 43, 48}, {18, 66, 98, 100}};
        int ele = 48, flag = 0;
        findEle(sorMat, ele);
    }

    static void findEle(int mat[][], int ele) {
        int flag = 0;
        for (int r = 0; r <= 4 - 1;) {
            for (int j = 4 - 1; j >= 0;) {

                if (ele == mat[r][j]) {
                    System.out.println(ele + " " + "found at" + ++r + "," + ++j);

                    flag = 1;
                    break;
                }

                if (ele < mat[r][j]) {
                    j--;
                } else {

                    r++;

                }
            }
            if (flag == 1) {
                break;
            }
        }
    }
}

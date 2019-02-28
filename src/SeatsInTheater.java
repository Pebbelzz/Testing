public class SeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int people = 0;

        int rowsAffected = nRows - row;
        int colsAffected = nCols - col + 1;
        people = rowsAffected * colsAffected;
        return people;

    }

    public static void main(String[] args) {
        System.out.println(SeatsInTheater.seatsInTheater(16,11,5,3));
    }
}

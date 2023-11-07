package Array;

class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 0);
        sda.insert(1, 04);

        sda.insert(2, 03);

        sda.insert(3, 044);
        sda.insert(4, 0);

        sda.insert(5, 0);
        // Traversing the array
        System.out.println(" Traversing the array ");
        sda.traverseArray();
        // searching in an array
        sda.searchInArray(044);
        sda.deleteValue(03);

    }
    // deleting a value in an array
}

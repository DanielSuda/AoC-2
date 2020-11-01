package test;

import util.DataReader;
import util.Refactor;

/**
 * @author Nikolay Sinitsin
 */
public class Test {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();

        System.out.println((dataReader.readData("D:\\DL4J\\AoC-2\\input.txt")));

        Refactor refactor = new Refactor(dataReader.readData("D:\\DL4J\\AoC-2\\input.txt"));

        System.out.println((refactor.ReturnUncorruptedData()));

        // path -> D:\DL4J\AoC-2\input.txt

    }
}

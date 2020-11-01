package main;

import util.DataReader;
import util.Refactor;

/**
 * @author Nikolay Sinitsin
 */
public class Main {
    public static void main(String[] args) {
        Refactor refactor = new Refactor(new DataReader().readData("D:\\DL4J\\AoC-2\\input.txt"));
        System.out.println(refactor.ReturnUncorruptedData());
    }
}

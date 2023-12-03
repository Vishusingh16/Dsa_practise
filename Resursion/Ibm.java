package Resursion;

import java.io.*;
import java.util.Scanner;

public class Ibm {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        String inputFileName = "hosts_access_log_00.txt";
        String outputFileName = "bytes_" + inputFileName;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            int largeResponsesCount = 0;
            long totalBytesForLargeResponses = 0;

            String line;
            while ((line = reader.readLine()) != null) {

                String[] tokens = line.split("\"\\s+");

                int bytesSent = Integer.parseInt(tokens[5]);

                if (bytesSent > 5000) {
                    largeResponsesCount++;
                    totalBytesForLargeResponses += bytesSent;
                }
            }

            writer.write(String.valueOf(largeResponsesCount));
            writer.newLine();
            writer.write(String.valueOf(totalBytesForLargeResponses));

            System.out.println("Analysis complete. Results written to " + outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

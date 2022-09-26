package io.muzoo.ssc;

import org.apache.commons.cli.*;
import org.codehaus.plexus.util.StringUtils;

public class Main {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("a", "--total-num-files", true, "Print the total number of files");
        CommandLineParser parser = new DefaultParser();
        CommandLine c = null;
        try {
            c = parser.parse(options, args);
            if (c.hasOption("a"))
                System.out.println("This is working");
        } catch (ParseException e) {
            throw new RuntimeException("FAILED");
        }


    }

}
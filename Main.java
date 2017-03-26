package com.company;

import java.io.*;
import java.util.*;
public class Main {

    static int nodes, edges;

    public static void main(String[] args) throws Exception  {


        BufferedReader inputReader;
        Scanner lineScanner;
        int countInput;
        String line;
        inputReader = new BufferedReader(new FileReader("/Users/jeremiahlukus/desktop/test.txt"));
        inputReader.readLine();//skips the first line

        while((line = inputReader.readLine()) != null){
            lineScanner = new Scanner(line);
            countInput = 0;
            while(lineScanner.hasNext()){
                countInput++;
                lineScanner.nextInt();
                //System.out.printf("%d%n",lineScanner.nextInt());
            }
            if(countInput == 1){

                System.out.printf("node%n");
            }
            else{
                System.out.printf("Edge%n");
            }
            //System.out.println(line);

        }



        //Now creating the graph
       Edge[] edges = {
                new Edge(0, 2, 1),
                new Edge(0, 3, 4),
                new Edge(0, 4, 2),
                new Edge(0, 1, 3),
                new Edge(1, 3, 2),
                new Edge(1, 4, 3),
                new Edge(1, 5, 1),
                new Edge(2, 4, 1),
                new Edge(3, 5, 4),
                new Edge(4, 5, 2),
                new Edge(4, 6, 7),
                new Edge(4, 7, 2),
                new Edge(5, 6, 4),
                new Edge(6, 7, 5),
        };
        Graph g = new Graph(edges);
        g.calculateShortestDistance();
         g.printResult();




    }
}
package com.company;

import java.io.*;
import java.util.*;
public class Main {



    public static void main(String[] args) throws Exception {


/*
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
                //System.out.printf("%d\n",lineScanner.nextInt());
            }
            if(countInput == 1){

                System.out.printf("node\n");
            }
            else{
                System.out.printf("Edge\n");
            }
            //System.out.println(line);

        }
*/
        BufferedReader inputReader;
        Scanner lineScanner;
        int countInput;
        String line;
        inputReader = new BufferedReader(new FileReader("/Users/jeremiahlukus/desktop/test.txt"));
        inputReader.readLine();//skips the first line
        int edgecount = 0;
        while ((line = inputReader.readLine()) != null) {
            lineScanner = new Scanner(line);
            countInput = 0;
            while (lineScanner.hasNext()) {
                countInput++;
                lineScanner.nextInt();
                //System.out.printf("%d\n",lineScanner.nextInt());
            }
            if (countInput == 1) {

                System.out.printf("node\n");
            } else {
                System.out.printf("Edge\n");
                edgecount++;//counting edges to create edge count...
            }
            //System.out.println(line);

        }
        inputReader.close();
        Edge[] edges = new Edge[edgecount];//creating edge array

        //now storing to array
        inputReader = new BufferedReader(new FileReader("/Users/jeremiahlukus/desktop/test.txt"));
        inputReader.readLine();//skips the first line
        int source = 0, i = 0;
        while ((line = inputReader.readLine()) != null) {
            lineScanner = new Scanner(line);
            countInput = 0;
            int a[] = new int[2], k = 0;
            while (lineScanner.hasNext()) {
                countInput++;
                a[k++] = lineScanner.nextInt();
                //System.out.printf("%d\n",lineScanner.nextInt());
            }
            if (countInput == 1) {
                source = a[k];
                System.out.printf("node\n");
            } else {
                System.out.printf("Edge\n");
                edges[i++] = new Edge(source, a[k - 1], a[k]);//adding to array ...
            }
            //System.out.println(line);
            System.out.println(edges[3]);

        }


        System.out.println(edges[5]);



        //Now creating the graph
      /* Edge[] edges = {
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
        };*/



        Graph g = new Graph(edges);
        g.calculateShortestDistance();
         g.printResult();


    }
}

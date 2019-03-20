package homework7;

import java.util.Arrays;

/**
 * Java. Algorithm and Data Structures of Java. Lesson 7. Homework 7
 *
 * @author Petrov Nikolay
 * @version dated March 20, 2019
 */

/*  1. Реализовать программу, в которой задается граф из 10 вершин.
       Задать ребра и найти кратчайший путь с помощью поиска в ширину. */

public class MainClass {
    public static void main(String[] args) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Graph graph = new Graph();

        for (int i = 0; i < 10; i++) {
            graph.addVertex(alphabet[i]);
        }

        graph.addEdge(0,1); // A->B
        graph.addEdge(0,2); // A->C
        graph.addEdge(0,3); // A->D
        graph.addEdge(1,4); // B->E
        graph.addEdge(2,5); // C->F
        graph.addEdge(3,6); // D->G
        graph.addEdge(4,7); // E->H
        graph.addEdge(5,9); // F->J
        graph.addEdge(6,8); // G->I
        graph.addEdge(7,9); // H->J
        graph.addEdge(8,9); // I->J

        System.out.println("Вершины графа:");
        System.out.println(Arrays.toString(graph.getVertexList()));

        System.out.println("Матрица смежности:");
        graph.printAdjMat();

        System.out.print("Обход в ширину: ");
        graph.bfs();
    }
}

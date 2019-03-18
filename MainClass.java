package homework6;

/**
 * Java. Algorithm and Data Structures of Java. Lesson 6. Homework 6
 *
 * @author Petrov Nikolay
 * @version dated March 18, 2019
 */

/*  1. Создать и запустить программу для построения двоичного дерева. В цикле построить двадцать деревьев с глубиной в 6 уровней.
Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа ​int​.
Число, которое попадает в узел, должно генерироваться случайным образом в диапа​зоне от -100 до 100.
   2. Проанализировать, какой процент созданных деревьев являются несбалансированными */

public class MainClass {

    public static void main(String[] args) {
        int countb = 0; // количество сбалансированных деревьев
         BinaryTree [] treeArr = new BinaryTree[20];
        for (int i = 0; i < treeArr.length; i++) {
            treeArr[i] = new BinaryTree();
            while (treeArr[i].getDepth() < 6){
                treeArr[i].insert();
            }
            if(treeArr[i].isBalanced(treeArr[i].root)) countb++;
        }

        System.out.println("Количество сбалансированных деревьев " + countb);
        System.out.println("Процент несбалансированных деревьев " + (100 - countb*100/20));
    }
}

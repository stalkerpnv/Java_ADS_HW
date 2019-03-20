package homework7;

public class Graph {
    private final int MAXV = 10;

    private Vertex vertexList[]; // Массив вершин
    private int adjMat[][];      // Матрица смежности
    private int nVerts;          // Текущее количество вершин
    private Queue queue;

    public Graph(){
        vertexList = new Vertex[MAXV];
        queue = new Queue();
        adjMat = new int[MAXV][MAXV];
        nVerts = 0;
    }

    public Vertex[] getVertexList() {
        return vertexList;
    }
    public void printAdjMat(){
        System.out.print("    ");
        for (int v = 0; v <MAXV; v++) {
            System.out.print(vertexList[v].label + " ");
        }
        System.out.println();
        for (int i = 0; i <MAXV ; i++) {
            System.out.print(vertexList[i].label + " | ");
            for (int j = 0; j <MAXV ; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void addVertex(char label){
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int a, int b){
        adjMat[a][b] = 1;
        adjMat[b][a] = 1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public int getAdjUnvisitedVertex(int v){
        for (int i = 0; i <nVerts ; i++) {
            if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }
    /**
     * Обход в ширину
     */
    public void bfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0);
        int var2;
        while(!queue.isEmpty()){
            int var1 = queue.remove();
            while((var2 = getAdjUnvisitedVertex(var1)) != -1){
                vertexList[var2].wasVisited = true;
                displayVertex(var2);
                queue.insert(var2);
            }
        }
        for(int j = 0; j < nVerts; j++){
            vertexList[j].wasVisited = false;
        }
    }
}

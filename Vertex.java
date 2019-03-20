package homework7;

public class Vertex {
    char label;         // Метка
    boolean wasVisited; // Посещение вершины

    public Vertex(char label){
        this.label = label;
        this.wasVisited = false;
    }

    @Override
    public String toString() {
        return label + " ";
    }
}

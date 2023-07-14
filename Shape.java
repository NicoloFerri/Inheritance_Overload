package javaOOPAdvanced_V2.Inheritance_Overload;

public class Shape {
    private String shapeName;
    private int numberOfEdges;
    private static int c;


    public Shape(){
        c++;
        System.out.println(" ho creato il " + c + "° della classe Shape");
        this.shapeName="undefined shape";
    }

    public Shape (double radius){
        c++;
        System.out.println(" ho creato il " + c + "° della classe Shape");
        this.shapeName="Circle";
    }

    public Shape (int edges , double edgeLength) {
        try {
            if (edges != 4) {
                throw new IllegalArgumentException("Hai immesso il numero di spigoli sbagliati per il poligono di cui hai immesso i lati");
            }
            c++;
            System.out.println(" ho creato il " + c + "° della classe Shape");
            this.shapeName = "Square";
            this.numberOfEdges = edges;
        }
        catch ( IllegalArgumentException e) {
            System.out.println(e.getMessage());
            }

        }


    public Shape ( int edges , double e1 , double e2 ){
        try {
            if (edges != 4) {
                throw new IllegalArgumentException("Hai immesso il numero di spigoli sbagliati per il poligono di cui hai immesso i lati");
            }
            c++;
            System.out.println(" ho creato il " + c + "° della classe Shape");
            this.shapeName = "Square";
            this.numberOfEdges = edges;
        }
        catch ( IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public Shape ( int edges , double e1 , double e2 , double e3){
        try {
            if (edges != 3) {
                throw new IllegalArgumentException("Hai immesso il numero di spigoli sbagliati per il poligono di cui hai immesso i lati");
            }
            c++;
            System.out.println(" ho creato il " + c + "° della classe Shape");
            this.shapeName = "Square";
            this.numberOfEdges = edges;
        }
        catch ( IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public String getShapeDetails(){
      return shapeName+ " " + numberOfEdges;
    };

}

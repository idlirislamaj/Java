package redischool.Lesson11;

class LeafcutterAnt {
    double headsize;
    LeafcutterAnt(double headsize){
        this.headsize = headsize;
    }
    public void work(){};
}

class Minim extends LeafcutterAnt{
    Minim(){
        super(0.9);
    }

    public void work(){
        System.out.println("Hi, I am Minim #"+ this.hashCode() +
                ". I am a tiny ant with headsize " + headsize +
                ". I am caring for our fungus gardens.");
    }
}

class Minor extends LeafcutterAnt{
    Minor(){
        super(1.8);
    }
    public void work(){
        System.out.println("Hi, I am Minor #"+ this.hashCode() +
                ". I am a small ant with headsize " + headsize +
                ". I am defending our food searching ants.");
    }
}

class Media extends LeafcutterAnt{
    Media(){
        super(4.5);
    }
    public void work(){
        System.out.println("Hi, I am Media #"+ this.hashCode() +
                ". I am a midsize ant with headsize " + headsize +
                ". I am cutting the leaves and carry them home.");
    }
}

class Major extends LeafcutterAnt{
    Major(){
        super(7);
    }
    public void work(){
        System.out.println("Hi, I am Major #"+ this.hashCode() +
                ". I am a really large ant with headsize " + headsize +
                ". I am a warrior defending our nest.");
    }
}

 class TestLeafcutterAnts {
    public static void main(String[] args) {
        LeafcutterAnt[] colony = {new Minim(),
                new Minor(),
                new Media(),
                new Major()};
        for (LeafcutterAnt ant:colony){
            ant.work();
        }
    }
}
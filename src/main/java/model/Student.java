package model;

public abstract class  Student {

   protected String name;
    protected int id;

public abstract void sayHi();




    public Student(String name, int id){

        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "name = " + name +
                " id =" + id
                ;
    }
}

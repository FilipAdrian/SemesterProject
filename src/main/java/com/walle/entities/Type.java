package com.walle.entities;

public class Type {
   private Integer id;
   private String name;

   public Type () {}
   public Type (Integer id,String name){
       this.id = id;
       this.name = name;
   }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package Ejercicio_CRUD;
/*
Pais tiene
- Capital, code2, continent, GNP. GNPOld, GovermmentForm, HeadOfState, IndepYear, LifeExpentancy
  LocalName, Population, Region, SurfaceArea - no lo pide


- Code (char, clve)
- name(char)
*/
public class Pais {
    //atributos
    String code, name;

    //constructor
    public Pais(String code, String name) {
        this.code = code;
        this.name = name;
    }

    //getters y setters
    //codigo
    public String getCode() {
        return code;
    }

    //nombre
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}

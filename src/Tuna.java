/**
 * Created by JordanTBoyce on 1/19/2016.
 */
public class Tuna {
     private String girlName;

    public Tuna(String name){
        girlName = name;
    }

    public void setName(String name){
        girlName = name;
    }

    public String getName(){
        return girlName;
    }

    public void saying(){
        System.out.printf("Your first girlfriend was %s ", getName());
    }
}

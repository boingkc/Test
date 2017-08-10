/**
 * Created by BOINGKC on 10/08/2017 AD.
 */

import java.util.*;
public class Component {
    List<String> things;

    Component(){
        things = new ArrayList<>();

    }

    public void addThings(String thing){
        things.add(thing);
    }

    public String printThing(){
        return things.toString();
    }


}


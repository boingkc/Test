import java.util.*;
class Home{
    private List<Component> component;
    private List<People> member;
    private String description;


    public Home(String desc){
        component = new ArrayList<>();
        member = new ArrayList<>();
        this.description = desc;
    }

    public Home(){
        component = new ArrayList<>();
        member = new ArrayList<>();

    }

    public void setDescription(String freeDes){
        this.description = freeDes;



    }
    public List<Component> getIntoComponent(){
        return component;

    }
    public void addComponent(Component componentObj){
        component.add(componentObj);

    }

    @Override
    public String toString() {
        return "Home{" +
                "component=" + component +
                ", member=" + member +
                ", description='" + description + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Home home1 = new Home("This home is located near the narrow sea");
        home1.addComponent(new Component());

        home1.getIntoComponent().get(0).addThings("LOVE");

        System.out.println(home1.getIntoComponent().get(0).printThing());



        System.out.println(home1.toString());
    }
}
package facade;

public class Hello {


    public String sayHello(String name) {

        if(name == name.toUpperCase()){
            return "HELLO " + name +"!";
        }

        if(name == null){
            return "Hello, my friend";
        }
        return "Hello, " + name;
    }

    public String sayHelloArray(String[] names){

        if(names.length < 3){
            return "Hello, " + names[0] + " and " + names[1] + ".";
        }



        
        String name = "";
        for (int i = 0; i < names.length-1; i++) {
            name = name + " " + names[i] + ",";
        }

        return "Hello," + name + " and " + names[names.length-1] + ".";
    }
}

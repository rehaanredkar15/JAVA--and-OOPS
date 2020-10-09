package singleton_class;

/* it is used in efficiency of the app and reducing the space and time ,  it is used mostly in multithreaded and database
* apps , it is used for logging , caching , thread pool, in java multiple inheritance is prohibited which  means a
* child class can have only one parent class . In singleton pattern there is only one object of class and multiple objects
* are not created */
public class single {
    public static void main(String[] args) {

        appconfig obj =  appconfig.getInstance();  // call for the object
        appconfig obj2 =  appconfig.getInstance();  //this will also get the same object so here the same object will be
        //received






    }
}

package singleton_class;

public class appconfig {

    /* mostly app contains app config file for this task so the name is app config */


    private appconfig(){   /*first step is making default constructor private so that now objects cant be created */

    }
    private static appconfig obj = new appconfig();   //to get the object created in obj and given by getinstance
     // so we will create a static function which will have get instance to get the  single object
    public  static appconfig  getInstance(){
        return obj; //so whenever get instance will be called we will return obj

    }


}

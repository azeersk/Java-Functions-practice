class objClass{
   public static boolean objMethod(){
       System.out.println("this is object class! ");
       return false;
   }
}

public class MainClass {
    public static void main(String[] args){
        objClass objOf = new objClass();
        if(objClass.class.isInstance(objOf)){
            System.out.println("this is the object class!!");
            System.out.println( objOf.objMethod());
        }
        else{
            System.out.println("this is not the object class!!");
        }
    }
}

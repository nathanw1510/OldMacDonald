class Cow implements Animal{     
     protected String myType;     
     protected String mySound;      
     public Cow(String type, String sound){         
         myType = type;         
         mySound = sound;     
     }
     public Cow()     {         
         myType = "cow";         
         mySound = "moo";     
     }         
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
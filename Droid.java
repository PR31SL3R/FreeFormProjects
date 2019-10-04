public class Droid{
  
  double batteryLevel;
  String name="";
  int transfer;
  
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 50;
    }
  
  public String toString(){
    
    String message = ("Hi, my name is " + name + "  \nMy current batterylevel is " + batteryLevel);
    return message;
  }
  
  public void performTask(String task){
    System.out.println(name + " is preforming the task of " + task);
    batteryLevel = batteryLevel - 30;
    deathChecker();
    
  }
  public void deathChecker(){
    if (this.batteryLevel <=0){
      System.out.println(this.name + " is dead");
      kill();
    }
    
  }
  
  public void kill(){
    System.out.print("pew pew");
    name = null;
    Droid robot = null;
    
    
  }
  
  public void charger(){
    this.batteryLevel = batteryLevel + 10;
  }
  
  public void energyTransfer(Droid robot,Droid robot2){
double exchange=robot.batteryLevel;
robot.batteryLevel=robot2.batteryLevel;
robot2.batteryLevel = exchange;
}
  
  
  
  public static void main (String[] args){
    
    Droid robot = new Droid("bob");
    Droid robot2 = new Droid("bobber");
    robot.performTask("dancing");
    System.out.println(robot.batteryLevel);
    System.out.println(robot2.batteryLevel);
    robot.energyTransfer(robot,robot2);
    System.out.println(robot.batteryLevel);
    System.out.println(robot2.batteryLevel);
    
  }
  

  
  
}
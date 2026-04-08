import java.util.Random;

class Observer{
    public void update(int waterLevel){

    }
}
class Alarm extends Observer{
    String alarmId;

    Alarm (String alarmId){
        this.alarmId=alarmId;
    }
    public void update(int waterLevel){

        System.out.println("Alarm triggered "+alarmId+(waterLevel>=50?" on":" off"));
    }
}
class Display extends Observer{
    public void update(int waterLevel){
        System.out.println("Water level is "+waterLevel);
    }
}
class SMSManager extends Observer {
    public void update(int waterLevel){
        System.out.println("SMS sending "+waterLevel);
    }
}
class ControlPanel{
    private Alarm alarm; //has a
    private Display display;
    private SMSManager smsManager;
    private int waterLevel;

    public void putDisplay(Display display) {
        this.display=display;
    }

    public void putAlarm(Alarm alarm) {
        this.alarm=alarm;
    }

    public void putWaterLevel() {
        this.waterLevel=waterLevel;
    }

    public void putSMSManager(SMSManager smsManager){
        this.smsManager=smsManager;
    }
    public void notifyObjects(){
        alarm.update(waterLevel);
        display.update(waterLevel);
        smsManager.update(waterLevel);
    }

    public void setWater(int waterLevel){

        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObjects();
        }
    }


}

public class Example {
    public static void main(String[] args) {
    ControlPanel controlPanel= new ControlPanel();

    controlPanel.putAlarm(new Alarm("Alarm1"));
    controlPanel.putDisplay(new Display());
    controlPanel.putSMSManager(new SMSManager());

        Random rand=new Random();

        while(true){
            controlPanel.setWater(rand.nextInt(101));
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
            System.out.println("=====================");
        }
    }
}

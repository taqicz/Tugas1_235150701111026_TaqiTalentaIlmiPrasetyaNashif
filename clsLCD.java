public class clsLCD {

    private String status, cable;
    private int brightness, volume;
    private int confCable;


    public String turnOn(){
        return status = "ON";
    }

    public String turnOff(){
        return status = "OFF";
    }

    public String freeze(){
        return status = "FREEZE";
    }

    public void setVolume(int vol){
        this.volume = vol;
    }

    public int volumeUp(){
        volume++;
        return volume;
    }

    public int volumeDown(){
        volume--;
        return volume;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public int brightnessUp(){
        brightness++;
        return brightness;
    }

    public int brightnessDown(){
        brightness--;
        return brightness;
    }

    public void testCable(){
        if (confCable == 1){
            confCable += 1;
        }

    }

    public void setCable(){
        switch (confCable){
            case 1:
                cable = "VGA";
                break;
            case 2:
                cable = "DVI";
                break;
            case 3:
                cable = "HDMI";
                break;
            default:
                cable = "DisplayPort";
            
        }

    }

    public void cableUp(){
        this.confCable++;
        testCable();
        setCable();
    }
    
    public void cableDown(){
        this.confCable--;
        testCable();
        setCable();
    }

    public void display(){
        System.out.println("-----------------\n      LCD      \n-----------------");
        System.out.println("LCD STATUS\t: "+ status);
        System.out.println("LCD VOLUME\t: "+ volume);
        System.out.println("LCD BRIGHTNESS\t: " +  brightness);
        System.out.println("LCD CABLE\t: " +  cable);
    }

    
}


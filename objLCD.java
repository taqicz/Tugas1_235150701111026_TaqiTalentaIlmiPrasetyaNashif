public class objLCD {
    public static void main(String[] args) {
        // clsLCD lcd_A = new clsLCD();
        // lcd_A.turnOff();
        // lcd_A.turnOn();
        // lcd_A.setVolume(85);
        // lcd_A.setBrightness(50);
        // lcd_A.setCable();
        // lcd_A.cableUp();
        // lcd_A.brightnessDown();
        // lcd_A.brightnessDown();
        // lcd_A.volumeDown();
        // lcd_A.volumeUp();
        // lcd_A.volumeUp();
        // lcd_A.display();

        clsLCD lcd_B = new clsLCD();
        lcd_B.turnOn();
        lcd_B.setVolume(95);
        lcd_B.setBrightness(62);
        lcd_B.setCable();
        lcd_B.cableUp();
        lcd_B.cableUp();
        lcd_B.brightnessDown();
        lcd_B.brightnessUp();
        lcd_B.brightnessUp();
        lcd_B.volumeDown();
        lcd_B.volumeDown();
        lcd_B.volumeUp();
        lcd_B.display();
    }
}

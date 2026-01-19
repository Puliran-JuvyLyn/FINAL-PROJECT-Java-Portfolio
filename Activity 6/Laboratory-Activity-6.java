import java.util.*;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner("Aircon", 3, 20);
        LampShade bedroomLamp = new LampShade("Bedroom Lamp", 100, "Light Yellow");
        LampShade copiedLamp = new LampShade(bedroomLamp); // copy constructor
        Television television = new Television("LG TV", 1, 10);
        MicrowaveOven microwaveOven = new MicrowaveOven("Microwave", 0, 0);

        List<Device> devices = Arrays.asList(airConditioner, bedroomLamp, copiedLamp, television, microwaveOven);

        DeviceHelper.toggleDevices(devices, true);
        DeviceHelper.toggleDevices(devices, false);
        DeviceHelper.countOnDevices(devices);
    }
}

abstract class Device {
    private String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now ON.");
        details();
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now OFF.");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    public abstract void details();
}

class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner(String name, int fanSpeed, int temperature) {
        super(name);
        this.fanSpeed = fanSpeed;
        this.temperature = temperature;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        System.out.println("Fan speed set to " + fanSpeed);
        details();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature);
        details();
    }

    @Override
    public void details() {
        System.out.println("AirConditioner [FanSpeed=" + fanSpeed + ", Temp=" + temperature + "]");
    }
}

class LampShade extends Device {
    private int brightness;
    private String color;

    public LampShade(String name, int brightness, String color) {
        super(name);
        this.brightness = brightness;
        this.color = color;
    }

    // Copy constructor
    public LampShade(LampShade other) {
        super(other.getName());
        this.brightness = other.brightness;
        this.color = other.color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness set to " + brightness);
        details();
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color changed to " + color);
        details();
    }

    @Override
    public void details() {
        System.out.println("LampShade [Brightness=" + brightness + "%, Color=" + color + "]");
    }
}

class Television extends Device {
    private int channel;
    private int volume;

    public Television(String name, int channel, int volume) {
        super(name);
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel set to " + channel);
        details();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + volume);
        details();
    }

    @Override
    public void details() {
        System.out.println("Television [Channel=" + channel + ", Volume=" + volume + "]");
    }
}

class MicrowaveOven extends Device {
    private int timer;
    private int temperature;

    public MicrowaveOven(String name, int timer, int temperature) {
        super(name);
        this.timer = timer;
        this.temperature = temperature;
    }

    public void setTimer(int timer) {
        this.timer = timer;
        System.out.println("Timer set to " + timer + " minutes");
        details();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature);
        details();
    }

    @Override
    public void details() {
        System.out.println("MicrowaveOven [Timer=" + timer + " mins, Temp=" + temperature + "]");
    }
}

class DeviceHelper {
    public static void toggleDevices(List<Device> devices, boolean powerOn) {
        for (Device device : devices) {
            if (powerOn) {
                device.turnOn();
            } else {
                device.turnOff();
            }
        }
    }

    public static void countOnDevices(List<Device> devices) {
        long count = devices.stream()
                            .filter(Device::isOn)
                            .count();
        System.out.println("Devices currently ON: " + count);
    }
}

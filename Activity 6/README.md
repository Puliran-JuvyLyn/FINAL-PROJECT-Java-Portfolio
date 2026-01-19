# Device Control System 

This project is a simple Java program that demonstrates how different
devices can be controlled using object-oriented programming concepts.

---

## Project Description
The program simulates common home devices such as:
- Air Conditioner
- Lamp Shade
- Television
- Microwave Oven

All devices inherit from an abstract class called `Device`.
The program can turn devices ON and OFF, show their details,
and count how many devices are currently ON.

---

## Concepts Used
- Abstract Classes
- Inheritance
- Method Overriding
- Constructors
- Copy Constructor
- ArrayList / List
- Static Methods
- Polymorphism

---

## Classes Included

### Main
- Creates device objects
- Stores them in a list
- Turns devices ON and OFF
- Counts active devices

### Device (Abstract Class)
- Parent class for all devices
- Contains common methods:
  - `turnOn()`
  - `turnOff()`
  - `isOn()`
  - `details()` (abstract)

### AirConditioner
- Has fan speed and temperature
- Displays aircon details when turned on

### LampShade
- Has brightness and color
- Includes a copy constructor

### Television
- Has channel and volume

### MicrowaveOven
- Has timer and temperature

### DeviceHelper
- Turns all devices ON or OFF
- Counts how many devices are ON

---

## How the Program Works
1. Devices are created in `Main`
2. All devices are stored in a `List<Device>`
3. Devices are turned ON
4. Devices are turned OFF
5. The program counts how many devices are ON

---


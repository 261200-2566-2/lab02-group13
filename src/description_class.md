# 1. Give a complete description of AirPurifier class

| instance variables | instance methods | class variables | class methods |
| --- | --- | --- | --- |
| String model | updateAQI() | Filter filter | setMode() |
| String brand | changeFilter() | Sensor sensor | setBrightness() |
| int[] dimension | printSpecs() | Fan fan | setFanSpeed() |
| String filterType |  | Specs specs | updateAQI() |
| String serialNumber |  | Monitor monitor | getVolume() |
|  |  | int mode | turnOn() |
|  |  | boolean power | turnOff() |
|  |  | int volume |  |

# 2. For each method proposed above, how do you plan to implement it?

## Instance methods

- updateAQI()
    - รับค่าคุณภาพของอากาศ
- changeFilter()
    - เปลี่ยน Filter
- printSpecs()
    - แสดงผลข้อมูลของเครื่องฟอกอากาศทั้งหมด

## Class methods

- turnOn()
    - ตั้งค่าสถานะการทำงานของเครื่องเป็นเปิด
- turnOff()
    - ตั้งค่าสถานะการทำงานของเครื่องเป็นปิด
- setMode()
    - ตั้งค่าโหมดการทำงานของเครื่อง
- setBrightness()
    - ตั้งค่าความสว่างของหน้าจอแสดงผล
- setFanSpeed()
    - ตั้งค่าความเร็วของพัดลม
- getFanSpeed()
    - รับค่าความเร็วของพัดลมปัจจุบัน
- getVolume()
    - ตรวจสอบจำนวนการผลิตทั้งหมดของเครื่อง

| Instance methods | Input | Output |
| --- | --- | --- |
| updateAQI() | Airpurifier object | - |
| changeFilter() | Airpurifier object, String | - |
| printSpecs() | Airpurifier object | รายละเอียดของเครื่องฟอกอากาศ |

| Class methods | Input | Output |
| --- | --- | --- |
| setMode() | int | - |
| setBrightness() | int | - |
| setFanSpeed() | int | - |
| getFanSpeed() | - | int |
| updateAQI() | double | - |
| getVolume() | - | int |
| turnOn() | - | - |
| turnOff() | - | - |

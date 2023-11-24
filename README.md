[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/M0TFBBAV)
# 1. Give a complete description of AirPurifier class

| instance variables | instance methods | class variables | class methods |
| --- | --- | --- | --- |
| String model | updateAQI() | Filter filter | getVolume() |
| String brand | changeFilter() | Sensor sensor |  |
| int[] dimension | printSpecs() | Fan fan |  |
| String filterType | turnOn() | Specs specs |  |
| String serialNumber | turnOff() | Monitor monitor |  |
|  | updateAQI() | int mode |  |
|  | setMode() | boolean power |  |
|  | setBrightness() | int volume |  |
|  | setFanSpeed() |  |  |

# 2. For each method proposed above, how do you plan to implement it?

## Instance methods

- turnOn()
    - ตั้งค่าสถานะการทำงานของเครื่องเป็นเปิด
- turnOff()
    - ตั้งค่าสถานะการทำงานของเครื่องเป็นปิด
- updateAQI()
    - รับค่าคุณภาพของอากาศ
- changeFilter()
    - เปลี่ยน Filter
- printSpecs()
    - แสดงผลข้อมูลของเครื่องฟอกอากาศทั้งหมด

## Class methods

- setMode()
    - ตั้งค่าโหมดการทำงานของเครื่อง
- setBrightness()
    - ตั้งค่าความสว่างของหน้าจอแสดงผล
- setFanSpeed()
    - ตั้งค่าความเร็วของพัดลม โดยตรวจสอบความเร็วของพัดลมก่อนว่าความเร็วอยู่ระหว่างค่า MIN และ MAX ของความเร็วที่พัดลมทำได้
- getFanSpeed()
    - รับค่าความเร็วของพัดลมปัจจุบัน
- getVolume()
    - ตรวจสอบจำนวนการผลิตทั้งหมดของเครื่อง

|  | Input | Output |
| --- | --- | --- |
| updateAQI() | Airpurifier object | - |
| changeFilter() | Airpurifier object, String | - |
| printSpecs() | Airpurifier object | รายละเอียดของเครื่องฟอกอากาศ |
| turnOn() | - | - |
| turnOff() | - | - |

|  | Input | Output |
| --- | --- | --- |
| setMode() | int | - |
| setBrightness() | int | - |
| setFanSpeed() | int | - |
| getFanSpeed() | - | int |
| updateAQI() | double | - |
| getVolume() | - | int |

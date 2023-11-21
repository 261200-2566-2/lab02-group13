# AirPurifier Class
## What should be instance varible ?
> * width -> กำหนดความกว้างของขนาดเครื่อง
> * length -> กำหนดความยาวของเครื่อง
> * height -> กำหนดความสูงของเครื่อง
> * screen_width -> กำหนดขยาดหน้าจอ
> * screen_height ->กำหนดขนาดหน้าจอ
> * brand  -> กำหนดชื่อ แบรน์
> * model -> กำหนด model ของเครื่อง
> * fiter_type -> กำหนดชนิดของ Fiter
## What should be instance methods ?
> ### 

## What should be class variables ?
> * Fiter fiter = กำหนด Fiter
> * Sensor sensor = กำหนด sensor
> * Fan fan = กำหนดพัดลม
> * Spec body = กำหนด Space ของเครื่อง
> * Monitor monitor = กำหนดหน้าจอของเครื่องฟอก
> * String mode = Mode ของเครื่องฟอก
> * boolean power = สถานะของเครื่อง
> * static int created = ผลิตมาเเล้วกี่เครื่อง
> * String serial_number = เลขของเครื่อง
> * String brand = กำหนดว่าจะเป็นแบรน์อะไร
> * String model = กำหนด model ของเครื่อง
## What should be class methods ?
> ### 1) setPowerOn and SetPowerOff
> - ทำการปิด และเปิดเครื่อง
> ### 2) checkMode and setMode
> - ทำการดูว่าตอนนี้อยู่โหมดไหน และ ทำการเปลี่ยนโหมดให้กับเครื่อง
> ### 3) setFanSpeed and getFanSpeed
> - ทำการตั้งความเร็วของพัดลม และทำการ setความเร็วของพัดลม
> ### 4)setBrightness and Created
> - ทำการตั้งค่าความสว่างหน้าจอ และ ทำการนับว่าสร้างไปกี่เครื่องแล้ว
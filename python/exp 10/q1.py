import math
m1= 3/2
m2= -1

if 1+m1*m2==0:#if the value of 1+m1*m2 is zero then the angle between the two lines is 90 degree
    theta_d = 90
else:
    tan_thera= abs((m1-m2)/(1+m1*m2))#abs is used to get the positive value of the angle
    theta_r=math.atan(3)#atan is tan inverse function
    theta_d=math.degrees(theta_r)

print(f"The angle between the two straight lines is: {theta_d:.2f} degrees")
print(f"The angle between the two straight lines is: {round(theta_d,2)} degrees")
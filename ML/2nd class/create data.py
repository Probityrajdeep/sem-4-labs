import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
data = {
    "Student_ID": [1,2,3,4,5],
    "Marks": [78,85,62,90,74],
    "Attendance": [80,90,70,95,85]
}
df =pd.DataFrame(data)
plt.figure()
plt.bar(df["Student_ID"],df["Marks"])
plt.xlabel("Student ID")
plt.ylabel("Marks")
plt.title("Bar Chart of Student Marks")
plt.show()
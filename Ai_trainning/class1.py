# adding elements in set
s=set()
s.add("python")
print(s)
print(len(s))
#dictionary
dic1={"Employee":"ni",
     "ID":"842",
     "salary":850000,
     "mobile":8321982}
print(dic1)
print(type(dic1))
print(dic1["salary"])
dic1.update({"mobile":3888888})
print(dic1)
dic1.popitem()
print(dic1)
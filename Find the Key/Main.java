input1 = [int(d) for d in str(input())]
input2=[int(d) for d in str(input())]
input3=[int(d) for d in str(input())]
key1=str(min([input1[0],input2[0],input3[0]]))+""+str(max([input1[1],input2[1],input3[1]]))+""+str(min([input1[2],input2[2],input3[2]]))+""+str(max([input1[3],input2[3],input3[3]]))
print(key1)
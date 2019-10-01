#num = [0,1,2,4,5,6,7,7,8,9,10]
num = [0,4,3,1,2,4,6]
duplicate = 0
numberSet = set()
seriessum = 0
for integer in num:
    if  integer in numberSet:
        duplicate = integer
    else:
        numberSet.add(integer)
    seriessum += integer

#as series starting with 0
arithmatic_sum = ((len(numberSet) + 1) * len(numberSet) / 2)
missingnum = duplicate + ( arithmatic_sum - seriessum)
print(missingnum)
str1=list(input())
b=len(str1)-1
if b%2!=0:
    str1[b//2]="*"
    str1[b//2+1]="*"
else:
    str1[b//2]="*"
print("".join(str1))

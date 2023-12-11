#!/usr/bin/python3

def pali_num(num: int) -> bool:
	list_of_digits = [int(x) for x in str(num)]
	print(list_of_digits)
	for i in range(len(list_of_digits)):
		if(i>(len(list_of_digits)-1)-i):
			print("palindrome")
			return
		if list_of_digits[i] != list_of_digits[(len(list_of_digits)-1)-i]:
			print("not palindrome")
			return
	print("palindrome")


pali_num(123321)
pali_num(123456)
pali_num(5656565)
pali_num(2580852)
pali_num(12)
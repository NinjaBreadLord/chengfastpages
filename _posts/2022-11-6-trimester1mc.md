---
toc: true
layout: post
title: Trimester 1 Mc
description: Review of my multiple choice exam
---
# AP 2014 MC Reflection + Corrections

## Score 32/40 
* Honestly a 32 out of 40 is fine with me, it barely makes the cutoff for a an 80%. However, I hope that my timing improves and thinking may speed up. Since starting, it took me around two hours to complete the entire thing. For most of the questions I had to use a pen and paper to consider each process, and then really think about it. Seeing how I got a 32/40 with the amount of time I put in, I think that I should really be doing better. I think my main problem is learning to understand large pieces of code(as in putting missing pieces or analyzing certain lines), and I hope that I may focus on that aspect in future tests. 

> Corrections

### Question 4

![image](https://user-images.githubusercontent.com/89239598/200256234-67ef248a-cf2f-4734-a0e3-6311526ff892.png)

* I incorrectly chose the floated value instead of the value that fits the integer primitive. The answer 2.333 should be rounded down to 2. 

### Question 10 

![image](https://user-images.githubusercontent.com/89239598/200256293-daaa3171-f493-461e-a220-56681d733322.png)

* Choice 1(A) would actually work as it returns value 0 from the function seqSearchRecHelper. Choice 2(B) would be the correct answer as if the data does contain the value 5, the function would instead return -1 creating an out of bounds error.

### Question 14

![image](https://user-images.githubusercontent.com/89239598/200256362-a983e766-96f6-47e1-9d6d-d7e62ebebd0b.png)

* Because of the usage of an enhanced for each loop, there is no need for the method .get does not need to be used making answer choice D wrong. ```v.getMileage()``` would be better as it only uses the variable "v" and nothing else, which is the proper way in using an enhanced loop. 

### Question 15
 
![image](https://user-images.githubusercontent.com/89239598/200256409-bbf93c1d-cae1-4c96-8e1d-eec4a0b542df.png)

* My selected answer(D) is incorrect because choice two does not work. Choice two provides ```data[k + 1]``` which would create an out of bounds error on the last part of the array. Choice 1 is correct, and therefore choice A would be correct. 

### Question 17

![image](https://user-images.githubusercontent.com/89239598/200256451-e8f1d220-d24d-4a27-af32-2f4806171438.png)

* Choice D is incorrect as the last value of the array will not be affected by the for loop as the for loop iterates through the length of the loop minus 1. Choice C would be better as it displays the correct final value of 7. 

### Question 19 (Review Demorgan's Law)

![image](https://user-images.githubusercontent.com/89239598/200256503-3a97e22d-3f6a-41bd-bf47-88fa5034c4a6.png)

* ```!(!(a != b))``` would just be ```(a != b)```, not ```(a==b)``` which was my selected answer. B would be a better choice because it contains the proper change through DeMorgan's Law. 

### Question 23 (Review)

![image](https://user-images.githubusercontent.com/89239598/200256558-200cf81e-1ec3-4fa3-a5f0-93cf001e7537.png)

* Here baboon would actually be inserted at the end of the array list as it begins with the letter 'b' and will be added at size-k which is at the end. From there, my order is correct in "bear" following "zebra" etc. I think I had a little trouble understanding the substring and remove commands, and thus need to look at it more in depth. 

### Question 33 

![image](https://user-images.githubusercontent.com/89239598/200256624-d4476df2-6cb5-446c-b5d9-08f3cb62fb67.png)

* Here is just a case of remembering the conditionals. This is an infinite loop as the condition k < 4 will never be satisfied. ```||``` means or, meaing that either one may work, which I forgot during the exam. 

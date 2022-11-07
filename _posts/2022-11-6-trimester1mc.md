# AP 2014 MC Reflection + Corrections

## Score 32/40 
* Honestly a 32 out of 40 is fine with me, it barely makes the cutoff for a an 80%. However, I hope that my timing improves and thinking may speed up. Since starting, it took me around two hours to complete the entire thing. For most of the questions I had to use a pen and paper to consider each process, and then really think about it. Seeing how I got a 32/40 with the amount of time I put in, I think that I should really be doing better. I think my main problem is learning to understand large pieces of code(as in putting missing pieces or analyzing certain lines), and I hope that I may focus on that aspect in future tests. 

> Corrections

### Question 4

image.png

* I incorrectly chose the floated value instead of the value that fits the integer primitive. The answer 2.333 should be rounded down to 2. 

### Question 10 

* Choice 1(A) would actually work as it returns value 0 from the function seqSearchRecHelper. Choice 2(B) would be the correct answer as if the data does contain the value 5, the function would instead return -1 creating an out of bounds error.

### Question 14

image.png

* Because of the usage of an enhanced for each loop, there is no need for the method .get does not need to be used making answer choice D wrong. v.getMileage() would be better as it only uses the variable "v" and nothing else, which is the proper way in using an enhanced loop. 

### Question 15
 
image.png

* My selected answer(D) is incorrect because choice two does not work. Choice two provides data[k + 1] which would create an out of bounds error on the last part of the array. Choice 1 is correct, and therefore choice A would be correct. 

### Question 17

image.png

* Choice D is incorrect as the last value of the array will not be affected by the for loop as the for loop iterates through the length of the loop minus 1. Choice C would be better as it displays the correct final value of 7. 

### Question 19 (Review Demorgan's Law)

image.png

* !(!(a != b)) would just be (a != b), not (a==b) which was my selected answer. B would be a better choice because it contains the proper change through DeMorgan's Law. 

### Question 23 (Review)

image.png

* Here baboon would actually be inserted at the end of the array list as it begins with the letter 'b' and will be added at size-k which is at the end. From there, my order is correct in "bear" following "zebra" etc. I think I had a little trouble understanding the substring and remove commands, and thus need to look at it more in depth. 

### Question 33 

image.png

* Here is just a case of remembering the conditionals. This is an infinite loop as the condition k < 4 will never be satisfied. || means or, meaing that either one may work, which I forgot during the exam. 
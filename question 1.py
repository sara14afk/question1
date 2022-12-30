numbers = [12,75,150,180,145,525,50]

for number in numbers:
    if number > 500:
        # If the number is greater than 500, stop the loop
        break
    if number > 150:
        # If the number is greater than 150, skip it and move to the next number
        continue
    if number % 5 == 0:
        # If the number is divisible by five, display it
        print(number)
